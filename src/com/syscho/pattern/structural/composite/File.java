package com.syscho.pattern.structural.composite;

public class File implements FileSystem {

    private String fileName;

    File(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void ls() {
        System.out.println("FILE NAME : " + fileName);
    }
}
