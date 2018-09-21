package com.stackroute.Certification.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Certification {

	 private String CertificationName;
	 private String CertificationAuthority;
	 private String LicenseNumber;
	 private String DurationFrom;
	 private String DurationTo;
	 private String CertificationURL;
	 
	 
	public String getCertificationName() {
		return CertificationName;
	}
	public void setCertificationName(String certificationName) {
		CertificationName = certificationName;
	}
	public String getCertificationAuthority() {
		return CertificationAuthority;
	}
	public void setCertificationAuthority(String certificationAuthority) {
		CertificationAuthority = certificationAuthority;
	}
	public String getLicenseNumber() {
		return LicenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		LicenseNumber = licenseNumber;
	}
	public String getDurationFrom() {
		return DurationFrom;
	}
	public void setDurationFrom(String durationFrom) {
		DurationFrom = durationFrom;
	}
	public String getDurationTo() {
		return DurationTo;
	}
	public void setDurationTo(String durationTo) {
		DurationTo = durationTo;
	}
	public String getCertificationURL() {
		return CertificationURL;
	}
	public void setCertificationURL(String certificationURL) {
		CertificationURL = certificationURL;
	}
	
	public Certification(String certificationName, String certificationAuthority, String licenseNumber,
			String durationFrom, String durationTo, String certificationURL) {
		super();
		CertificationName = certificationName;
		CertificationAuthority = certificationAuthority;
		LicenseNumber = licenseNumber;
		DurationFrom = durationFrom;
		DurationTo = durationTo;
		CertificationURL = certificationURL;
	}
	
	public Certification() {
		super();
	}
	 
	 
	 
	
}
