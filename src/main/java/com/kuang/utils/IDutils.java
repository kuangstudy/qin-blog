package com.kuang.utils;

import java.util.UUID;

public class IDutils {

    public static String getUUID(){
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

}
