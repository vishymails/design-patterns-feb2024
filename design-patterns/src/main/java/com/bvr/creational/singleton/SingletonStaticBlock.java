package com.bvr.creational.singleton;

public class SingletonStaticBlock {
    private static SingletonStaticBlock instance;

    private SingletonStaticBlock() {
    }

    static {
        try {
            instance = new SingletonStaticBlock();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static SingletonStaticBlock getInstance() {
        return instance;
    }



    public static void main(String[] args) {
        SingletonStaticBlock singletonStaticBlock = SingletonStaticBlock.getInstance();
        SingletonStaticBlock singletonStaticBlock1 = SingletonStaticBlock.getInstance();
        System.out.println(singletonStaticBlock.hashCode());
        System.out.println(singletonStaticBlock1.hashCode());
    }
}
