package com.cggov.labour.ruralservice.datamodel;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "APPLICANT_FAMILY_MEMBER")
public class ApplicantMemberData implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="APPLICANT_INFORMATION_ID")
	private int applicantId;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "member_id")
	private int memberId;
	
	@Column(name = "name")
    private String memberName;
	
	@Column(name = "relation")
    private int relation;
	@Column(name = "DOB")
	private String memberDOB;
	@Column(name = "age")
	private int  age;
	@Column(name = "gender")
    private int memberGender;
	@Column(name = "aadhar_card_number")
    private  String memberAadhar;
	@Column(name = "nominee")
    private  boolean nominee;
	@Column(name = "nominee_percentage")
    private  int memberPercentDistribution;
	@Column(name = "education")
    private int  memberEducation;
	@Column(name = "SCHOOL_GRADE")
    private int  memberSchoolGrade;
	@Column(name = "marital_status")
    private  int memberMaritalStatus;
	@Column(name = "program_name")
    private int  programName;
	@Column(name = "status")
    private int status;
	
	
	public int getApplicantId() {
		return applicantId;
	}
	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public int getRelation() {
		return relation;
	}
	public void setRelation(int relation) {
		this.relation = relation;
	}
	public String getMemberDOB() {
		return memberDOB;
	}
	public void setMemberDOB(String memberDOB) {
		this.memberDOB = memberDOB;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMemberGender() {
		return memberGender;
	}
	public void setMemberGender(int memberGender) {
		this.memberGender = memberGender;
	}
	public String getMemberAadhar() {
		return memberAadhar;
	}
	public void setMemberAadhar(String memberAadhar) {
		this.memberAadhar = memberAadhar;
	}
	public boolean isNominee() {
		return nominee;
	}
	public void setNominee(boolean nominee) {
		this.nominee = nominee;
	}
	public int getMemberPercentDistribution() {
		return memberPercentDistribution;
	}
	public void setMemberPercentDistribution(int memberPercentDistribution) {
		this.memberPercentDistribution = memberPercentDistribution;
	}
	public int getMemberEducation() {
		return memberEducation;
	}
	public void setMemberEducation(int memberEducation) {
		this.memberEducation = memberEducation;
	}
	public int getMemberSchoolGrade() {
		return memberSchoolGrade;
	}
	public void setMemberSchoolGrade(int memberSchoolGrade) {
		this.memberSchoolGrade = memberSchoolGrade;
	}
	public int getMemberMaritalStatus() {
		return memberMaritalStatus;
	}
	public void setMemberMaritalStatus(int memberMaritalStatus) {
		this.memberMaritalStatus = memberMaritalStatus;
	}
	public int getProgramName() {
		return programName;
	}
	public void setProgramName(int programName) {
		this.programName = programName;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
    
    
    
}
