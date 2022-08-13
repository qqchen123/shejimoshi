package com.myshejimoshi.test2;

public class XijieHardDisk implements HardDisk{
    @Override
    public void save(String data) {
        System.out.println("使用希捷硬盘存储数据为："+data);
    }

    @Override
    public String get() {
        System.out.println("使用希捷硬盘读取数据");
        return "数据";
    }
}
