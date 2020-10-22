package com.zhiyou100.controller;

import com.zhiyou100.entity.ResponseEntity;
import com.zhiyou100.entity.User;
import com.zhiyou100.service.UserService;
import com.zhiyou100.util.PublicUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @program: java26_ssm
 * @description:
 * @author: 作者
 * @create: 2020-10-09 17:24
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/login.action")
    @ResponseBody
    public ResponseEntity<User> loginMethod(String uname, String upwd, HttpSession session)throws Exception{
        User dbUser=userService.getOneByUname(uname);
        if(dbUser==null){
            return new ResponseEntity<User>(4000,"用户名错误！",null);
        }
        //获取密码的md5值
        String upwdMd5= PublicUtil.EncoderByMd5(upwd);
        if(!dbUser.getUpwd().equals(upwd)){
            return new ResponseEntity<User>(4000,"密码错误！",null);
        }
        session.setAttribute("user",dbUser);
        return  new ResponseEntity<>(200,"登陆成功",dbUser);
    }
}
