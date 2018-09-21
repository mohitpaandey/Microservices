package com.stackroute.Projects.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Project {

	
	

	private String ProjectTitle;
	private String Client;
	private String ProjectStatus;
	private String Duration;
	private String ProjectDetails;
	private String ProjectMembers;
	private String Role;
	private String ProjectLocation;
	private String ProjectAt; 
	private String TeamSize;
	private String Skills;
	private String ProjectURL;
	public String getProjectTitle() {
		return ProjectTitle;
	}
	public void setProjectTitle(String projectTitle) {
		ProjectTitle = projectTitle;
	}
	public String getClient() {
		return Client;
	}
	public void setClient(String client) {
		Client = client;
	}
	public String getProjectStatus() {
		return ProjectStatus;
	}
	public void setProjectStatus(String projectStatus) {
		ProjectStatus = projectStatus;
	}
	public String getDuration() {
		return Duration;
	}
	public void setDuration(String duration) {
		Duration = duration;
	}
	public String getProjectDetails() {
		return ProjectDetails;
	}
	public void setProjectDetails(String projectDetails) {
		ProjectDetails = projectDetails;
	}
	public String getProjectMembers() {
		return ProjectMembers;
	}
	public void setProjectMembers(String projectMembers) {
		ProjectMembers = projectMembers;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	public String getProjectLocation() {
		return ProjectLocation;
	}
	public void setProjectLocation(String projectLocation) {
		ProjectLocation = projectLocation;
	}
	public String getProjectAt() {
		return ProjectAt;
	}
	public void setProjectAt(String projectAt) {
		ProjectAt = projectAt;
	}
	public String getTeamSize() {
		return TeamSize;
	}
	public void setTeamSize(String teamSize) {
		TeamSize = teamSize;
	}
	public String getSkills() {
		return Skills;
	}
	public void setSkills(String skills) {
		Skills = skills;
	}
	public String getProjectURL() {
		return ProjectURL;
	}
	public void setProjectURL(String projectURL) {
		ProjectURL = projectURL;
	}
	
	public Project(String projectTitle, String client, String projectStatus, String duration, String projectDetails,
			String projectMembers, String role, String projectLocation, String projectAt, String teamSize,
			String skills, String projectURL) {
		super();
		ProjectTitle = projectTitle;
		Client = client;
		ProjectStatus = projectStatus;
		Duration = duration;
		ProjectDetails = projectDetails;
		ProjectMembers = projectMembers;
		Role = role;
		ProjectLocation = projectLocation;
		ProjectAt = projectAt;
		TeamSize = teamSize;
		Skills = skills;
		ProjectURL = projectURL;
	}
	public Project() {
		super();
	}
      

	

	
}
