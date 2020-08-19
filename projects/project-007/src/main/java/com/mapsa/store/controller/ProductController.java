package com.mapsa.store.controller;

//import com.mapsa.store.dao.ProductDao;
import com.mapsa.store.model.Product;
//import com.mapsa.store.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Esmaeil Sadeghi, 7/31/20 12:06 PM
 */
@Controller
public class ProductController {

//    @Autowired
//    private ProductService service;

//    @Autowired
//    private ProductDao productDao;

    @RequestMapping("/")
    public String home(){
        return "index";
    }

//    @RequestMapping("/products")
//    public String products(Model model){
//        List<Product> products = productDao.findAllProduct() ;
//        model.addAttribute("products",products);
//        return "products";
//    }

    @GetMapping(value = "/name", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String name(){
        return "fff";
    }


}
