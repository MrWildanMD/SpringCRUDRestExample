package com.willmd.restapiexample.restapiexample.model.repository;

import java.util.List;

import com.willmd.restapiexample.restapiexample.model.entities.Person;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends CrudRepository<Person, Long> {

    List<Person> findByName(String name);

}
