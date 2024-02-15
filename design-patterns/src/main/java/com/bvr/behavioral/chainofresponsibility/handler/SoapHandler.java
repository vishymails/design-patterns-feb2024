package com.bvr.behavioral.chainofresponsibility.handler;

public class SoapHandler extends BaseHandler{

            @Override
            public void execute() {
                System.out.println("Soap Handler");
                super.execute();
            }

}
