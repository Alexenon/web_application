package com.xenon.web_application.controller;

import com.xenon.web_application.model.Photo;
import com.xenon.web_application.model.Product;
import com.xenon.web_application.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * TODO:
 *  - Filter products
 *  - Remove one product / all
 *  - Update product using id
 *  - Main product photo
 */
@RestController
@RequestMapping("/collections")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping
    public List<Product> getLastProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/all")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping("/add")
    public Product saveProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @DeleteMapping("/deleteProducts/all")
    public String deleteAllProducts() {
        productService.deleteAllProducts();
        return "All products have been deleted";
    }

    @DeleteMapping("/deleteProduct/{productId}")
    public String deleteProductById(@PathVariable Integer productId) {
        productService.deleteProductById(productId);
        return "Product with id=" + productId + " had been deleted";
    }

    @PutMapping("/addPhoto/{productId}")
    public Product addPhotoForProduct(
            @PathVariable Integer productId,
            @RequestBody Photo photo
    ) {
        return productService.addPhotoForProduct(productId, photo);
    }

//    @GetMapping("/category/{categoryName}")
//    public List<Product> getProductsByCategory(@PathVariable String categoryName) {
//        return productService.getProductsByCategory(categoryName);
//    }

//    @GetMapping("/filter")
//    public List<Product> getFilteredProducts(@RequestParam Map<String, String> customQuery) {
//        return productService.getFilteredProducts(customQuery);
//    }

}


