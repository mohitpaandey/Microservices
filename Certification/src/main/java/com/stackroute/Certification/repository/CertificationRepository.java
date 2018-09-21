package com.stackroute.Certification.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.Certification.model.Certification;

@Repository
public interface CertificationRepository extends MongoRepository <Certification,String> {

}
