package com.myshejimoshi.test3;

public class ItCastSafetyDoor implements AntiTheft,FireProof{
    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireProof() {
        System.out.println("防火");
    }
}
