package org.example.creator.factory.simple;

public class App {

    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory();

        phoneFactory.registerPhoneClass("mi", "org.example.creator.factory.simple.impl.MiPhone");
        phoneFactory.registerPhoneClass("iphone", "org.example.creator.factory.simple.impl.IPhone");

        phoneFactory.makePhone("mi");
        phoneFactory.makePhone("mi");
        phoneFactory.makePhone("iphone");
        phoneFactory.makePhone("iphone");
        phoneFactory.makePhone("mi");
        phoneFactory.makePhone("org.example.creator.factory.simple.impl.HWPhone");
    }
}
