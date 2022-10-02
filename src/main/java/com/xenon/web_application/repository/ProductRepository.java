package com.xenon.web_application.repository;

import com.xenon.web_application.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Query("SELECT p from Product p WHERE " +
            "p.name LIKE CONCAT('%', :query, '%')" +
            "OR p.description LIKE CONCAT('%', :query, '%')" +
            "OR p.category LIKE CONCAT('%', :query, '%')")
    List<Product> searchForProducts(String query);

    List<Product> findProductsByCategory(String category);




//    List<Product> findProductsUsingFilter(List<Object> listOfFilters);


}
