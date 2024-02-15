package com.bvr.behavioral.command;

public class CopyCommand implements Command{

    @Override
    public void execute(){
        System.out.println("Copying file");
    }

}
