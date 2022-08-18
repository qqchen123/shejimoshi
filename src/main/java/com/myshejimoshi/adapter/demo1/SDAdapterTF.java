package com.myshejimoshi.adapter.demo1;

public class SDAdapterTF extends TFCardImpl implements SDCard  {
    @Override
    public String readSD() {
        System.out.println("adapter read tfcard");
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tfcard");
        writeTF(msg);
    }
}
