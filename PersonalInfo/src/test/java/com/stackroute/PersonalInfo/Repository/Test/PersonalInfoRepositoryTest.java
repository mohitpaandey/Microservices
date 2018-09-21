package com.stackroute.PersonalInfo.Repository.Test;

import java.util.NoSuchElementException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.stackroute.PersonalInfo.model.PersonalInfo;
import com.stackroute.PersonalInfo.repository.PersonalInfoRepository;

@RunWith(SpringRunner.class)
@DataMongoTest
public class PersonalInfoRepositoryTest {

	
	@Autowired
	private PersonalInfoRepository infoRepository;
	private PersonalInfo user;
	
	
	@Before
	public void setUp() throws Exception{
	
		user= new PersonalInfo();
		user.setUserName("Alfa");
		user.setUserId("John123");
		user.setDateOfBirth("12-14-1995");
		user.setGender("Male");
		user.setMaritalStatus("Single");
		user.setHomeTown("India");
		user.setPermanentAddress("Somewhere");
		user.setPinCode("334455");
		user.setLanguages("English");
		
	}
	
	
	@After
	public void tearDown() throws Exception{
		infoRepository.deleteAll();
		
	}
	
	
	
	 @Test
	    public void addUserTest() {

	        infoRepository.insert(user);
	        PersonalInfo fetcheduser = infoRepository.findById("John123").get();
	        Assert.assertEquals(user.getUserId(), fetcheduser.getUserId());

	        
	        
	    }
	    @Test(expected = NoSuchElementException.class)
	    public void deleteUserTest() {
	        infoRepository.insert(user);
	        PersonalInfo fetcheduser = infoRepository.findById("Jhon123").get();
	        Assert.assertEquals("Jhon123", fetcheduser.getUserId());
	        infoRepository.delete(fetcheduser);
	        fetcheduser = infoRepository.findById("Jhon123").get();
	        
	    }


	    @Test
	    public void updateUserTest() {
	    	infoRepository.insert(user);
	    	PersonalInfo fetcheduser = infoRepository.findById("Jhon123").get();
	        fetcheduser.setLanguages("French");
	        infoRepository.save(fetcheduser);
	        fetcheduser = infoRepository.findById("Jhon123").get();
	        Assert.assertEquals("French", fetcheduser.getLanguages());
	    }
}
