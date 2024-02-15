package com.bvr.behavioral.observer2.editor;

public class FileManager {

    private EventManager eventManager;

    public FileManager(EventManager eventManager) {
        this.eventManager = eventManager;
    }

    public void openFile() {
        eventManager.notifyAll("Open file ");
        eventManager.notifyByEmail("Try to Open file ");
        eventManager.notifyByLogging("log : debug : Try to Open file ");
    }

    public void saveFile() {
        eventManager.notifyAll("Save file ");
        eventManager.notifyByEmail("Try to Save file ");
        eventManager.notifyByLogging("log : debug : Try to Save file ");
    }

    public void closeFile() {
        eventManager.notifyAll("Close file ");
        eventManager.notifyByEmail("Try to Close file ");
        eventManager.notifyByLogging("log : debug : Try to Close file ");

    }

    public void deleteFile() {
        eventManager.notifyAll("Delete file ");
        eventManager.notifyByEmail("Try to Delete file ");
        eventManager.notifyByLogging("log : debug : Try to Delete file ");
    }

    public void createDirectory() {
        eventManager.notifyAll("Create Directory ");
        eventManager.notifyByEmail("Try to Create Directory ");
        eventManager.notifyByLogging("log : debug : Try to Create Directory ");
    }

    public void deleteDirectory() {
        eventManager.notifyAll("Delete Directory ");
        eventManager.notifyByEmail("Try to Delete Directory ");
        eventManager.notifyByLogging("log : debug : Try to Delete Directory ");
    }
}
