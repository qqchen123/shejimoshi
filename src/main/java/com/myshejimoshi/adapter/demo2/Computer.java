package com.myshejimoshi.adapter.demo2;

public class Computer {
    public String readSD(SDCard sdCard){
        if (sdCard == null)
        {
            throw new NullPointerException("sd card is not null");
        }
        return sdCard.readSD();
    }
}
