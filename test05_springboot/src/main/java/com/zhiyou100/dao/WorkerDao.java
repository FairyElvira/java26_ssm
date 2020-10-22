package com.zhiyou100.dao;

import com.zhiyou100.entity.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @program: java26_ssm
 * @description:
 * @author: 作者
 * @create: 2020-10-20 17:12
 */
@Repository
public class WorkerDao {
    //spring容器已经定义好了JdbcTemplate的bean
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //通过BeanPropertyRowMapper来获取一个对象
    public Worker getOneByWid(int wid) {
        BeanPropertyRowMapper<Worker> bean = new BeanPropertyRowMapper<>(Worker.class);
        String sql = "select w_id id,w_name name,w_salary salary from tab_worker where w_id=?";
        try {
            return jdbcTemplate.queryForObject(
                    sql, bean, wid);
        } catch (Exception e) {
            return null;
        }

    }

    //自定义一个RowMapper来获取一个对象
    public Worker getOneByWid2(int wid) {
        RowMapper<Worker> mapper = new RowMapper<Worker>() {
            @Nullable
            @Override
            public Worker mapRow(ResultSet resultSet, int i) throws SQLException {
                return new Worker(resultSet.getInt("w_id"), resultSet.getString("w_name"), resultSet.getFloat("w_salary"));
            }
        };
        return jdbcTemplate.queryForObject("select * from tab_worker where w_id=?", mapper, wid);
    }

    public List<Worker> getAll() {
        BeanPropertyRowMapper bean = new BeanPropertyRowMapper(Worker.class);
        // jdbcTemplate.queryForObject()
        return jdbcTemplate.query("select w_id id,w_name name,w_salary salary from tab_worker", bean);
        // return jdbcTemplate.queryForList("select w_id id,w_name name,w_salary salary from tab_worker",bean);
    }

    public int insertOne(Worker w) {
        return jdbcTemplate.update("insert into tab_worker(w_name,w_salary) values(?,?)", w.getName(), w.getSalary());
    }

    public int updateOne(Worker w) {
        return jdbcTemplate.update("update tab_worker set w_name=?,w_salary=? where w_id=?", w.getName(), w.getSalary(), w.getId());
    }

    public int deleteOne(Integer wid) {
        return jdbcTemplate.update("delete from tab_worker where w_id=?", wid);
    }
}
