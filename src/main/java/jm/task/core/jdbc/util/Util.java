package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private Util() {

    }

    private static final String URL = "jdbc:mysql://localhost:3306/test_base";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "1z2x3c4v";

    private static Connection connection;

    public static Connection open() {
        try {
            if (connection == null) {
                connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            }
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
