package com.solvd.ConnectionPool;

import java.sql.Connection;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Semaphore;

public class ConnectionPool {
    private final Queue<Connection> pool;
    private static int MAX_POOL_SIZE = 5;
    private final Semaphore semaphore;

    private ConnectionPool() {
        // Initialize the connection pool
        pool = new LinkedList<>();
        semaphore = new Semaphore(MAX_POOL_SIZE);

        // Add connections to the pool
        for (int i = 0; i < MAX_POOL_SIZE; i++) {
        }
    }

    public static ConnectionPool getInstance() {
        return ConnectionPoolHolder.INSTANCE;
    }

    public CompletableFuture<Connection> getConnection() {
        CompletableFuture<Connection> future = new CompletableFuture<>();
        try {
            semaphore.acquire();
            Connection connection = pool.poll();
            if (connection != null) {
                future.complete(connection);
            } else {
                future.completeExceptionally(new IllegalStateException("Connection pool is empty"));
            }
        } catch (InterruptedException e) {
            future.completeExceptionally(e);
        }
        return future;
    }

    public void releaseConnection(Connection connection) {
        if (connection != null) {
            pool.offer(connection);
            semaphore.release();
        }
    }

    private static class ConnectionPoolHolder {
        private static final ConnectionPool INSTANCE = new ConnectionPool();
    }
}