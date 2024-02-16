package com.bvr.behavioral.visitor;

public interface DocumentElement {
    void accept(DocumentVisitor visitor);
}

