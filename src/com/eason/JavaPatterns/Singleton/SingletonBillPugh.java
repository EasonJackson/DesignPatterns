package com.eason.JavaPatterns.Singleton;

public class SingletonBillPugh {
    private SingletonBillPugh() {

    }

    private static class SingletonBillPughHelper {
        private static SingletonBillPugh instance = new SingletonBillPugh();
    }

    public SingletonBillPugh getInstance() {
        return SingletonBillPughHelper.instance;
    }
}
