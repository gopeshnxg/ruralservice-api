package com.cggov.labour.ruralservice.api.model;

public class ApplicantInformation {
	
	
	//variable data attribute 
      private long applicantId; // an example of encapsulation via access modifier 
	  private String name;
	
	
	//constructor
	public ApplicantInformation(long appId, String n ){
		
		this.applicantId = appId;
		this.name = n;
	}
	
	//method is use to get encapsulated data via public method 
	public long getApplicantId() {
		
		return applicantId;
	}

	public String getName() {
		
		return name;
	}

}
