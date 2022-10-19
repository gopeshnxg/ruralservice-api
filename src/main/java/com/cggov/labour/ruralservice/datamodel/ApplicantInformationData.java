package com.cggov.labour.ruralservice.datamodel;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

//@Component
@Entity
@Table(name = "applicantinfo")
public class ApplicantInformationData implements Serializable  {
	
	private static final long serialVersionUID = 1L;

	//variable id 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "applicantinfo_id")
	private long applicantInfoId;

		// variable name 
	@Column(name = "name")
	private String name;
	
	
    @OneToMany(fetch = FetchType.LAZY , mappedBy = "applicantInformationData",
            cascade = CascadeType.ALL)
    private List<ApplicantAddressData> applicantAddressData;

	//method get

	public List<ApplicantAddressData> getApplicantAddressData() {
		return applicantAddressData;
	}

	public void setApplicantAddressData(List<ApplicantAddressData> applicantAddressData) {
		this.applicantAddressData = applicantAddressData;
	}

	public long getApplicantInfoId() {
		return applicantInfoId;
	}
	
	// no set for id ???? 

	public void setApplicantInfoId(long id) {
		
		
		this.applicantInfoId= id;
	}
	
	
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
		return "Tutorial [id=" + applicantInfoId + ", name=" + name + "]";
	}
}
