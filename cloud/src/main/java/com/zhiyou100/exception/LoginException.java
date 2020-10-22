package com.zhiyou100.exception;

public class LoginException extends RuntimeException{
    public LoginException(String message){
        super(message);
    }
}