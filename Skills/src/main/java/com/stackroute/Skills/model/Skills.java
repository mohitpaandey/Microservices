package com.stackroute.Skills.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Skills {

	
	 private String ITSkills;
	 private String Version;
	 private String Level;
	 private String LastUsed;
	
	 
	 public String getITSkills() {
		return ITSkills;
	}
	public void setITSkills(String iTSkills) {
		ITSkills = iTSkills;
	}
	public String getVersion() {
		return Version;
	}
	public void setVersion(String version) {
		Version = version;
	}
	public String getLevel() {
		return Level;
	}
	public void setLevel(String level) {
		Level = level;
	}
	public String getLastUsed() {
		return LastUsed;
	}
	public void setLastUsed(String lastUsed) {
		LastUsed = lastUsed;
	}
	
	public Skills(String iTSkills, String version, String level, String lastUsed) {
		super();
		ITSkills = iTSkills;
		Version = version;
		Level = level;
		LastUsed = lastUsed;
	}
	
	public Skills() {
		super();
	}
	 
	 

	
	
}
