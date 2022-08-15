package com.myshejimoshi.builder.demo1;

public class MyTest {
    public static void main(String[] args) {
        Phone phone = new Phone.Builder()
                .cpu("intel")
                .memory("金士顿")
                .mainboard("华硕")
                .screen("小米")
                .build();
        System.out.println(phone);
    }
}
