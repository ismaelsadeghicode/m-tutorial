package com.mapsa;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Esmaeil Sadeghi, 8/6/20 12:35 PM
 */
class DBConnectionTest {

    private static DBConnection dbConnection;

    @BeforeClass
    public static void beforeClass() throws SQLException {
        dbConnection =  new DBConnection();
        dbConnection.openConnection();
    }

//    @Test
//    public void openConnection() throws SQLException {
//        dbConnection =  new DBConnection();
//        dbConnection.openConnection();
//    }

//    @Test
//    public void testQuery() throws SQLException {
//        dbConnection =  new DBConnection();
//        dbConnection.openConnection();
//
//        Statement statement = dbConnection.getConnection().createStatement();
//        ResultSet resultSet = statement.executeQuery("select * from PRODUCT");
//        while (resultSet.next()){
//            System.out.println(resultSet.getObject("ID"));
//            System.out.println(resultSet.getObject("PNAME"));
//            System.out.println(resultSet.getObject("PRICE"));
//            System.out.println(resultSet.getObject("CATEGORY"));
//            System.out.println(resultSet.getObject("MANFACTURER"));
//
//            System.out.println("**********************************************");
//        }
//    }

//    @Test
//    public void testToObject() throws SQLException {
//        dbConnection =  new DBConnection();
//        dbConnection.openConnection();
//
//        Statement statement = dbConnection.getConnection().createStatement();
//        ResultSet resultSet = statement.executeQuery("select * from PRODUCT");
//
//        List<Product> products = new ArrayList<>();
//        while (resultSet.next()){
//            Product product = new Product();
//            product.setInd(resultSet.getInt("ID"));
//            product.setPname(resultSet.getString("PNAME"));
//            product.setPrice(resultSet.getInt("PRICE"));
//            product.setCategory(resultSet.getString("CATEGORY"));
//            product.setManfacturer(resultSet.getString("MANFACTURER"));
//            products.add(product);
//        }
//
//        for (Product product: products) {
//            System.out.println(product);
//        }
//    }

    @Test
    public void update() throws SQLException {
        dbConnection =  new DBConnection();
        dbConnection.openConnection();

        Statement statement = dbConnection.getConnection().createStatement();
        int affectedRos = statement.executeUpdate("update PRODUCT set Pname='hasan' where id=4");
        Assert.assertEquals(1, affectedRos);
    }


    @AfterClass
    public void closeConnection() throws SQLException {
        dbConnection.closeConnection();
    }

}