package com.bvr.creational.factorymethod;

public class ShapeFactory {
    public Shape getFood(String foodType) {
        if (foodType == null) {
            return null;
        }
       switch(foodType){
           case "Round":
               return new Pizza();
           case "Cylinder":
               return new Burrito();
               default: throw new IllegalArgumentException("Invalid food type");
       }
    }

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getFood("Round");
        System.out.println(shape.getShape());
        Shape shape1 = shapeFactory.getFood("Cylinder");
        System.out.println(shape1.getShape());
    }

}
