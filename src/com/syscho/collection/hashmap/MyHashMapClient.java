package com.syscho.collection.hashmap;

import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.random.RandomGenerator;

public class MyHashMapClient {

    public static void main(String[] args) {
        MyHashMap<String, String> hashMap = new MyHashMap<>(2);

        for (int i = 0; i < 20; i++) {
            hashMap.put(RandomGenerator.getDefault().nextFloat()+"hel", "Apple");
        }
        ConcurrentHashMap das =  new ConcurrentHashMap();


        int size = hashMap.getSize();
        System.out.println(size);
        System.out.println(hashMap.get("A"));

    }
}
