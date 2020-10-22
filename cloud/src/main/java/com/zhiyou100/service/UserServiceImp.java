package com.zhiyou100.service;

import com.zhiyou100.dao.UserMapper;
import com.zhiyou100.entity.User;
import com.zhiyou100.exception.LoginException;
import com.zhiyou100.util.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: java26_ssm
 * @description:
 * @author: 作者
 * @create: 2020-10-10 21:07
 */
@Service
public class UserServiceImp  implements  UserService{

    @Autowired
    private UserMapper userMapper;
    @Override
    public User login(String uname, String upwd) {
        User dbUser=userMapper.getOneByUname(uname);
        if(dbUser==null){
            throw new LoginException("用户名错误！");
        }
        String upwdMD5= MD5.getInstance().getMD5(upwd);
        if(!dbUser.getUpwd().equals(upwdMD5)){
            throw new LoginException("密码错误！");
        }
        //更改状态
        userMapper.updateUstatusIn(dbUser.getUid());
        //dbUser=userMapper.selectByPrimaryKey(dbUser.getUid());
        dbUser.setUstatus(1);
        return dbUser;
    }
    @Override
    public User logout(int uid) {
        userMapper.updateUstatusOut(uid);
        User user=userMapper.selectByPrimaryKey(uid);
        return user;
    }
}
