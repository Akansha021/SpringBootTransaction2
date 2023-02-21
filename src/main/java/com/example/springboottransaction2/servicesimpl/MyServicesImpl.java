package com.example.springboottransaction2.servicesimpl;

import com.example.springboottransaction2.dto.PersonDto;
import com.example.springboottransaction2.dto.ProductDto;
import com.example.springboottransaction2.entity.Product;
import com.example.springboottransaction2.repository.ProductRepo;
import com.example.springboottransaction2.services.MyServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class MyServicesImpl implements MyServices {

    ProductRepo productRepo;

    public MyServicesImpl(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }


    @Override
    public Product myService(ProductDto productDto) {
        Product product=new Product();
        product.setId(productDto.getId());
        product.setName(productDto.getName());
        productRepo.save(product);
        return product;
    }

    @Override
    public String display(){
/*
          int a=10;
          if(a==10){
            throw new ArithmeticException("Exception");
        }

 */
        return "Displaying string";
    }
}
