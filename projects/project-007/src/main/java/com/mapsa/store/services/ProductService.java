//package com.mapsa.store.services;
//
//import com.mapsa.store.model.Product;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * @author Esmaeil Sadeghi, 7/31/20 12:02 PM
// */
//@Service
//public class ProductService {
//
//    List<Product> productList;
//
//    public List<Product> products(){
//        Product product1 = new Product();
//        product1.setId(1);
//        product1.setName("chips");
//        product1.setCategory("foodstuffs");
//        product1.setDescription("This is a chips");
//        product1.setPrice(20000);
//        product1.setStatus(true);
//        product1.setUnitInStock(12);
//
//        Product product2 = new Product();
//        product2.setId(1);
//        product2.setName("chips");
//        product2.setCategory("foodstuffs");
//        product2.setDescription("This is a chips");
//        product2.setPrice(20000);
//        product2.setStatus(true);
//        product2.setUnitInStock(12);
//
//        productList = new ArrayList<>();
//        productList.add(product1);
//        productList.add(product2);
//
//        return productList;
//    }
//
//}
