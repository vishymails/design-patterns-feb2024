package com.bvr.behavioral.visitor;

public class VisitorTest {
    public static void main(String[] args) {
        Document document = new Document();
        document.addElement(new Heading());
        document.addElement(new Paragraph());
        document.addElement(new Image(200));

        document.addElement(new Heading());
        document.addElement(new Paragraph());
        document.addElement(new Image(200));

        document.addElement(new Heading());
        document.addElement(new Paragraph());
        document.addElement(new Image(200));

        DocumentVisitor visitor = new DocumentStatsVisitor();
        document.accept(visitor);

        ((DocumentStatsVisitor) visitor).printStats();

    }
}
