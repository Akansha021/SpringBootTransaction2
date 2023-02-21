package com.example.springboottransaction2.services;

import com.example.springboottransaction2.dto.PersonDto;

public interface PersonServices {
    PersonDto viewPersonInfo(PersonDto personDto);
    String getMyView();
}
