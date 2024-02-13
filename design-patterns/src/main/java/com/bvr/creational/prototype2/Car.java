package com.bvr.creational.prototype2;

public class Car extends Vehicle {
    private String color;

    public Car(int Wheels, long Price, String Color) {
        this.wheels = Wheels;
        this.price = Price;
        this.color = Color;
    }

    public Car(Car target) {
        super(target);
        if (target != null) {
            this.color = target.color;
        }
    }

    @Override
    public Vehicle clone() {
        return new Car(this);
    }

    @Override
    public boolean isClone(Vehicle target) {

        if (target instanceof Car) {
            Car car = (Car) target;
            if (color == car.color && wheels == car.wheels && price == car.price) {
                System.out.println(this + " is a clone of " + car);
                return true;
            }
        }
        System.out.println(this + " is not a clone of " + target);
        return false;
    }

    @Override
    public String toString() {
        return "Car{" + "wheels=" + wheels + ", price=" + price + ", color=" + color + '}';
    }
}
