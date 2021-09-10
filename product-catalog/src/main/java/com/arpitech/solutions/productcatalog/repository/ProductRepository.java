package com.arpitech.solutions.productcatalog.repository;

import com.arpitech.solutions.productcatalog.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

    List<Product> findByName(String name);
}
