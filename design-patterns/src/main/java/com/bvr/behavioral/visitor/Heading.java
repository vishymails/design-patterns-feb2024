package com.bvr.behavioral.visitor;

public class Heading implements DocumentElement{

        @Override
        public void accept(DocumentVisitor visitor) {
            visitor.visit(this);
        }
}
