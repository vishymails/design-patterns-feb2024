package com.bvr.structural.flyweight;

import com.bvr.structural.flyweight.flyweight_factory.TreeTypeFactory;
import com.bvr.structural.flyweight.flyweight_factory.TreeType.Texture;
import java.awt.Color;

public class FlyWeightTest {

    public static void main(String[] args) {
        //NORMAL APPROACH
//        TreeFactory treeFactory = new TreeFactory();
//        Tree tree1 = new Tree(1, 2, treeFactory.getTreeType("coniferous"));
//        Tree tree2 = new Tree(3, 4, treeFactory.getTreeType("coniferous"));
//        Tree tree3 = new Tree(5, 6, treeFactory.getTreeType("hardwood"));
//        Tree tree4 = new Tree(7, 8, treeFactory.getTreeType("hardwood"));
//        Tree tree5 = new Tree(9, 10, treeFactory.getTreeType("coniferous"));
//        Tree tree6 = new Tree(11, 12, treeFactory.getTreeType("coniferous"));
//        Tree tree7 = new Tree(13, 14, treeFactory.getTreeType("hardwood"));
//        Tree tree8 = new Tree(15, 16, treeFactory.getTreeType("hardwood"));
//        Tree tree9 = new Tree(17, 18, treeFactory.getTreeType("coniferous"));
//        Tree tree10 = new Tree(19, 20, treeFactory.getTreeType("coniferous"));

        TreeTypeFactory treeFactory = new TreeTypeFactory();
        Forest forest = new Forest(treeFactory);
        forest.plantTree(1, 2, "coniferous", Color.GREEN, Texture.coniferous);
        forest.plantTree(3, 4, "coniferous", Color.GREEN, Texture.coniferous);
        forest.plantTree(5, 6, "hardwood", Color.RED, Texture.hardwood);
        forest.plantTree(7, 8, "hardwood", Color.RED, Texture.hardwood);
        forest.plantTree(9, 10, "coniferous", Color.GREEN, Texture.coniferous);


        forest.draw();
    }
}
