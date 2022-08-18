package com.myshejimoshi.adapter.demo2;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        String readSD = computer.readSD(new SDCardImpl());
        System.out.println(readSD);
        System.out.println("===========");


        String readSD1 =computer.readSD(new SDAdapterTF(new TFCardImpl()));
        System.out.println(readSD1);

    }
}
