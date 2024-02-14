package com.bvr.creational.composite;

public class File implements FileSystemComponent {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public void showDetails(String indent) {
        System.out.println(indent + "|--File :" + name);
    }
}
