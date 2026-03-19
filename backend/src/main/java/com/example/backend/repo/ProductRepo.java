package com.example.backend.repo;

import com.example.backend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {


    // JPQL
    @Query("Select p from Product p where "+
            "LOWER(p.name) Like LOWER(CONCAT('%',:keyword,'%')) OR " +
            "LOWER(p.description) Like LOWER(CONCAT('%',:keyword,'%')) OR " +
            "LOWER(p.brand) Like LOWER(CONCAT('%',:keyword,'%')) OR " +
            "LOWER(p.category) Like LOWER(CONCAT('%',:keyword,'%'))" )
    List<Product> searchProduct(String keyword);
}
