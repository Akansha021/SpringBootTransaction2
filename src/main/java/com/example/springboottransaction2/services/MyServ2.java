package com.example.springboottransaction2.services;

import com.example.springboottransaction2.dto.ProductDto;
import com.example.springboottransaction2.entity.Product;

public interface MyServ2 {
    public Product myService(ProductDto productDto);
    String display();
}
