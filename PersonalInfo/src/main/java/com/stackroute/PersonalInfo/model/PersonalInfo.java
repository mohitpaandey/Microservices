package com.stackroute.PersonalInfo.model;

import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class PersonalInfo {
	
	@Id
	private String userId;
	private String userName;
	private String dateOfBirth;
	private String gender;
	private String MaritalStatus;
	private String PermanentAddress;
	private String HomeTown;
	private String PinCode;
	private String Languages;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMaritalStatus() {
		return MaritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		MaritalStatus = maritalStatus;
	}
	public String getPermanentAddress() {
		return PermanentAddress;
	}
	public void setPermanentAddress(String permanentAddress) {
		PermanentAddress = permanentAddress;
	}
	public String getHomeTown() {
		return HomeTown;
	}
	public void setHomeTown(String homeTown) {
		HomeTown = homeTown;
	}
	public String getPinCode() {
		return PinCode;
	}
	public void setPinCode(String pinCode) {
		PinCode = pinCode;
	}
	public String getLanguages() {
		return Languages;
	}
	public void setLanguages(String languages) {
		Languages = languages;
	}
	public PersonalInfo(String userId, String userName, String dateOfBirth, String gender, String maritalStatus,
			String permanentAddress, String homeTown, String pinCode, String languages) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		MaritalStatus = maritalStatus;
		PermanentAddress = permanentAddress;
		HomeTown = homeTown;
		PinCode = pinCode;
		Languages = languages;
	}
	
	public PersonalInfo() {
		super();
	}
	
	


	
	

}

