package com.zhiyou.controller;

import com.zhiyou.entity.ApplicationRecord;
import com.zhiyou.service.ApplicationRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: java26_ssm
 * @description: 访客预约控制层
 * @author: 作者
 * @create: 2020-10-21 14:28
 */
@Controller
@RequestMapping("/applicationrecord")
public class ApplicationRecordController {

    @Autowired
    private ApplicationRecordService applicationRecordService;

    //查询全部
    @RequestMapping("/getAll.action")
    @ResponseBody
    public List<ApplicationRecord> getAllMethod(){
        return applicationRecordService.getAllMethod();
    }
    //查询一个
    @RequestMapping("/getOne.action")
    @ResponseBody
    public ApplicationRecord getOneByVidMethod(Integer vid){
        if (vid <0){
            System.out.println("错误!!!");
        }
        return applicationRecordService.getOneByVidMethod(vid);
    }
    //添加一个
    @PostMapping("/addOne.action")
    @ResponseBody
    public Integer addOneMethod(@RequestBody ApplicationRecord applicationRecord){
        return applicationRecordService.addOneMethod(applicationRecord);
    }

    //删除一个
    @DeleteMapping("/deleteOne.action")
    @ResponseBody
    public Integer deleteOneByVidMethod(Integer vid){
        return applicationRecordService.deleteOneByVidMethod(vid);
    }
    //修改一个
    @PutMapping("/updateOne.action")
    @ResponseBody
    public Integer updateOneByVidMethod(@RequestBody ApplicationRecord applicationRecord){
        return applicationRecordService.updateOneByVidMethod(applicationRecord);
    }
}
