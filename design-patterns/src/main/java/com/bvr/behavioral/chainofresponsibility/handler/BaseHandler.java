package com.bvr.behavioral.chainofresponsibility.handler;

public class BaseHandler implements Handler {

    private Handler handler;

    @Override
    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void execute() {
        if(handler != null){
            handler.execute();
        }
    }
}
