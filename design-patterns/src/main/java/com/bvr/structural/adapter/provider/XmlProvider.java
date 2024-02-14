package com.bvr.structural.adapter.provider;

import com.bvr.structural.adapter.model.XmlModel;

public class XmlProvider {
    public String getXmlModelContent(XmlModel xmlModel){
        return xmlModel.getXmlContent();
    }
}
