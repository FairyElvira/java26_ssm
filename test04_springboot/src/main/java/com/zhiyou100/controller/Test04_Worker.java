package com.zhiyou100.controller;

import com.zhiyou100.entity.Worker;
import com.zhiyou100.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: java26_ssm
 * @description:
 * @author: 作者
 * @create: 2020-10-19 19:42
 */

@Controller
@RequestMapping("/worker")
public class Test04_Worker {

    @Autowired
    private WorkerService workerService;

    @GetMapping("/getAll.action")
    @ResponseBody
    public List<Worker> getAllMethod(){
        return workerService.getAllMethod();
    }
    @GetMapping("/getOne/{wid}.action")
    @ResponseBody
    public Worker  getOneMethod(@PathVariable("wid") Integer wid){
        return workerService.getOneMethod(wid);
    }

    @PostMapping("/addOne.action")
    @ResponseBody
    public String  addOneMethod(Worker w){
        return  "添加"+workerService.addOneMethod(w)+"行成功!";
    }
    @PutMapping("/updateOne.action")
    @ResponseBody
    public String  updateOneMethod(Worker w){
        return  "修改"+workerService.updateOneMethod(w)+"行成功!";
    }
    @DeleteMapping("/deleteOne/{wid}.action")
    @ResponseBody
    public String  daleteOneMethod(@PathVariable("wid") Integer wid){
        return  "删除"+workerService.deleteOneMethod(wid)+"行成功!";
    }
}
