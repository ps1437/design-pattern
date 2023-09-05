package com.syscho.pattern.structural.adapter;

public class XmlToJsonAdaptor implements JsonData {

    private final XmlData xmlData;

    XmlToJsonAdaptor(XmlData xmlData) {
        this.xmlData = xmlData;
    }

    @Override
    public void readJsonData() {
        xmlData.readXMlData();
        System.out.println("Conveter xml to Json");
    }
}
