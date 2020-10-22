package com.zhiyou100.dao;

import com.zhiyou100.entity.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UserMapper {

    //登陆
    @Select("select * from tab_user where uname=#{uname}")
    User  getOneByUname(String uname);
    @Update("update tab_user set ustatus=1 where uid=#{uid}")
    int  updateUstatusIn(int uid);

    //登出
    @Update("update tab_user set ustatus=0 where uid=#{uid}")
    int  updateUstatusOut(int uid);

    int deleteByPrimaryKey(Integer uid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}