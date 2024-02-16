package com.bvr.behavioral.visitor;

public class Image implements DocumentElement  {
    private int size;

    public Image(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }
}
