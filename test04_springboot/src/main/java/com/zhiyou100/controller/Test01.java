package com.zhiyou100.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: java26_ssm
 * @description:
 * @author: 作者
 * @create: 2020-10-19 11:27
 */
@Controller
@RequestMapping("/test01")
public class Test01 {
    @RequestMapping("/m1.action")
    @ResponseBody
    public String test01Method(Integer age,String name){
        return name+":::"+age;
    }
}
