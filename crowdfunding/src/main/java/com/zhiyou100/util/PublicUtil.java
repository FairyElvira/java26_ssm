package com.zhiyou100.util;

import sun.misc.BASE64Encoder;

import java.security.MessageDigest;

/**
 * @program: java26_ssm
 * @description: 密码工具类
 * @author: 作者
 * @create: 2020-10-09 13:16
 */
public class PublicUtil {

    private static String key="abc123";//指定key的值
    public static String EncoderByMd5(String str) throws Exception {
        //确定算法
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        BASE64Encoder base64en = new BASE64Encoder();
        //加密后的字符串
        String newstr = base64en.encode(md5.digest((str+key).getBytes("utf-8")));
        return newstr;
    }
    public static void main(String[] args)throws Exception {
        System.out.println(EncoderByMd5("123"));
    }
}
