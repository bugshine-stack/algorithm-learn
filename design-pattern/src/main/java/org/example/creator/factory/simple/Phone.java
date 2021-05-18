package org.example.creator.factory.simple;

public interface Phone {

    default void make() {
        System.out.println("make default phone");
    }
}
