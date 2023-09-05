package com.syscho.pattern.structural.adapter;

public class Main {
    public static void main(String[] args) {

        XmlToJsonAdaptor xmlToJsonAdaptor = new XmlToJsonAdaptor(new XmlDataImpl());
        xmlToJsonAdaptor.readJsonData();

    }
}
