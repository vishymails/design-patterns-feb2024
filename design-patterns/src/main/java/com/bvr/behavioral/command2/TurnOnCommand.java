package com.bvr.behavioral.command2;

//Concrete Command
public class TurnOnCommand implements Command{
    private final Device device ;

    public TurnOnCommand(Device device){
        this.device = device;
    }

    @Override
    public void execute(){
        device.turnOn();
    }

}



