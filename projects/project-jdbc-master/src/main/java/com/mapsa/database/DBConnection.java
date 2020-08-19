package com.mapsa.database;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author Esmaeil Sadeghi, 8/5/20 4:47 PM
 */
public class DBConnection {
    private String dbDriver;
    private String dbUser;
    private String dbPass;
    private String dbUrl;

    public DBConnection() {
    }

    private Connection connection;

    private static DBConnection dbConnection = null;

    public Connection getConnection() throws IOException {
        File file = new File("src/main/resources/application.properties");
        Properties properties = new Properties();
        properties.load(new FileInputStream(file));
        this.dbDriver = properties.getProperty("driver");
        this.dbUser = properties.getProperty("user");
        this.dbPass = properties.getProperty("pass");
        this.dbUrl = properties.getProperty("url");
        try {
            Class.forName (dbDriver);
            connection = DriverManager.getConnection(dbUrl, dbUser, dbPass);
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return connection;
    }

    public static DBConnection getInstance() {
        if (dbConnection == null) {
            synchronized (DBConnection.class) {
                dbConnection = new DBConnection();
            }
        }
        return dbConnection;
    }

}
