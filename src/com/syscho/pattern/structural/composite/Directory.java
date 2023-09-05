package com.syscho.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {

    private String directoryName;
    List<FileSystem> fileSystems;

    Directory(String directoryName) {
        this.directoryName = directoryName;
        this.fileSystems = new ArrayList<>();
    }

    void addFile(FileSystem fileSystem) {
        fileSystems.add(fileSystem);
    }

    @Override
    public void ls() {
        System.out.println("---------------------------------");
        System.out.println("Directory name : " + directoryName);

        fileSystems.forEach(fileSystem -> fileSystem.ls());
        System.out.println("---------------------------------");
    }
}
