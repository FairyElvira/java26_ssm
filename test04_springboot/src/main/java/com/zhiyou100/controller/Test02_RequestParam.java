package com.zhiyou100.controller;

import com.zhiyou100.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @program: java26_ssm
 * @description:
 * @author: 作者
 * @create: 2020-10-19 14:25
 */
@Controller
@RequestMapping("/test02")
public class Test02_RequestParam {

    //    ​ ：a	单值类型的请求参数：接受同名的请求参数
    @RequestMapping("/m1.action")
    @ResponseBody
    public String test01Method(Integer age,String name){
        return name+":::::111+"+age;
    }
    //​     ：b	对象类型的请求参数：拿对象的属性来接受同名的请求参数
    @RequestMapping("/m2.action")
    @ResponseBody
    public String test02Method(Student s){
        return s.toString();
    }
    //​     ：d	httprequest/httpresponse
    @RequestMapping("/m4.action")
    public void test04Method(HttpServletRequest req, HttpServletResponse resp)throws Exception{
        System.out.println(req.getParameter("name")+"::::"+req.getParameter("age"));
        resp.getWriter().print("success");
    }

    //​      : e	model:作为reuquest的域对象
    //​      ：f     httpsession
    @RequestMapping("/m5.action")
    public void test05Method(HttpSession session, HttpServletResponse resp)throws Exception{
        resp.getWriter().print("success"+session.getId());
    }
}
