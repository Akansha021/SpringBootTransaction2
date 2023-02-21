package com.example.springboottransaction2.repository;

import com.example.springboottransaction2.dto.AddressDto;
import com.example.springboottransaction2.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends CrudRepository<Address,Integer> {
}
