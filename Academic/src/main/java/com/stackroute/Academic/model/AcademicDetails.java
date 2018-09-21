package com.stackroute.Academic.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class AcademicDetails {

	
	
	private String Education;
	private String Course;
	private String Specialisation;
	private String UniversityInstitute ;
	private String PassingYear;
	private String GradingSystem;
	private String HigherSecondary;
	private String Duration;
	private String Location; 
	private String SeniorSecondary;
	private String DurationX;
	private String LocationX;
	
	
	public String getEducation() {
		return Education;
	}
	public void setEducation(String education) {
		Education = education;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	public String getSpecialisation() {
		return Specialisation;
	}
	public void setSpecialisation(String specialisation) {
		Specialisation = specialisation;
	}
	public String getUniversityInstitute() {
		return UniversityInstitute;
	}
	public void setUniversityInstitute(String universityInstitute) {
		UniversityInstitute = universityInstitute;
	}
	public String getPassingYear() {
		return PassingYear;
	}
	public void setPassingYear(String passingYear) {
		PassingYear = passingYear;
	}
	public String getGradingSystem() {
		return GradingSystem;
	}
	public void setGradingSystem(String gradingSystem) {
		GradingSystem = gradingSystem;
	}
	public String getHigherSecondary() {
		return HigherSecondary;
	}
	public void setHigherSecondary(String higherSecondary) {
		HigherSecondary = higherSecondary;
	}
	public String getDuration() {
		return Duration;
	}
	public void setDuration(String duration) {
		Duration = duration;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public String getSeniorSecondary() {
		return SeniorSecondary;
	}
	public void setSeniorSecondary(String seniorSecondary) {
		SeniorSecondary = seniorSecondary;
	}
	public String getDurationX() {
		return DurationX;
	}
	public void setDurationX(String durationX) {
		DurationX = durationX;
	}
	public String getLocationX() {
		return LocationX;
	}
	public void setLocationX(String locationX) {
		LocationX = locationX;
	}
	
	
	public AcademicDetails(String education, String course, String specialisation, String universityInstitute,
			String passingYear, String gradingSystem, String higherSecondary, String duration, String location,
			String seniorSecondary, String durationX, String locationX) {
		super();
		Education = education;
		Course = course;
		Specialisation = specialisation;
		UniversityInstitute = universityInstitute;
		PassingYear = passingYear;
		GradingSystem = gradingSystem;
		HigherSecondary = higherSecondary;
		Duration = duration;
		Location = location;
		SeniorSecondary = seniorSecondary;
		DurationX = durationX;
		LocationX = locationX;
	}
	
	public AcademicDetails() {
		super();
	}


	

	
	
	

}
