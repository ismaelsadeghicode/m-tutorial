package com.mapsa.database;

/**
 * @author Esmaeil Sadeghi, 8/7/20 10:53 AM
 */
// JPA
public interface CRUDDB {

    void save(Object object);

    void update(Object object);

    void delete(Object object);

    void findAll(Object object);

    void findById(Object object);
}
