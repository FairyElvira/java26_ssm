package com.zhiyou100.service;

import com.zhiyou100.entity.User;

public interface UserService {

    public User login(String uname, String upwd);
    public User logout(int uid);
}
