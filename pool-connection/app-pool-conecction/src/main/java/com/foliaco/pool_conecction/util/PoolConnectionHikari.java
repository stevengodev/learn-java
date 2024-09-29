package com.foliaco.pool_conecction.util;

import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class PoolConnectionHikari {

    private static String url = "jdbc:mysql://localhost:3306/prueba";
    private static String user = "root";
    private static String pass = "";
    public static HikariDataSource pool;

    public static HikariDataSource getPool() {

        if (pool == null) {
            pool = new HikariDataSource();
            pool.setJdbcUrl(url);
            pool.setUsername(user);
            pool.setPassword(pass);
            pool.setConnectionTimeout(30000);
            pool.setMinimumIdle(3);
            pool.setMaximumPoolSize(20);
        }

        return pool;

    }

    public static Connection getConnection() throws SQLException {
        return getPool().getConnection();
    }


}
