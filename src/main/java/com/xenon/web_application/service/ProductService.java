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

//    public List<Product> getProductsByCategory(String category) {
//        return productRepository.findProductsByCategory(category);
//    }

//    public List<Product> getFilteredProducts(Map<String, String> params) {
//        int startPrice = Optional.of(Integer.parseInt(params.get("startPrice"))).orElse(0);
//        int endPrice = Optional.of(Integer.parseInt(params.get("endPrice"))).orElse(999_999_999);
//
//        this.printMap(params);
//
//        List<Object> listOfFilters = new ArrayList<>();
//        listOfFilters.add(startPrice);
//        listOfFilters.add(endPrice);
//
//        return productRepository.findProductsUsingFilter(listOfFilters);
//    }
//
//    private void printMap(Map<String, String> params) {
//        for (Map.Entry<String, String> entry : params.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
//    }

}
