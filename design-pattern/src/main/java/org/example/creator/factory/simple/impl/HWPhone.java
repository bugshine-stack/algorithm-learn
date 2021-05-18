package org.example.creator.factory.simple.impl;

import org.example.creator.factory.simple.Phone;

public class HWPhone implements Phone {

    @Override
    public void make() {
        System.out.println("make huawei phone ... ");
    }
}
