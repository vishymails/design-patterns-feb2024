package com.bvr.creational.adapter.provider;

import com.bvr.creational.adapter.model.XmlModel;

public class XmlProvider {
    public String getXmlModelContent(XmlModel xmlModel){
        return xmlModel.getXmlContent();
    }
}
