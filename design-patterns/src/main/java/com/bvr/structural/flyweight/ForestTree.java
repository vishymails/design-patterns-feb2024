package com.bvr.structural.flyweight;

import com.bvr.structural.flyweight.flyweight_factory.TreeType;


public class ForestTree {

    private int x ;
    private int y ;

    private TreeType treeType;

    public ForestTree(int x, int y, TreeType treeType) {
        this.x = x;
        this.y = y;
        this.treeType = treeType;
    }

    public void draw() {
        System.out.println(String.format("%s %s %s - (%s, %s)", treeType.color, treeType.texture, treeType.name, x, y));
    }
}
