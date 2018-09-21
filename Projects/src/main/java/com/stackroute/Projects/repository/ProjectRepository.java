package com.stackroute.Projects.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.Projects.model.Project;

@Repository
public interface ProjectRepository extends MongoRepository<Project,String> {

}
