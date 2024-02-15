package com.bvr.behavioral.chainofresponsibility;

import com.bvr.behavioral.chainofresponsibility.handler.SeleniumHanler;
import com.bvr.behavioral.chainofresponsibility.handler.SoapHandler;

import com.bvr.behavioral.chainofresponsibility.handler.Handler;
import com.bvr.behavioral.chainofresponsibility.handler.RestHandler;

public class ChainedTest {

    public static void main(String[] args) {
        Handler mainHandler = new RestHandler();
        SoapHandler soapHandler = new SoapHandler();

        mainHandler.setHandler(soapHandler);

        mainHandler.execute();

        mainHandler.setHandler(new SeleniumHanler());

        mainHandler.execute();
    }
}
