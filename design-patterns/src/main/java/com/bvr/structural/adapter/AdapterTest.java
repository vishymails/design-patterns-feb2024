package com.bvr.structural.adapter;

import com.bvr.structural.adapter.adapter.JsonAdapter;
import com.bvr.structural.adapter.model.XmlModel;
import com.bvr.structural.adapter.provider.JsonProvider;
import com.bvr.structural.adapter.provider.XmlProvider;
import com.bvr.structural.adapter.adapter.XmlAdapter;
import com.bvr.structural.adapter.model.JsonModel;

public class AdapterTest {

    private static String getJsonFromXml(XmlModel xmlModel) {
        JsonAdapter jsonAdapter = new JsonAdapter();
        JsonProvider jsonProvider = new JsonProvider();
        return jsonProvider.getJsonContent(jsonAdapter.adaptXmlToJson(xmlModel));
    }

    private static String getXmlFromJson(JsonModel jsonModel) {
       XmlProvider xmlProvider = new XmlProvider();
       XmlAdapter xmlAdapter = new XmlAdapter();
       return xmlProvider.getXmlModelContent(xmlAdapter.adaptJsonToXml(jsonModel));
    }

    public static void main(String[] args) {
        XmlModel xmlModel = new XmlModel("<format>xml data from adapter </format>");
        System.out.println(getJsonFromXml(xmlModel));
        JsonModel jsonModel = new JsonModel("{ format : json data from adapter}");
        System.out.println(getXmlFromJson(jsonModel));
    }
}
