package com.xenon.web_application.controller;

import com.xenon.web_application.model.Product;
import com.xenon.web_application.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/collections")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping
    public List<Product> getLastProducts() {
        return productService.getAllProducts(); // TODO: Change this to add last products
    }

    @GetMapping("/all")
    public void getAllProducts() {
        productService.getAllProducts();
    }

    @PostMapping("/add")
    public String saveProduct(@RequestBody Product product) {
        productService.saveProduct(product);
        return "New product was saved!";
    }

}


