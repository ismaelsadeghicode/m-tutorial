package com.mapsa.database;

import com.mapsa.persistence.Column;
import com.mapsa.persistence.Id;
import com.mapsa.persistence.Table;

import java.io.IOException;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author Esmaeil Sadeghi, 8/7/20 10:51 AM
 */
// ORM
// Hibernate
public class CRUD {

    DBConnection dbConnection = null;
    Connection connection = null;

    public void save(Object object) throws IllegalAccessException, IOException, SQLException {
        String query = "INSERT INTO ";
        Table table = object.getClass().getDeclaredAnnotation(Table.class);
        query += table.name() + " (";
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            Column column = field.getAnnotation(Column.class);
            if (column != null) {
                query += column.name() + ",";
            }
        }
        if (query.trim().endsWith(",")) {
            query = query.substring(0, query.length() - 1);
        }
        query += ") VALUES (";

        for (Field field : fields) {
            if (field.getType().getSimpleName().endsWith("String")) {
                query += "'" + field.get(object) + "',";
            } else {
                query += field.get(object) + ",";
            }
        }
        if (query.trim().endsWith(",")) {
            query = query.substring(0, query.length() - 1);
        }
        query += ")";

        System.out.println(query);

        dbConnection = DBConnection.getInstance();
        connection = dbConnection.getConnection();
        PreparedStatement statement = connection.prepareStatement(query);
        statement.execute();

    }

    public void update(Object object) throws IllegalAccessException, IOException, SQLException {
        Table table = object.getClass().getDeclaredAnnotation(Table.class);
        String query = "UPDATE " + table.name() + " SET ";
        Field[] fields = object.getClass().getDeclaredFields();
        Object id2 = null;
        String idColumn = null;
        for (Field field : fields) {
            field.setAccessible(true);
            Column column = field.getDeclaredAnnotation(Column.class);
            Id id = field.getDeclaredAnnotation(Id.class);
            if (id != null) {
                id2 = field.get(object);
                idColumn = field.getName();
            }
            if (column != null) {
                if (id == null) {
                    if (field.getType().getSimpleName().endsWith("String")) {
                        query += column.name() + "=" + "'" + field.get(object) + "',";
                    } else {
                        query += column.name() + "=" + field.get(object) + ",";
                    }
                }
            }
        }
        if (query.trim().endsWith(",")) {
            query = query.substring(0, query.length() - 1);
        }
        query += " WHERE " + idColumn + "=" + id2;

        System.out.println(query);

        dbConnection = DBConnection.getInstance();
        PreparedStatement statement = dbConnection.getConnection().prepareStatement(query);
        statement.executeUpdate();

    }
}

