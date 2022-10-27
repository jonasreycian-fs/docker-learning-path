package com.wiredbrain.repositories;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.repository.CrudRepository;

import com.wiredbrain.models.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
    List<Product> findAll();
}
