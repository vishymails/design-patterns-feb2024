package com.bvr.creational.adapter.provider;

import com.bvr.creational.adapter.model.JsonModel;

public class JsonProvider {

    public String getJsonContent(JsonModel jsonModel){
        return jsonModel.getJsonContent();
    }

}
