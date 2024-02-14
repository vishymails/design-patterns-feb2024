package com.bvr.structural.proxy;

public class ProxyImage implements Image{
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println("Displaying Proxy Image" + fileName);
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
        System.out.println("Proxy Image Logged"  + fileName);
    }
}
