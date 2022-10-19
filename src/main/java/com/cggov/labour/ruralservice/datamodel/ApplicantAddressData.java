package com.cggov.labour.ruralservice.datamodel;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "APPLICANT_ADDRESS")
public class ApplicantAddressData implements Serializable  {

    private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="address_id")
    private long applicantAddressId;

    @Column(nullable = false)
    private String address;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "applicant_information_id")
    private ApplicantInformationData applicantInformationData;

	public long getApplicantAddressId() {
		return applicantAddressId;
	}

	public void setApplicantAddressId(long applicantAddressId) {
		this.applicantAddressId = applicantAddressId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public ApplicantInformationData getApplicantInformationData() {
		return applicantInformationData;
	}

	public void setApplicantInformationData(ApplicantInformationData applicantInformationData) {
		this.applicantInformationData = applicantInformationData;
	}


    
}