package org.example.creator.factory.simple;

import java.util.HashMap;
import java.util.Map;

public class PhoneFactory {

    private Map<String, String> ps = new HashMap<>();

    Phone makePhone(Class<? extends Phone> clazz) {
        return this.makePhone(clazz.getName());
    }

    Phone makePhone(String className) {
        try {
            Phone phone = (Phone) Class.forName(ps.getOrDefault(className, className)).newInstance();
            phone.make();
            return phone;
        } catch (InstantiationException | ClassNotFoundException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void registerPhoneClass(String name, String className) {
        ps.put(name, className);
    }
}
