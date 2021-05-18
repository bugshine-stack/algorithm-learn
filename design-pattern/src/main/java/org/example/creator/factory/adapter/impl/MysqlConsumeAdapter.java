package org.example.creator.factory.adapter.impl;

import org.example.creator.factory.adapter.ConsumeAdapter;
import org.example.creator.factory.adapter.connector.MysqlConnector;

public class MysqlConsumeAdapter implements ConsumeAdapter {

    private MysqlConnector mysqlConnector = new MysqlConnector();

    @Override
    public void save(String line) {
        mysqlConnector.insert(line);
    }

    @Override
    public void consume(String line) {
        mysqlConnector.print(line);
    }
}
