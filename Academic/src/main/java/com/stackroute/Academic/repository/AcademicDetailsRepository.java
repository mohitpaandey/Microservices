package com.stackroute.Academic.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.Academic.model.AcademicDetails;

@Repository
public interface AcademicDetailsRepository extends MongoRepository<AcademicDetails,String>{

}
