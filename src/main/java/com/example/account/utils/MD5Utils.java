package com.example.account.utils;

import sun.misc.BASE64Encoder;

import java.security.MessageDigest;

public class MD5Utils {

    /**利用MD5进行加密*/
    public static String EncoderByMd5(String str) {
        String newStr = null;
        try {
            //确定计算方法
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            BASE64Encoder base64en = new BASE64Encoder();
            //加密后的字符串
            newStr = base64en.encode(md5.digest(str.getBytes("utf-8")));
        }catch (Exception e){
            e.printStackTrace();
        }
        return newStr;
    }
}
