package com.bvr.structural.flyweight;

import com.bvr.structural.flyweight.flyweight_factory.TreeType;
import com.bvr.structural.flyweight.flyweight_factory.TreeTypeFactory;

import java.util.ArrayList;
import java.util.List;
import java.awt.Color;

public class Forest {

    private List<ForestTree> forestTrees;

    private TreeTypeFactory treeTypeFactory;

    public Forest(TreeTypeFactory treeTypeFactory){
        this.treeTypeFactory = treeTypeFactory;
        this.forestTrees = new ArrayList<>();
    }

    void plantTree(int x, int y, String name, Color color, TreeType.Texture texture) {
        TreeType treeType = treeTypeFactory.getTreeType(name, color, texture);
        forestTrees.add(new ForestTree(x, y, treeType));
    }

    void draw() {
//        for (ForestTree tree : forestTrees) {
//            tree.draw();
//        }

        forestTrees.forEach(ForestTree::draw);
    }
}
