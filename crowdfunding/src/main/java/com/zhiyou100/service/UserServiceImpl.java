package com.zhiyou100.service;

import com.zhiyou100.dao.UserDao;
import com.zhiyou100.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: java26_ssm
 * @description: 实现类
 * @author: 作者
 * @create: 2020-10-09 13:23
 */

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
    @Override
    public User getOneByUname(String uname) {
        return userDao.getOneByUname(uname);
    }
}
