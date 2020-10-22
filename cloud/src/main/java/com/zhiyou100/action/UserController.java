package com.zhiyou100.action;

import com.zhiyou100.entity.ResponseEntity;
import com.zhiyou100.entity.User;
import com.zhiyou100.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @program: java26_ssm
 * @description:
 * @author: 作者
 * @create: 2020-10-10 21:12
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping("/login.action")
    @ResponseBody
    public ResponseEntity<User> loginMethod(String uname, String upwd, HttpSession session){
        User dbuser=userService.login(uname,upwd);
        session.setAttribute("user",dbuser);
        return new ResponseEntity<>(200,dbuser.getUname()+"登陆成功",dbuser);
    }

    @PutMapping("/logout.action")
    @ResponseBody
    public ResponseEntity<User>  logoutMethod(Integer uid, HttpSession session){
        User dbuser=userService.logout(uid);
        session.invalidate();//清空session
        return new ResponseEntity<>(200,dbuser.getUname()+"退出成功",dbuser);
    }
}
