package co.edu.sena.taller2michaellaiton.connection_test;

import java.sql.*;

public class BasicConnectionSingleton {
    private static String url =
            "jdbc:mysql://localhost:3306/base?serverTimezone=America/Bogota";
    private static String user = "taller2michaellaiton";
    private static String pass = "taller2michaellaiton";
    private static Connection conn;
    public static Connection getInstance()
            throws SQLException {
        if (conn == null) {
            conn = DriverManager.getConnection(url, user,pass);
        }
        return conn;
    }
} // BasicConnectionSingleton
