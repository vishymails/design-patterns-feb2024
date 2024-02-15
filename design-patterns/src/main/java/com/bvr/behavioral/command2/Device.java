package com.bvr.behavioral.command2;

//Receiver
public class Device {

    private final String name;

    public Device(String name){
        this.name = name;
    }

    public void turnOn(){
        System.out.println(name + " is turned on");
    }

}
