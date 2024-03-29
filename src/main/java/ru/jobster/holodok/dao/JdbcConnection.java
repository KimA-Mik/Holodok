package ru.jobster.holodok.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JdbcConnection {

    private static final Logger LOGGER =
            Logger.getLogger(JdbcConnection.class.getName());
    //private static Optional connection = Optional.empty();
    private static Connection connection = null;

    public static Connection getConnection() {
        if (connection == null) {
            String url = "jdbc:postgresql://localhost:5432/Holodok";
            String user = "postgres";
            String password = "0000";

            try {
                connection = DriverManager.getConnection(url, user, password);
                //connection = Optional.ofNullable(DriverManager.getConnection(url, user, password));
            } catch (SQLException ex) {
                LOGGER.log(Level.SEVERE, null, ex);
            }
        }

        return connection;
    }
}
