package com.stackroute.Location.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.Location.model.Location;

@Repository
public interface LocationRepository extends MongoRepository<Location,String>{

}
