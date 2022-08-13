package com.myshejimoshi.test1;

public class MyTest {
    public static void main(String[] args) {
        SougouInput sougouInput = new SougouInput();
//        DefaultSkin skin = new DefaultSkin();
        HeimaSkin skin = new HeimaSkin();
        sougouInput.setSkin(skin);
        sougouInput.display();
    }
}
