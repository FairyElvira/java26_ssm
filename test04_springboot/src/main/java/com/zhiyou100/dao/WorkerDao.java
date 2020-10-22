package com.zhiyou100.dao;

import com.zhiyou100.entity.Worker;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface WorkerDao {

    List<Worker> getAllMethod();

    Worker getOneMethod(Integer wid);

    @Delete("delete from tab_worker where w_id=#{wid}")
    int deleteOneMethod(Integer wid);

    @Insert("insert into tab_worker(w_name,w_salary) values(#{wname},#{wsalary})")
    int addOneMethod(Worker w);

    @Update("update tab_worker set w_name=#{wname},w_salary=#{wsalary} where w_id=#{wid}")
    int updateOneMethod(Worker w);
}
