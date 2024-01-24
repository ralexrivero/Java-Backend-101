package com.miaplicacion.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataConnect {
    private static final String URL = "jdbc:mysql://localhost:3306/EjemploJava";
    private static final String USER = "root";
    private static final String PASSWORD = "abcd1234";

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException | ClassNotFoundException ex) {
            System.err.println("Error de conexion: " + ex.getMessage());
            return null;
        }
    }
}
