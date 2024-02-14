package com.bvr.structural.adapter.adapter;

import com.bvr.structural.adapter.model.JsonModel;
import com.bvr.structural.adapter.model.XmlModel;

public class JsonAdapter {
    public JsonModel adaptXmlToJson(XmlModel xmlModel){
       String xmlContent = xmlModel.getXmlContent()
               .replace("<format>", "")
               .replace("</format>", "");
        return new JsonModel(String.format("Format { format : %s }", xmlContent));
    }
}
