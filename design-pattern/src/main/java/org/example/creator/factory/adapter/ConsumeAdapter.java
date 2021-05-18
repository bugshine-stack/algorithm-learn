package org.example.creator.factory.adapter;

public interface ConsumeAdapter {

    default void consume(String line) {
        System.out.println("default consume: " + line);
    }

    default void save(String line) {
        System.out.println("default save: " + line);
    }
}
