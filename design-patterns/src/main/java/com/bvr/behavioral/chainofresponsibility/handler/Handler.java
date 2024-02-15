package com.bvr.behavioral.chainofresponsibility.handler;

public interface Handler {

    void setHandler(Handler handler);

    void execute();
}
