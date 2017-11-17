package com.greenfox.exam.spring.repositories;

import com.greenfox.exam.spring.models.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CarRepository extends CrudRepository<Car, Long> {
    Iterable<Car> findAllByPlate();
}
