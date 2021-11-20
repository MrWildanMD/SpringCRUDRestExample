package com.willmd.restapiexample.restapiexample.services;

import java.util.List;

import javax.transaction.Transactional;

import com.willmd.restapiexample.restapiexample.model.entities.Person;
import com.willmd.restapiexample.restapiexample.model.repository.PersonRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PersonService {

    @Autowired
    private PersonRepo personRepo;

    public Person save(Person person) {
        return personRepo.save(person);
    }

    public Person findById(Long id) {
        return personRepo.findById(id).get();
    }

    public Iterable<Person> findAll() {
        return personRepo.findAll();
    }

    public void deleteById(Long id) {
        personRepo.deleteById(id);
    }

    public List<Person> findByName(String name) {
        return personRepo.findByName(name);
    }
}