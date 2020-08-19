package com.mapsa;

import com.mapsa.database.DBConnection;

import java.io.IOException;
import java.sql.SQLException;

/**
 * @author Esmaeil Sadeghi, 8/7/20 9:34 AM
 */
public class Application {

    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        DBConnection.getInstance().getConnection();
    }
}
