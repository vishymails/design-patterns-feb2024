package com.bvr.behavioral.observer2;

import com.bvr.behavioral.observer2.Listener.EmailListener;
import com.bvr.behavioral.observer2.editor.EventManager;
import com.bvr.behavioral.observer2.editor.FileManager;
import com.bvr.behavioral.observer2.Listener.LoggingListener;


public class Observer2Test {

    public static void main(String[] args) {
        EventManager eventManager = new EventManager();

        EmailListener emailListener = new EmailListener();
        LoggingListener loggingListener = new LoggingListener();

        eventManager.subscribe(emailListener);
        eventManager.subscribe( loggingListener);


        FileManager fileManager = new FileManager(eventManager);
        fileManager.createDirectory();
        fileManager.openFile();
        fileManager.saveFile();

        eventManager.unsubscribe(emailListener);
        fileManager.deleteFile();
        fileManager.deleteDirectory();

        eventManager.subscribe(emailListener);
        eventManager.unsubscribe(loggingListener);
        fileManager.openFile();



    }

}
