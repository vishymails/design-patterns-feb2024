package com.bvr.behavioral.visitor;

public interface DocumentVisitor {
    void visit(Paragraph paragraph);
    void visit(Heading heading);
    void visit(Image image);
}
