package org.example.creator.factory.simple.impl;

import org.example.creator.factory.simple.Phone;

public class IPhone implements Phone {

    @Override
    public void make() {
        System.out.println("make iphone ... ");
    }
}
