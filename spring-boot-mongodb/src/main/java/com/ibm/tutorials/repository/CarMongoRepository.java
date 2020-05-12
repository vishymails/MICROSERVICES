package com.ibm.tutorials.repository;

import org.springframework.data.repository.CrudRepository;

import com.ibm.tutorials.model.Car;

public interface CarMongoRepository extends CrudRepository<Car, String>{}