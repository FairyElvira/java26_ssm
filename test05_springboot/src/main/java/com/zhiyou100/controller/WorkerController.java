package com.zhiyou100.controller;

import com.zhiyou100.entity.ResponseVO;
import com.zhiyou100.entity.Worker;
import com.zhiyou100.exception.WorkerException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: java26_ssm
 * @description: 创建controller进行测试
 * @author: 作者
 * @create: 2020-10-20 16:27
 */

@RequestMapping("/worker")
@Controller
public class WorkerController {

    @RequestMapping("/getOne.action")
    @ResponseBody
    public ResponseVO<Worker> getOneMethod(Integer id){
        if(id<0){
            throw new WorkerException("id不能为负数！");
        }
        return new ResponseVO<Worker>(200,"获取成功！",new Worker(id,"哈哈",12.3f));
    }
}
