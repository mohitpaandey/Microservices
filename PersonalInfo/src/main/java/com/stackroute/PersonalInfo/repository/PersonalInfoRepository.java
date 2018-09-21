package com.stackroute.PersonalInfo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.PersonalInfo.model.PersonalInfo;

@Repository
public interface PersonalInfoRepository extends MongoRepository<PersonalInfo,String> {

}
