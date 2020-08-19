package com.mapsa;

import java.util.Objects;

/**
 * @author Esmaeil Sadeghi, 8/6/20 12:56 PM
 */
public class Product {
    public int ind;
    private String pname;
    private int price;
    private String category;
    private String manfacturer;

    public int getInd() {
        return ind;
    }

    public void setInd(int ind) {
        this.ind = ind;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getManfacturer() {
        return manfacturer;
    }

    public void setManfacturer(String manfacturer) {
        this.manfacturer = manfacturer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return ind == product.ind &&
                Objects.equals(pname, product.pname) &&
                Objects.equals(price, product.price) &&
                Objects.equals(category, product.category) &&
                Objects.equals(manfacturer, product.manfacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ind, pname, price, category, manfacturer);
    }

    @Override
    public String toString() {
        return "Product{" +
                "ind=" + ind +
                ", pname='" + pname + '\'' +
                ", price='" + price + '\'' +
                ", category='" + category + '\'' +
                ", manfacturer='" + manfacturer + '\'' +
                '}';
    }
}
