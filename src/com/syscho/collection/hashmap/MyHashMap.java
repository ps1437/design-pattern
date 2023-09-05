package com.syscho.collection.hashmap;

public class MyHashMap<K, V> {

    private static final int DEFAULT_INITIAL_CAPACITY = 1 << 4; // aka 16
    private static final int MAXIMUM_CAPACITY = 1 << 30;
    private final transient Entry[] table;
    private int size;

    public int getSize() {
        return table.length;
    }

    MyHashMap() {
        table = new Entry[DEFAULT_INITIAL_CAPACITY];
    }

    MyHashMap(int capacity) {
        table = new Entry[tableSizeFor(capacity)];
    }

    private static final int tableSizeFor(int cap) {
        int n = -1 >>> Integer.numberOfLeadingZeros(cap - 1);
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }

    public void put(K k, V v) {

        int hashValue = k.hashCode() % table.length;
        Entry node = table[hashValue];

        if (node == null) {
            Entry newEntry = new Entry(k, v);
            table[hashValue] = newEntry;
        } else {

            Entry previousNode = node;

            while (node != null) {
                if (node.key == k) {
                    node.value = v;
                    return;
                }
                previousNode = node;
                node = node.next;
            }
            Entry newEntry = new Entry(k, v);
            previousNode.next = newEntry;
        }

    }

    public V get(K k) {
        int hashCode = k.hashCode() % table.length;
        Entry node = table[hashCode];

        while (node != null) {
            if (node.key.equals(k)) {
                return (V) node.value;
            }

            node = node.next;
        }
        return null;

    }

    class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next;

        Entry(K k, V value) {
            this.key = k;
            this.value = value;
        }

    }

}
