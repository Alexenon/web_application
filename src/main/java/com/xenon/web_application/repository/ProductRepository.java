package com.xenon.web_application.repository;

import com.xenon.web_application.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

//    @Query(value = "SELECT * FROM Products WHERE Category = ?1", nativeQuery = true)
//    List<Product> findProductsByCategory(String category);

//    List<Product> findProductsUsingFilter(List<Object> listOfFilters);


}
