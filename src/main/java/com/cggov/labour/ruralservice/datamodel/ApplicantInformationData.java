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
@Table(name = "APPLICANT_INFORMATION")
public class ApplicantInformationData implements Serializable  {
	
	private static final long serialVersionUID = 1L;

	//variable id 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "applicant_information_id")
	private long applicantInfoId;

		// variable name 
	@Column(name = "name")
	private String name;
	@Column(name = "pmjjy_money")
	private 	boolean		pmjjyMoney	;
	@Column(name = "karya_swaroop")
	private 	int		karyaSwaroop	;
	@Column(name = "name")
	private 	int		karyaPrakriti1	;
	@Column(name = "name")
	private 	int		karyaPrakriti2	;

	@Column(name = "name")
	private 	int		karyaPrakriti3	;

	@Column(name = "name")
	private 	String		nameasAADHAR	;
	@Column(name = "name")
	private 	String		fatherNameorHusbandName	;
	@Column(name = "name")
	private 	int		fatherORhusband	;
	@Column(name = "name")
	private 	String		motherName	;
	@Column(name = "name")
	private 	int		gender	;
	@Column(name = "name")
	private 	int		marriage	;
	@Column(name = "name")
	private 	String		dob	;
	@Column(name = "name")
	private 	int		age	;
	@Column(name = "name")
	private 	int		caste	;
	@Column(name = "name")
	private 	boolean		manrega	;
	@Column(name = "name")	
	private 	String		ration	;
	@Column(name = "name")	
	private 	String		voterId	;
	@Column(name = "name")
	private 	String		rsBy	;
	public boolean isPmjjyMoney() {
		return pmjjyMoney;
	}

	public void setPmjjyMoney(boolean pmjjyMoney) {
		this.pmjjyMoney = pmjjyMoney;
	}

	public int getKaryaSwaroop() {
		return karyaSwaroop;
	}

	public void setKaryaSwaroop(int karyaSwaroop) {
		this.karyaSwaroop = karyaSwaroop;
	}

	public int getKaryaPrakriti1() {
		return karyaPrakriti1;
	}

	public void setKaryaPrakriti1(int karyaPrakriti1) {
		this.karyaPrakriti1 = karyaPrakriti1;
	}

	public int getKaryaPrakriti2() {
		return karyaPrakriti2;
	}

	public void setKaryaPrakriti2(int karyaPrakriti2) {
		this.karyaPrakriti2 = karyaPrakriti2;
	}

	public int getKaryaPrakriti3() {
		return karyaPrakriti3;
	}

	public void setKaryaPrakriti3(int karyaPrakriti3) {
		this.karyaPrakriti3 = karyaPrakriti3;
	}

	public String getNameasAADHAR() {
		return nameasAADHAR;
	}

	public void setNameasAADHAR(String nameasAADHAR) {
		this.nameasAADHAR = nameasAADHAR;
	}

	public String getFatherNameorHusbandName() {
		return fatherNameorHusbandName;
	}

	public void setFatherNameorHusbandName(String fatherNameorHusbandName) {
		this.fatherNameorHusbandName = fatherNameorHusbandName;
	}

	public int getFatherORhusband() {
		return fatherORhusband;
	}

	public void setFatherORhusband(int fatherORhusband) {
		this.fatherORhusband = fatherORhusband;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public int getMarriage() {
		return marriage;
	}

	public void setMarriage(int marriage) {
		this.marriage = marriage;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getCaste() {
		return caste;
	}

	public void setCaste(int caste) {
		this.caste = caste;
	}

	public boolean isManrega() {
		return manrega;
	}

	public void setManrega(boolean manrega) {
		this.manrega = manrega;
	}

	public String getRation() {
		return ration;
	}

	public void setRation(String ration) {
		this.ration = ration;
	}

	public String getVoterId() {
		return voterId;
	}

	public void setVoterId(String voterId) {
		this.voterId = voterId;
	}

	public String getRsBy() {
		return rsBy;
	}

	public void setRsBy(String rsBy) {
		this.rsBy = rsBy;
	}

	public String getAadharCard() {
		return aadharCard;
	}

	public void setAadharCard(String aadharCard) {
		this.aadharCard = aadharCard;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getAcNumber() {
		return acNumber;
	}

	public void setAcNumber(String acNumber) {
		this.acNumber = acNumber;
	}

	public String getIfsCode() {
		return ifsCode;
	}

	public void setIfsCode(String ifsCode) {
		this.ifsCode = ifsCode;
	}

	public String getEsiNumber() {
		return esiNumber;
	}

	public void setEsiNumber(String esiNumber) {
		this.esiNumber = esiNumber;
	}

	public String getEpfNumber() {
		return epfNumber;
	}

	public void setEpfNumber(String epfNumber) {
		this.epfNumber = epfNumber;
	}


	@Column(name = "name")
	private 	String		aadharCard	;
	@Column(name = "name")
	private 	String		bankName	;
	@Column(name = "name")
	private 	String		branchName	;
	@Column(name = "name")
	private 	String		acNumber	;
	@Column(name = "name")
	private 	String		ifsCode	;
	@Column(name = "name")
	private 	String		esiNumber	;
	@Column(name = "name")
	private 	String		epfNumber	;
	
	
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
