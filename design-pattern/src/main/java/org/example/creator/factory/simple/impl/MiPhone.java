package org.example.creator.factory.simple.impl;

import org.example.creator.factory.simple.Phone;

public class MiPhone implements Phone {

    @Override
    public void make() {
        System.out.println("make mi phone ... ");
    }
}
