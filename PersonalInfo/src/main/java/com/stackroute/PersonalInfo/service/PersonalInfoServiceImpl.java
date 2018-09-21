package com.stackroute.PersonalInfo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.PersonalInfo.exceptions.UserAlreadyExistsException;
import com.stackroute.PersonalInfo.exceptions.UserNotFoundException;
import com.stackroute.PersonalInfo.model.PersonalInfo;
import com.stackroute.PersonalInfo.repository.PersonalInfoRepository;

@Service
public class PersonalInfoServiceImpl implements PersonalInfoService {

		
		private PersonalInfoRepository infoRepository;
		@Autowired
		public PersonalInfoServiceImpl(PersonalInfoRepository infoRepository) {
			this.infoRepository=infoRepository;
		}
		
	
	
	
	
	
	public PersonalInfo addUser(PersonalInfo user) throws UserAlreadyExistsException {
		if(infoRepository.insert(user)!=null) {
			return user;
			
		}
		else
			throw new UserAlreadyExistsException("UserAlreadyExistsException");
	}
		
		

	
	public PersonalInfo updateUser(String userId, PersonalInfo user) throws UserNotFoundException {
		if(user.getUserId()!=null){
			infoRepository.insert(user);
			return user;
		}else
			throw new UserNotFoundException("UserNotFoundException");
		
	}

	
	public boolean deleteUser(String userId) throws UserNotFoundException {
		if(infoRepository.findById(userId)!=null) {
			 infoRepository.deleteById(userId);
			 return true;
		}
		return false;
	}



	public PersonalInfo getUserById(String userId) throws UserNotFoundException {
		if(infoRepository.findById(userId)!=null) {
			return infoRepository.findById(userId).get();
		
	}else
		throw new UserNotFoundException("UserNotFoundException");
	}



	

}
