package com.example.demo.service;


import com.example.demo.entity.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Long save(Person person){
        Person savedPerson = personRepository.save(person);
        return savedPerson.getId();
    }
}
