package com.bvr.creational.prototype;

public class PrototypePatternTest {

    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype("Prototype property");


        ConcretePrototype clone1 = (ConcretePrototype) prototype.clone();
        clone1.setProperty("New property- object 1");
        System.out.println(clone1.getProperty());

        ConcretePrototype clone2 = (ConcretePrototype) prototype.clone();
        clone2.setProperty("New property - object2 ");
        System.out.println(clone2.getProperty());





    }
}
