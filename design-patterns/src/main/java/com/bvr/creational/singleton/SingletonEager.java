package com.bvr.creational.singleton;

public class SingletonEager {
    private static final SingletonEager instance = new SingletonEager();

    private SingletonEager() {
    }

    public static SingletonEager getInstance() {
        return instance;
    }
}

class SingletonEagerDemo {
    public static void main(String[] args) {
        SingletonEager singletonEager = SingletonEager.getInstance();
        SingletonEager singletonEager1 = SingletonEager.getInstance();
        System.out.println(singletonEager.hashCode());
        System.out.println(singletonEager1.hashCode());
    }
}

