package com.study.java_study.ch03_함수;

public class FunctionMain03 {
    public static void main(String[] args) {
        Function03 fx = new Function03();
        fx.fx01(1234, "김준일", 31, "01012345678");

        Student student = new Student();
        student.studentCode = 5678;
        student.name = "홍길동";
        student.age = 40;
        student.phone = "01098765432";

        fx.fx02(student);
    }
}
