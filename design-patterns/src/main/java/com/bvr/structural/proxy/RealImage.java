package com.bvr.structural.proxy;

public class RealImage implements Image{
    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying Real Image" + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading real image" + fileName);
    }
}
