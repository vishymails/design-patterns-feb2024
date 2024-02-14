package com.bvr.structural.flyweight.flyweight_factory;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class TreeTypeFactory {

    public List<TreeType> treeTypes;


    public TreeTypeFactory(){
        treeTypes = new ArrayList<>();
    }

    public TreeType getTreeType(String name, Color color, TreeType.Texture texture){
        TreeType foundedTreeType = treeTypes.stream()
                .filter(treeType -> treeType.name.equals(name) && treeType.texture.equals(texture))
                .findFirst()
                .orElse(null);

        if(foundedTreeType == null){
            foundedTreeType = new TreeType(name, color, texture);
            treeTypes.add(foundedTreeType);
            return foundedTreeType;
        }
        return foundedTreeType;

    }
}
