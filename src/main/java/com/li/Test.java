package com.li;

public class Test {
    public static void main(String[] args) {
        System.out.println("hello我");
        int a = 5;
        if (a > 5) {
            System.out.println("A > 5");
        } else {
            System.out.println("a=5");
        }
        for (int i = 0; i <100; i++) {
            if (i == 5){
                throw new NullPointerException();
            }
            System.out.println("第"+ i);
        }
    }
    }

