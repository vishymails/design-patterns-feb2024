package com.bvr.creational.factorymethod2;

public class Bike extends Vehicle{

        int wheel;

        Bike(int wheel){
            this.wheel = wheel;
        }

        @Override
        public int getWheel() {
            return this.wheel;
        }
}
