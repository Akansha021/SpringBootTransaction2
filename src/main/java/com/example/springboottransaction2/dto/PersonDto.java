package com.example.springboottransaction2.dto;

import com.example.springboottransaction2.entity.Address;

public class PersonDto {
    int id;
    String name;
    AddressDto address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddressDto getAddress() {
        return address;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }
}
