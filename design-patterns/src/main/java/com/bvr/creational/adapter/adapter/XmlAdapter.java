package com.bvr.creational.adapter.adapter;

import com.bvr.creational.adapter.model.JsonModel;
import com.bvr.creational.adapter.model.XmlModel;
public class XmlAdapter {

    public XmlModel adaptJsonToXml(JsonModel jsonModel) {
        String xmlContent = jsonModel.getJsonContent()
                .replace("Format { format : ", "")
                .replace(" }", "");
        return new XmlModel(String.format("<format>%s</format>", xmlContent));
    }
}
