package com.itcast.test;

import java.util.Random;

public class Test02 {
    public static void main(String[] args) {
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int length = s.length();
        System.out.println(length);
        Random random = new Random();
        int i = random.nextInt(length);
        System.out.println(i);
        char c = s.charAt(i);
        System.out.println(c);
    }
}
