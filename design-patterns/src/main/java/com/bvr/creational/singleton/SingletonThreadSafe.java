package com.bvr.creational.singleton;

public class SingletonThreadSafe {
    private static SingletonThreadSafe instance;

    private SingletonThreadSafe() {
    }

//    public static  SingletonThreadSafe getInstance() {
//        synchronized (SingletonThreadSafe.class) {
//            if (instance == null) {
//                instance = new SingletonThreadSafe();
//            }
//        }
//        return instance;
//    }
//

    public static synchronized SingletonThreadSafe getInstance() {
        if (instance == null) {
            instance = new SingletonThreadSafe();
        }
        return instance;
    }


    public static void main(String[] args) {
        SingletonThreadSafe singletonThreadSafe = SingletonThreadSafe.getInstance();
        SingletonThreadSafe singletonThreadSafe1 = SingletonThreadSafe.getInstance();
        System.out.println(singletonThreadSafe.hashCode());
        System.out.println(singletonThreadSafe1.hashCode());
    }
}
