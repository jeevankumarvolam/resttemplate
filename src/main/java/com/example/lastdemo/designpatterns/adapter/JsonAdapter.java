package com.example.lastdemo.designpatterns.adapter;

public class JsonAdapter implements IXmlProcessor {

    private JsonDataProvider jsonDataProvider;

    @Override
    public void processXml(String xmlData) {


    }

    public void convertJsonToXml(String Json) {
        //converted JSon to XML
        String xml = jsonDataProvider.fetchJsonData();
        processXml(xml);
    }
}
