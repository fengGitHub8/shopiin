package com.zs.utils;

import java.util.UUID;

/**
 * @program: shopin
 * @description:
 * @author: FengYang
 * @create: 2019-06-22 11:58
 **/
public class TokenUtil {

    public static String getToken(){
        String token = UUID.randomUUID().toString().replaceAll("-", "");
        return token;
    }


}
