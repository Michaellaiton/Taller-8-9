package co.edu.sena.taller2michaellaiton.util;


import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL=
            "jdbc.mysql://localhost:3306/base?serverTimezone=America/Bogota";
    private static final String USER= "my_app_user";
    //Usuario y contraseña crearlos en mi casa, en xamm en mySQL
    private static final String PASS= "my_app_password";
    private static BasicDataSource pool;

    public static BasicDataSource getInstance()throws SQLException {
        if (pool == null) {
            pool = new BasicDataSource();
            pool.setUrl(URL);
            pool.setUsername(USER);
            pool.setPassword(PASS);

            pool.setInitialSize(3);
            pool.setMinIdle(3);
            pool.setMaxIdle(8);
            pool.setMaxTotal(8);
        }
        return pool;

    } //getConnectionToDatabase
    public static Connection getConnection () throws SQLException {
        return getInstance().getConnection();
    }
}