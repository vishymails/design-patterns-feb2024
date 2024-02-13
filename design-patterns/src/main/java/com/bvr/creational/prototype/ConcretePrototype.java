package com.bvr.creational.prototype;

public class ConcretePrototype implements Prototype, Cloneable{
    private String property;

    public ConcretePrototype(String property) {
        this.property = property;
    }

    // copy constructor
    public ConcretePrototype(ConcretePrototype prototype) {
        this.property = prototype.property;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(this);
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }



}
