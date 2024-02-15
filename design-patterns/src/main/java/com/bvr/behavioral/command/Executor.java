package com.bvr.behavioral.command;

import java.util.Queue;

public class Executor {

    public void execute(Queue<Command> commands){
        for(Command command: commands){
            command.execute();
        }
    }
}
