package com.syscho.pattern.structural.composite;

public class FileSystemClient {
    public static void main(String[] args) {

        Directory directory = new Directory("C:/praveen");

        FileSystem fileSystem = new File("abc.txt");
        FileSystem fileSystem2 = new File("bbc.txt");

        directory.addFile(fileSystem);
        directory.addFile(fileSystem2);

        Directory directory2 = new Directory("d:/soni");
        directory2.addFile(new File("goffy.text"));

        directory.addFile(directory2);


        directory.ls();

    }
}
