package com.myshejimoshi.singleton.demo6;

public class MyTest {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;
        System.out.println(instance == instance1);

    }
}
