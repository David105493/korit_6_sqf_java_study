package com.study.java_study.ch04_제어;

public class 조건문02 {
    public static void main(String[] args) {
        String text = new String("");
        String name = "김준일"; // 값의 자료형 String
        String phone = "01012345678";
        StringUtils stringUtils = new StringUtils();
        System.out.println(text);
        System.out.println(name);

        if(stringUtils.isEmpty(name)) {
            System.out.println("name이 비어있습니다.");
            return;
        }

        if(stringUtils.isEmpty(phone)) {
            System.out.println("phone이 비어있습니다.");
            return;
        }

        if(stringUtils.isEmpty(text)) {
            System.out.println("text이 비어있습니다.");
            return;
        }
    }
}