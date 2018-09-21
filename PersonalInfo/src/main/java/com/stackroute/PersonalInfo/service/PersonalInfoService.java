package com.stackroute.PersonalInfo.service;

import com.stackroute.PersonalInfo.exceptions.UserAlreadyExistsException;
import com.stackroute.PersonalInfo.exceptions.UserNotFoundException;
import com.stackroute.PersonalInfo.model.PersonalInfo;


public interface PersonalInfoService {

	
	
	 PersonalInfo addUser(PersonalInfo user) throws UserAlreadyExistsException ;

	 PersonalInfo updateUser(String userId,PersonalInfo user) throws UserNotFoundException;
	 
	 boolean deleteUser(String userId) throws UserNotFoundException;
	 
	 PersonalInfo getUserById(String userId) throws UserNotFoundException ;
	 

}
