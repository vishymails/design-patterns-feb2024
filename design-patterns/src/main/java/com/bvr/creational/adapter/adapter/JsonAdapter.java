package com.bvr.creational.adapter.adapter;

import com.bvr.creational.adapter.model.JsonModel;
import com.bvr.creational.adapter.model.XmlModel;

public class JsonAdapter {
    public JsonModel adaptXmlToJson(XmlModel xmlModel){
       String xmlContent = xmlModel.getXmlContent()
               .replace("<format>", "")
               .replace("</format>", "");
        return new JsonModel(String.format("Format { format : %s }", xmlContent));
    }
}
