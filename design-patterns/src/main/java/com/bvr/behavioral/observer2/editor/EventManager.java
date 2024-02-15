package com.bvr.behavioral.observer2.editor;

import com.bvr.behavioral.observer2.Listener.EventListener;
import com.bvr.behavioral.observer2.Listener.EmailListener;
import com.bvr.behavioral.observer2.Listener.LoggingListener;

import java.util.ArrayList;
import java.util.List;


public class EventManager {
    private List<EventListener> listenerList = new ArrayList<>();

    public void subscribe(EventListener listener){
        listenerList.add(listener);
    }

    public void unsubscribe(EventListener listener){
        listenerList.remove(listener);
    }

    public void notifyAll(String data) {
        listenerList.forEach(listener -> listener.notify(data));
    }

    void notifyByEmail(String data) {
        listenerList.stream()
                .filter(listener -> listener instanceof EmailListener)
                .forEach(listener -> listener.notify(data));
    }

    void notifyByLogging(String data) {
        listenerList.stream()
                .filter(listener -> listener instanceof LoggingListener)
                .forEach(listener -> listener.notify(data));
    }

}
