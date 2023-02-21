package com.example.springboottransaction2.servicesimpl;

import com.example.springboottransaction2.dto.AddressDto;
import com.example.springboottransaction2.dto.PersonDto;
import com.example.springboottransaction2.entity.Address;
import com.example.springboottransaction2.entity.Person;
import com.example.springboottransaction2.repository.AddressRepo;
import com.example.springboottransaction2.repository.PersonRepo;
import com.example.springboottransaction2.services.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class PersonServicesImpl implements PersonServices {
    @Autowired
    AddressRepo addressRepo;
    @Autowired
    PersonRepo personRepo;

    public PersonServicesImpl(AddressRepo addressRepo, PersonRepo personRepo) {
        this.addressRepo = addressRepo;
        this.personRepo = personRepo;
    }

    @Override
    public PersonDto viewPersonInfo(PersonDto personDto) {

        Address address=new Address();
        address.setId(personDto.getId());
        address.setName(personDto.getName());
        addressRepo.save(address);
        Person person=new Person();
        person.setId(personDto.getId());
        person.setName(personDto.getName());
        person.setAddress(address);

        personRepo.save(person);

        return personDto;
    }

    public String getMyView(){
        return "My String";
    }
}
