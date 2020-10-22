package com.zhiyou100.exception;

/**
 * @program: java26_ssm
 * @description: 异常类
 * @author: 作者
 * @create: 2020-10-20 16:26
 */
public class WorkerException extends  RuntimeException{
    public WorkerException(String message){
        super(message);
    }
}
