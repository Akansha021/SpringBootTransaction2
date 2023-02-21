package com.example.springboottransaction2.services;

import com.example.springboottransaction2.dto.PersonDto;
import com.example.springboottransaction2.dto.ProductDto;
import com.example.springboottransaction2.entity.Product;

public interface MyServices {
    public Product myService(ProductDto productDto);
    String display();
}
