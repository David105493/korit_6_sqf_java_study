package com.study.java_study.ch07_클래스02.접근지정자;

import com.study.java_study.ch07_클래스02.StudyB;

public class AccessMain {
    private String test;

    public void printTest() {
        System.out.println(test);
    }

    public static void main(String[] args) {
        StudyB b = new StudyB("김준일", 31);
        b.show();
        b.setName("김준이");
        System.out.println(b.getName());

        AccessMain accessMain = new AccessMain();
        accessMain.printTest();
        accessMain.test = "테스트";
    }
}
