package com.cggov.labour.ruralservice.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ApplicantFamilyMembers
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-07T14:59:57.714447-05:00[America/New_York]")

public class ApplicantFamilyMembers   {
  @JsonProperty("memberId")
  private Integer memberId;

  @JsonProperty("memberName")
  private String memberName;

  @JsonProperty("relation")
  private Integer relation;

  @JsonProperty("memberDOB")
  private String memberDOB;

  @JsonProperty("age")
  private Integer age;

  @JsonProperty("memberGender")
  private Integer memberGender;

  @JsonProperty("memberAadhar")
  private String memberAadhar;

  @JsonProperty("nominee")
  private Boolean nominee;

  @JsonProperty("memberPercentDistribution")
  private Integer memberPercentDistribution;

  @JsonProperty("memberEducation")
  private Integer memberEducation;

  @JsonProperty("memberSchoolGrade")
  private Integer memberSchoolGrade;

  @JsonProperty("memberMaritalStatus")
  private Integer memberMaritalStatus;

  @JsonProperty("programName")
  private Integer programName;

  @JsonProperty("status")
  private Integer status;

  public ApplicantFamilyMembers memberId(Integer memberId) {
    this.memberId = memberId;
    return this;
  }

  /**
   * Get memberId
   * @return memberId
  */
  @ApiModelProperty(value = "")

@Size(max=10) 
  public Integer getMemberId() {
    return memberId;
  }

  public void setMemberId(Integer memberId) {
    this.memberId = memberId;
  }

  public ApplicantFamilyMembers memberName(String memberName) {
    this.memberName = memberName;
    return this;
  }

  /**
   * Get memberName
   * @return memberName
  */
  @ApiModelProperty(value = "")


  public String getMemberName() {
    return memberName;
  }

  public void setMemberName(String memberName) {
    this.memberName = memberName;
  }

  public ApplicantFamilyMembers relation(Integer relation) {
    this.relation = relation;
    return this;
  }

  /**
   * Get relation
   * @return relation
  */
  @ApiModelProperty(value = "")


  public Integer getRelation() {
    return relation;
  }

  public void setRelation(Integer relation) {
    this.relation = relation;
  }

  public ApplicantFamilyMembers memberDOB(String memberDOB) {
    this.memberDOB = memberDOB;
    return this;
  }

  /**
   * Get memberDOB
   * @return memberDOB
  */
  @ApiModelProperty(value = "")


  public String getMemberDOB() {
    return memberDOB;
  }

  public void setMemberDOB(String memberDOB) {
    this.memberDOB = memberDOB;
  }

  public ApplicantFamilyMembers age(Integer age) {
    this.age = age;
    return this;
  }

  /**
   * Get age
   * @return age
  */
  @ApiModelProperty(value = "")


  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public ApplicantFamilyMembers memberGender(Integer memberGender) {
    this.memberGender = memberGender;
    return this;
  }

  /**
   * Get memberGender
   * @return memberGender
  */
  @ApiModelProperty(value = "")


  public Integer getMemberGender() {
    return memberGender;
  }

  public void setMemberGender(Integer memberGender) {
    this.memberGender = memberGender;
  }

  public ApplicantFamilyMembers memberAadhar(String memberAadhar) {
    this.memberAadhar = memberAadhar;
    return this;
  }

  /**
   * Get memberAadhar
   * @return memberAadhar
  */
  @ApiModelProperty(value = "")


  public String getMemberAadhar() {
    return memberAadhar;
  }

  public void setMemberAadhar(String memberAadhar) {
    this.memberAadhar = memberAadhar;
  }

  public ApplicantFamilyMembers nominee(Boolean nominee) {
    this.nominee = nominee;
    return this;
  }

  /**
   * Get nominee
   * @return nominee
  */
  @ApiModelProperty(value = "")


  public Boolean getNominee() {
    return nominee;
  }

  public void setNominee(Boolean nominee) {
    this.nominee = nominee;
  }

  public ApplicantFamilyMembers memberPercentDistribution(Integer memberPercentDistribution) {
    this.memberPercentDistribution = memberPercentDistribution;
    return this;
  }

  /**
   * Get memberPercentDistribution
   * @return memberPercentDistribution
  */
  @ApiModelProperty(value = "")


  public Integer getMemberPercentDistribution() {
    return memberPercentDistribution;
  }

  public void setMemberPercentDistribution(Integer memberPercentDistribution) {
    this.memberPercentDistribution = memberPercentDistribution;
  }

