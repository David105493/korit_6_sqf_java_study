package com.study.java_study.ch04_제어;

public class Star {
    public static void main(String[] args) {
        int n = 10;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < (i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - 1 - i; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < i + 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < n - i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - 1 - i; j++) {
                    System.out.print(" ");
            }
            for(int k = 0; k < (i + 1) * 2 - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
