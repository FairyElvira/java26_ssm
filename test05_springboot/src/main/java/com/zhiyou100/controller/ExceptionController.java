package com.zhiyou100.controller;

import com.zhiyou100.entity.ResponseVO;
import com.zhiyou100.exception.WorkerException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: java26_ssm
 * @description: 创建一个处理所有自定义异常的controller
 * @author: 作者
 * @create: 2020-10-20 16:26
 */
@Controller
public class ExceptionController {

    @ExceptionHandler(WorkerException.class)
    @ResponseBody
    public ResponseVO<String> WorkerExceptionAdvice(WorkerException e){
        return new ResponseVO<>(4001,e.getMessage(),null);
    }
}
