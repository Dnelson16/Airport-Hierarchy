package com.solvd.ConnectionPool;

public class Connection {
    private static int counter = 0;
    private int id;

    public Connection() {
        id = ++counter;
    }

    public int getId() {
        return id;
    }
}
