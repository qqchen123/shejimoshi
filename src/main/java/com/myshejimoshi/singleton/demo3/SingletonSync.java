package com.myshejimoshi.singleton.demo3;

public class SingletonSync {
    private SingletonSync() {
    }

    private static SingletonSync instance;

    //线程安全
    public static synchronized SingletonSync getInstance() {
        if (instance == null) {
            instance = new SingletonSync();
        }
        return instance;
    }
}
