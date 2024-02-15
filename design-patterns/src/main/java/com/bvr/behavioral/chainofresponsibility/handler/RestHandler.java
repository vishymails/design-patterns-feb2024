package com.bvr.behavioral.chainofresponsibility.handler;

public class RestHandler extends BaseHandler{

        @Override
        public void execute() {
            System.out.println("Rest Handler");
            super.execute();
        }

}
