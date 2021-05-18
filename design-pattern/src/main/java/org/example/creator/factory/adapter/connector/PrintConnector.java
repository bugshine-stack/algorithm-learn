package org.example.creator.factory.adapter.connector;

public class PrintConnector {

    public void cache(String line) {
        System.out.println("save? pass: " + line);
    }

    public void print(String line) {
        System.out.println("console print: " + line);
    }
}
