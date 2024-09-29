package com.foliaco.pool_conecction.util;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;

public class PoolConnectionDBCP {
    
    private static String url = "jdbc:mysql://localhost:3306/prueba";
    private static String user = "root";
    private static String pass = "";
    public static BasicDataSource pool;

    
    public static BasicDataSource getPool() throws SQLException {

        if (pool == null) {
            pool = new BasicDataSource();
            pool.setUrl(url);
            pool.setUsername(user);
            pool.setPassword(pass);
            pool.setMinIdle(3);
            pool.setMaxIdle(5);
            pool.setMaxTotal(20);
        }

        return pool;

    }

    public static Connection getConnection() throws SQLException{
        return getPool().getConnection();
    }



}
