package org.example.creator.factory.adapter.impl;

import org.example.creator.factory.adapter.ConsumeAdapter;
import org.example.creator.factory.adapter.connector.PrintConnector;

public class PrintConsumeAdapter implements ConsumeAdapter {

    PrintConnector printConnector = new PrintConnector();

    @Override
    public void save(String line) {
        printConnector.cache(line);

    }

    @Override
    public void consume(String line) {

        printConnector.print(line);
    }
}
