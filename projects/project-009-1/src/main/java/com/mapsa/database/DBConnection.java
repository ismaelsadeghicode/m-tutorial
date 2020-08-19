package com.mapsa.database;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author Esmaeil Sadeghi, 8/7/20 9:35 AM
 */
public class DBConnection {
    private String driver;
    private String user;
    private String pass;
    private String url;

    public DBConnection() {
    }

    private Connection connection;

    private static DBConnection dbConnection = null;

    public Connection getConnection() throws IOException, ClassNotFoundException, SQLException {
//        File file = new File("/src/main/resources/application.properties");

        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("/src/main/resources/application.properties").getFile());
        InputStream inputStream = new FileInputStream(file);

        Properties properties = new Properties();
        properties.load(new FileInputStream(file));
        this.driver = properties.getProperty("driver");
        this.user = properties.getProperty("user");
        this.pass = properties.getProperty("pass");
        this.url = properties.getProperty("url");

        Class.forName("oracle.jdbc.OracleDriver");
        connection = DriverManager.getConnection(url, user, pass);
        System.out.println("connection successful");
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
