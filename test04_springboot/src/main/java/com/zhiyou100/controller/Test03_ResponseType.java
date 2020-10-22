package com.zhiyou100.controller;

import com.zhiyou100.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;

/**
 * @program: java26_ssm
 * @description:
 * @author: 作者
 * @create: 2020-10-19 14:27
 */
@Controller
@RequestMapping("/test03")
public class Test03_ResponseType {

    //        :   a  响应一个字符串
    @RequestMapping("/m1.action")
    @ResponseBody
    public String test01Method(){
        return "success";
    }
    //        ：b  响应一个页面的逻辑路径/真实路径
    @RequestMapping("/m2.action")
    public String test02Method(){
        return "/index.html";
    }
    //        ：c  响应一个modelandview
    @RequestMapping("/m3.action")
    public ModelAndView test03Method(){
        ModelAndView view=new ModelAndView();
        view.setViewName("/index.html");
        return view;
    }
    //        ：d 响应一个json串
    @RequestMapping("/m4.action")
    @ResponseBody
    public Student test04Method(){
        Student s=new Student();s.setAge(11);s.setName("韩梅梅");
        return s;
    }
    //        ：e voids        @RequestMapping("/m1.action")
    @RequestMapping("/m5.action")
    public void test05Method(HttpServletResponse resp)throws Exception{
        resp.getWriter().print("success");
    }
}
