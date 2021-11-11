package com.minzu.testt;

import cn.hutool.crypto.digest.DigestUtil;

public class testMd5 {
    public static void main(String[] args) {
        String s = DigestUtil.md5Hex("woyizongheng");
        System.out.println(s);
    }
}
