package com.xenon.web_application.service;

import com.xenon.web_application.model.Photo;
import com.xenon.web_application.model.Product;
import com.xenon.web_application.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

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

    public void deleteAllProducts() {
        productRepository.deleteAll();
    }

    public void deleteProductById(Integer id) {
        productRepository.deleteById(id);
    }

    public Product addPhotoForProduct(Integer productId, Photo photo) {
        Product product = productRepository.findById(productId).orElseThrow();
        product.addPhoto(photo);
        return productRepository.save(product);
    }

    public List<Product> getProductsByCategory(String category) {
        return productRepository.findProductsByCategory(category);
    }

    public List<Product> getFilteredProducts(Map<String, String> params) {

        int startPrice = Optional.of(Integer.parseInt(params.get("startPrice"))).orElse(0);
        int endPrice = Optional.of(Integer.parseInt(params.get("endPrice"))).orElse(999_999_999);

        for(Map.Entry<String, String> entry : params.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        return productRepository.findAll().stream()
                .filter(product ->
                        product.getPrice() >= 499 &&
                        product.getPrice() <= 999)
                .collect(Collectors.toList());
    }

//    a public List<Product> getSortedProductsByPrice() {
//        return productRepository.findAll()
//                .sort(product -> product.getPrice().intValue());
//    }
}
