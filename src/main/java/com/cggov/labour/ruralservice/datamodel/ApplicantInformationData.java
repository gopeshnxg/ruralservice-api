package com.cggov.labour.ruralservice.datamodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

//@Component
@Entity
@Table(name = "applicantinfo")
public class ApplicantInformationData {
	
	//variable id 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private long id;

		// variable name 
	@Column(name = "name")
	private String name;
	
	
	//method get

	public long getId() {
		return id;
	}
	
	// no set for id ???? 
	
	// get method 
	public String getName() {
		return name;
	}

	//set method
	public void setName(String name) {
		this.name = name;
	}

	
	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", name=" + name + "]";
	}
}
