package com.stackroute.pe3;

public class ArrayOfPlace {

    public String[] place(String s[]) {
        for (int i = 0; i < s.length; i++) {
            String str=s[i].substring(1);
            str = str.replaceAll("[aeiou]", "");
            s[i] = s[i].substring(0, 1) + str;


        }
        return s;
    }
}