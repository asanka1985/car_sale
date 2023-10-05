package org.example.repo;

import org.example.dao.CarEntity;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<CarEntity,Long> {

}
