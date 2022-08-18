package com.myshejimoshi.adapter.demo2;

public class SDAdapterTF implements SDCard {

    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("adapter read tfcard");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tfcard");
        tfCard.writeTF(msg);
    }
}
