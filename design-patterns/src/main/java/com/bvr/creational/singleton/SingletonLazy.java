package com.bvr.creational.singleton;

public class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}

class SingletonLazyDemo {
    public static void main(String[] args) {
        SingletonLazy singletonLazy = SingletonLazy.getInstance();
        SingletonLazy singletonLazy1 = SingletonLazy.getInstance();
        System.out.println(singletonLazy.hashCode());
        System.out.println(singletonLazy1.hashCode());
    }
}

