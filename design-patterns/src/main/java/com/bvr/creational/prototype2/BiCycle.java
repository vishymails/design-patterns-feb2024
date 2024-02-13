package com.bvr.creational.prototype2;

public class BiCycle extends Vehicle {

    private boolean cityBike;
    public BiCycle(int Wheels, long Price, boolean cityBike) {
        this.wheels = Wheels;
        this.price = Price;
        this.cityBike = cityBike;
    }

    public BiCycle(BiCycle target) {
        super(target);
        if (target != null) {
            this.cityBike = target.cityBike;
        }
    }

    @Override
    public Vehicle clone() {
        return new BiCycle(this);
    }

    @Override
    public boolean isClone(Vehicle target) {

        if (target instanceof BiCycle) {
            BiCycle biCycle = (BiCycle) target;
            if (cityBike == biCycle.cityBike && wheels == biCycle.wheels && price == biCycle.price) {
                System.out.println(this + " is a clone of " + biCycle);
                return true;
            }
        }
        System.out.println(this + " is not a clone of " + target);
        return false;
    }

    @Override
    public String toString() {
        return "BiCycle{" + "wheels=" + wheels + ", price=" + price + ", cityBike=" + cityBike + '}';
    }
}
