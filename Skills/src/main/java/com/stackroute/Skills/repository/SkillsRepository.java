package com.stackroute.Skills.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.Skills.model.Skills;

@Repository
public interface SkillsRepository extends MongoRepository<Skills,String> {

}
