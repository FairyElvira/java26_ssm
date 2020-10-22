package com.zhiyou100.action;

import com.zhiyou100.entity.MyDirectory;
import com.zhiyou100.entity.ResponseEntity;
import com.zhiyou100.service.MyDirectoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: java26_ssm
 * @description:
 * @author: 作者
 * @create: 2020-10-10 22:23
 */
@Controller
@RequestMapping("/myDirectory")
public class MyDirectoryController {

    @Autowired
    private MyDirectoryService myDirectoryService;

    //打开文件夹
    @GetMapping("/open.action")
    @ResponseBody
    public ResponseEntity<List<MyDirectory>> openMethod(Integer did,Integer uid){
        return new ResponseEntity<>(200,"打开文件夹",myDirectoryService.getListByDid(did,uid));
    }
    //添加文件夹
    @PostMapping("/add.action")
    @ResponseBody
    public ResponseEntity<String> addMethod(MyDirectory myDirectory){
        myDirectoryService.addMyDirectory(myDirectory);
        return new ResponseEntity<>(200,"添加文件夹成功！",null);
    }

    //删除文件夹/文件
    @DeleteMapping("/delete/{did}.action")
    @ResponseBody
    public ResponseEntity<String> deleteMethod(@PathVariable("did") Integer did){
        myDirectoryService.deleteMyDirectory(did);
        return new ResponseEntity<>(200,"删除文件夹成功！",null);
    }
}
