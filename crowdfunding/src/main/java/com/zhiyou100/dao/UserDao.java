package com.zhiyou100.dao;

import com.zhiyou100.entity.User;

public interface UserDao {
    public User getOneByUname(String uname);
}
