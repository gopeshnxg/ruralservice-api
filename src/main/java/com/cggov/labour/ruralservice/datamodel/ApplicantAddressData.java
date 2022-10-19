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

	@Column(name="district")				
	private 	int		district	;
	@Column(name="applicant_address_type")				
	private 	int		selectedAddressType	;

	@Column(name="assembly_area")				
	private 	int		vidhansabhaArea	;
	@Column(name="development_block")				
	private 	int		vikasKhand	;
	@Column(name="panchayat")				
	private 	int		panchayat	;
	@Column(name="ward")				
	private 	int		ward	;
	@Column(name="address")				
	private 	String		address	;
	@Column(name="house_No")				
	private 	String		houseNo	;
	@Column(name="mobile1")				
	private 	int		mobile1	;
	@Column(name="mobile2")				
	private 	int		mobile2	;
	@Column(name="address_type")				
	private 	String		addressType	;


	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "applicant_information_id")
    private ApplicantInformationData applicantInformationData;

    public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	public int getDistrict() {
		return district;
	}

	public void setDistrict(int district) {
		this.district = district;
	}

	public int getSelectedAddressType() {
		return selectedAddressType;
	}

	public void setSelectedAddressType(int selectedAddressType) {
		this.selectedAddressType = selectedAddressType;
	}

	public int getVidhansabhaArea() {
		return vidhansabhaArea;
	}

	public void setVidhansabhaArea(int vidhansabhaArea) {
		this.vidhansabhaArea = vidhansabhaArea;
	}

	public int getVikasKhand() {
		return vikasKhand;
	}

	public void setVikasKhand(int vikasKhand) {
		this.vikasKhand = vikasKhand;
	}

	public int getPanchayat() {
		return panchayat;
	}

	public void setPanchayat(int panchayat) {
		this.panchayat = panchayat;
	}

	public int getWard() {
		return ward;
	}

	public void setWard(int ward) {
		this.ward = ward;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public int getMobile1() {
		return mobile1;
	}

	public void setMobile1(int mobile1) {
		this.mobile1 = mobile1;
	}

	public int getMobile2() {
		return mobile2;
	}

	public void setMobile2(int mobile2) {
		this.mobile2 = mobile2;
	}

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