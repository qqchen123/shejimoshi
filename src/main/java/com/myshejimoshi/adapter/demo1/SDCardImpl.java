package com.myshejimoshi.adapter.demo1;

public class SDCardImpl implements SDCard {
    @Override
    public String readSD() {
        String msg = "SDCard read msg: hello world SD!";
        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SDCard write msg : " + msg);
    }
}
