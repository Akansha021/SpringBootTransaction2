package com.example.springboottransaction2.repository;

import com.example.springboottransaction2.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends CrudRepository<Product,Integer> {
}
