package com.xenon.web_application.service;

import com.xenon.web_application.model.Photo;
import com.xenon.web_application.model.Product;
import com.xenon.web_application.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product addPhotoForProduct(Integer productId, Photo photo) {
        Product product = productRepository.findById(productId).orElseThrow();
        product.addPhoto(photo);
        return productRepository.save(product);
    }

}