  public ApplicantFamilyMembers memberEducation(Integer memberEducation) {
    this.memberEducation = memberEducation;
    return this;
  }

  /**
   * Get memberEducation
   * @return memberEducation
  */
  @ApiModelProperty(value = "")


  public Integer getMemberEducation() {
    return memberEducation;
  }

  public void setMemberEducation(Integer memberEducation) {
    this.memberEducation = memberEducation;
  }

  public ApplicantFamilyMembers memberSchoolGrade(Integer memberSchoolGrade) {
    this.memberSchoolGrade = memberSchoolGrade;
    return this;
  }

  /**
   * Get memberSchoolGrade
   * @return memberSchoolGrade
  */
  @ApiModelProperty(value = "")


  public Integer getMemberSchoolGrade() {
    return memberSchoolGrade;
  }

  public void setMemberSchoolGrade(Integer memberSchoolGrade) {
    this.memberSchoolGrade = memberSchoolGrade;
  }

  public ApplicantFamilyMembers memberMaritalStatus(Integer memberMaritalStatus) {
    this.memberMaritalStatus = memberMaritalStatus;
    return this;
  }

  /**
   * Get memberMaritalStatus
   * @return memberMaritalStatus
  */
  @ApiModelProperty(value = "")


  public Integer getMemberMaritalStatus() {
    return memberMaritalStatus;
  }

  public void setMemberMaritalStatus(Integer memberMaritalStatus) {
    this.memberMaritalStatus = memberMaritalStatus;
  }

  public ApplicantFamilyMembers programName(Integer programName) {
    this.programName = programName;
    return this;
  }

  /**
   * Get programName
   * @return programName
  */
  @ApiModelProperty(value = "")


  public Integer getProgramName() {
    return programName;
  }

  public void setProgramName(Integer programName) {
    this.programName = programName;
  }

  public ApplicantFamilyMembers status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(value = "")


  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicantFamilyMembers applicantFamilyMembers = (ApplicantFamilyMembers) o;
    return Objects.equals(this.memberId, applicantFamilyMembers.memberId) &&
        Objects.equals(this.memberName, applicantFamilyMembers.memberName) &&
        Objects.equals(this.relation, applicantFamilyMembers.relation) &&
        Objects.equals(this.memberDOB, applicantFamilyMembers.memberDOB) &&
        Objects.equals(this.age, applicantFamilyMembers.age) &&
        Objects.equals(this.memberGender, applicantFamilyMembers.memberGender) &&
        Objects.equals(this.memberAadhar, applicantFamilyMembers.memberAadhar) &&
        Objects.equals(this.nominee, applicantFamilyMembers.nominee) &&
        Objects.equals(this.memberPercentDistribution, applicantFamilyMembers.memberPercentDistribution) &&
        Objects.equals(this.memberEducation, applicantFamilyMembers.memberEducation) &&
        Objects.equals(this.memberSchoolGrade, applicantFamilyMembers.memberSchoolGrade) &&
        Objects.equals(this.memberMaritalStatus, applicantFamilyMembers.memberMaritalStatus) &&
        Objects.equals(this.programName, applicantFamilyMembers.programName) &&
        Objects.equals(this.status, applicantFamilyMembers.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberId, memberName, relation, memberDOB, age, memberGender, memberAadhar, nominee, memberPercentDistribution, memberEducation, memberSchoolGrade, memberMaritalStatus, programName, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicantFamilyMembers {\n");
    
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    memberName: ").append(toIndentedString(memberName)).append("\n");
    sb.append("    relation: ").append(toIndentedString(relation)).append("\n");
    sb.append("    memberDOB: ").append(toIndentedString(memberDOB)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    memberGender: ").append(toIndentedString(memberGender)).append("\n");
    sb.append("    memberAadhar: ").append(toIndentedString(memberAadhar)).append("\n");
    sb.append("    nominee: ").append(toIndentedString(nominee)).append("\n");
    sb.append("    memberPercentDistribution: ").append(toIndentedString(memberPercentDistribution)).append("\n");
    sb.append("    memberEducation: ").append(toIndentedString(memberEducation)).append("\n");
    sb.append("    memberSchoolGrade: ").append(toIndentedString(memberSchoolGrade)).append("\n");
    sb.append("    memberMaritalStatus: ").append(toIndentedString(memberMaritalStatus)).append("\n");
    sb.append("    programName: ").append(toIndentedString(programName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

