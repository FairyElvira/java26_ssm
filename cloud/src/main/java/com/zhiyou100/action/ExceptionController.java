package com.zhiyou100.action;

import com.zhiyou100.entity.ResponseEntity;
import com.zhiyou100.exception.DirectoryException;
import com.zhiyou100.exception.FileException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.security.auth.login.LoginException;

/**
 * @program: java26_ssm
 * @description: 全站异常处理的action
 * @author: 作者
 * @create: 2020-10-10 21:01
 */

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(FileException.class)
    @ResponseBody
    public ResponseEntity<String> FileExceptionAdvicor(FileException e){
        return new ResponseEntity<>(4001,e.getMessage(),null);
    }
    @ExceptionHandler(DirectoryException.class)
    @ResponseBody
    public ResponseEntity<String> DirectoryExceptionAdvicor(DirectoryException e){
        return new ResponseEntity<>(4001,e.getMessage(),null);
    }
    @ExceptionHandler(LoginException.class)
    @ResponseBody
    public ResponseEntity<String> LoginExceptionAdvicor(LoginException e){
        return new ResponseEntity<>(4000,e.getMessage(),null);
    }
}
