package com.bvr.behavioral.visitor;

public class Paragraph implements DocumentElement{

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }
}
