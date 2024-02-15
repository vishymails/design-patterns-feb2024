package com.bvr.behavioral.command;

public class UndoCommand implements Command{

        @Override
        public void execute(){
            System.out.println("Undoing last command");
        }
}
