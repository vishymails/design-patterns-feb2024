package com.bvr.behavioral.visitor;

public class DocumentStatsVisitor implements DocumentVisitor{
    private int paragraphCount = 0;
    private int headingCount = 0;
    private int imageSize = 0;

    @Override
    public void visit(Paragraph paragraph) {
        paragraphCount++;
    }

    @Override
    public void visit(Heading heading) {
        headingCount++;
    }

    @Override
    public void visit(Image image) {
        imageSize += image.getSize();
    }

    public void printStats() {
        System.out.println("Paragraphs: " + paragraphCount);
        System.out.println("Headings: " + headingCount);
        System.out.println("Images: " + imageSize);
    }
}
