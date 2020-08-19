package com.mapsa.model;

import com.mapsa.persistence.Column;
import com.mapsa.persistence.Entity;
import com.mapsa.persistence.Id;
import com.mapsa.persistence.Table;

import java.util.Objects;

/**
 * @author Esmaeil Sadeghi, 8/7/20 9:25 AM
 */
@Entity
@Table(name = "CUSTOMER")
public class Customer {

    @Id
    @Column(name = "ID", dataType = "NUMBER", length = 10)
    private int id;
    @Column(name = "FIRST_NAME", dataType = "VARCHAR", length = 30)
    private String firstName;
    @Column(name = "LAST_NAME", dataType = "VARCHAR", length = 50)
    private String lastName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id &&
                Objects.equals(firstName, customer.firstName) &&
                Objects.equals(lastName, customer.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
