package com.bvr.creational.adapter.model;

public class JsonModel {
    private String jsonContent;

    public JsonModel(String jsonContent){
        this.jsonContent = jsonContent;
    }

    public String getJsonContent(){
        return jsonContent;
    }
}
