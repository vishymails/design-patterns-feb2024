package com.bvr.structural.adapter.adapter;

import com.bvr.structural.adapter.model.JsonModel;
import com.bvr.structural.adapter.model.XmlModel;
public class XmlAdapter {

    public XmlModel adaptJsonToXml(JsonModel jsonModel) {
        String xmlContent = jsonModel.getJsonContent()
                .replace("Format { format : ", "")
                .replace(" }", "");
        return new XmlModel(String.format("<format>%s</format>", xmlContent));
    }
}
