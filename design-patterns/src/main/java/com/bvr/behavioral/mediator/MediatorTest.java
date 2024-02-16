package com.bvr.behavioral.mediator;

public class MediatorTest {

    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        Person john = new Person("John");
        Person jane = new Person("Jane");

        chatRoom.join(john);
        chatRoom.join(jane);

        john.say("Hi room");
        jane.say("Oh, hey John");

        Person simon = new Person("Simon");
        chatRoom.join(simon);
        simon.say("Hi everyone!");

        jane.privateMessage("Simon", "Glad you could join us!");


    }
}
