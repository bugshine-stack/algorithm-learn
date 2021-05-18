package org.example.creator.factory.adapter.connector;

public class MysqlConnector {

    public void insert(String line) {
        System.out.println("insert into table ..., record is: " + line);
    }

    public void print(String line) {
        System.out.println("prepare insert mysql, print record: " + line);
    }
}
