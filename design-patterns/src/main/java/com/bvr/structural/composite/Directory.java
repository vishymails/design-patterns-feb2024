package com.bvr.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> components;

    public Directory(String name) {
        this.name = name;
        components = new ArrayList<FileSystemComponent>();
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    public void removeComponent(FileSystemComponent component) {
        components.remove(component);
    }

    public void showDetails(String indent) {
        System.out.println(indent + "|--Directory :" + name);
        for (FileSystemComponent component : components) {
            component.showDetails(indent + "   ");
        }
    }
}
