package com.bvr.behavioral.command;

public class PasteCommand implements Command{

        @Override
        public void execute(){
            System.out.println("Pasting file");
        }
}
