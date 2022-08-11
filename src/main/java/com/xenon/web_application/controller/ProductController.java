package com.xenon.web_application.controller;

import com.xenon.web_application.model.Photo;
import com.xenon.web_application.model.Product;
import com.xenon.web_application.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * TODO:
 *  - Find by category
 *  - Remove product
 *  - Update product
 *  - Main product photo
 * */
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
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }


    @PostMapping("/add")
    public Product saveProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @PutMapping("/addPhoto/{productId}")
    public Product addPhotoForProduct(
            @PathVariable Integer productId,
            @RequestBody Photo photo
    ) {
        return productService.addPhotoForProduct(productId, photo);
    }

}


