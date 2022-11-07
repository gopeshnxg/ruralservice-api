package com.cggov.labour.ruralservice.api.model;

import java.util.Objects;
import com.cggov.labour.ruralservice.api.model.ApplicantAddress;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ApplicantInformation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-07T14:59:57.714447-05:00[America/New_York]")

public class ApplicantInformation   {
  @JsonProperty("pmjjyMoney")
  private Boolean pmjjyMoney;

  @JsonProperty("karyaSwaroop")
  private Integer karyaSwaroop;

  @JsonProperty("karyaPrakriti1")
  private Integer karyaPrakriti1;

  @JsonProperty("karyaPrakriti2")
  private Integer karyaPrakriti2;

  @JsonProperty("karyaPrakriti3")
  private Integer karyaPrakriti3;

  @JsonProperty("programName")
  private Integer programName;

  @JsonProperty("name")
  private String name;

  @JsonProperty("nameasAADHAR")
  private String nameasAADHAR;

  @JsonProperty("familyHeadMemberName")
  private String familyHeadMemberName;

  @JsonProperty("fatherNameorHusbandName")
  private String fatherNameorHusbandName;

  @JsonProperty("fatherORhusband")
  private Integer fatherORhusband;

  @JsonProperty("motherName")
  private String motherName;

  @JsonProperty("gender")
  private Integer gender;

  @JsonProperty("marriage")
  private Integer marriage;

  @JsonProperty("dob")
  private String dob;

  @JsonProperty("age")
  private Integer age;

  @JsonProperty("caste")
  private Integer caste;

  @JsonProperty("manrega")
  private Boolean manrega;

  @JsonProperty("ration")
  private String ration;

  @JsonProperty("voterId")
  private String voterId;

  @JsonProperty("rsBy")
  private String rsBy;

  @JsonProperty("aadharCard")
  private String aadharCard;

  @JsonProperty("bankName")
  private String bankName;

  @JsonProperty("branchName")
  private String branchName;

  @JsonProperty("acNumber")
  private String acNumber;

  @JsonProperty("ifsCode")
  private String ifsCode;

  @JsonProperty("esiNumber")
  private String esiNumber;

  @JsonProperty("epfNumber")
  private String epfNumber;

  @JsonProperty("sameAsCurrentAddress")
  private Boolean sameAsCurrentAddress;

  @JsonProperty("currentAddress")
  private ApplicantAddress currentAddress;

  @JsonProperty("permanentAddress")
  private ApplicantAddress permanentAddress;

  @JsonProperty("applicantId")
  private Integer applicantId;

  public ApplicantInformation pmjjyMoney(Boolean pmjjyMoney) {
    this.pmjjyMoney = pmjjyMoney;
    return this;
  }

  /**
   * Get pmjjyMoney
   * @return pmjjyMoney
  */
  @ApiModelProperty(value = "")


  public Boolean getPmjjyMoney() {
    return pmjjyMoney;
  }

  public void setPmjjyMoney(Boolean pmjjyMoney) {
    this.pmjjyMoney = pmjjyMoney;
  }

  public ApplicantInformation karyaSwaroop(Integer karyaSwaroop) {
    this.karyaSwaroop = karyaSwaroop;
    return this;
  }

  /**
   * Get karyaSwaroop
   * @return karyaSwaroop
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=2) 
  public Integer getKaryaSwaroop() {
    return karyaSwaroop;
  }

  public void setKaryaSwaroop(Integer karyaSwaroop) {
    this.karyaSwaroop = karyaSwaroop;
  }

  public ApplicantInformation karyaPrakriti1(Integer karyaPrakriti1) {
    this.karyaPrakriti1 = karyaPrakriti1;
    return this;
  }

  /**
   * Get karyaPrakriti1
   * @return karyaPrakriti1
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=3) 
  public Integer getKaryaPrakriti1() {
    return karyaPrakriti1;
  }

  public void setKaryaPrakriti1(Integer karyaPrakriti1) {
    this.karyaPrakriti1 = karyaPrakriti1;
  }

  public ApplicantInformation karyaPrakriti2(Integer karyaPrakriti2) {
    this.karyaPrakriti2 = karyaPrakriti2;
    return this;
  }

  /**
   * Get karyaPrakriti2
   * @return karyaPrakriti2
  */
  @ApiModelProperty(value = "")

@Size(max=3) 
  public Integer getKaryaPrakriti2() {
    return karyaPrakriti2;
  }

  public void setKaryaPrakriti2(Integer karyaPrakriti2) {
    this.karyaPrakriti2 = karyaPrakriti2;
  }

  public ApplicantInformation karyaPrakriti3(Integer karyaPrakriti3) {
    this.karyaPrakriti3 = karyaPrakriti3;
    return this;
  }

  /**
   * Get karyaPrakriti3
   * @return karyaPrakriti3
  */
  @ApiModelProperty(value = "")

@Size(max=3) 
  public Integer getKaryaPrakriti3() {
    return karyaPrakriti3;
  }

  public void setKaryaPrakriti3(Integer karyaPrakriti3) {
    this.karyaPrakriti3 = karyaPrakriti3;
  }

  public ApplicantInformation programName(Integer programName) {
    this.programName = programName;
    return this;
  }

  /**
   * Get programName
   * @return programName
  */
  @ApiModelProperty(value = "")

@Size(max=3) 
  public Integer getProgramName() {
    return programName;
  }

  public void setProgramName(Integer programName) {
    this.programName = programName;
  }

  public ApplicantInformation name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=120) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ApplicantInformation nameasAADHAR(String nameasAADHAR) {
    this.nameasAADHAR = nameasAADHAR;
    return this;
  }

  /**
   * Get nameasAADHAR
   * @return nameasAADHAR
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=120) 
  public String getNameasAADHAR() {
    return nameasAADHAR;
  }

  public void setNameasAADHAR(String nameasAADHAR) {
    this.nameasAADHAR = nameasAADHAR;
  }

  public ApplicantInformation familyHeadMemberName(String familyHeadMemberName) {
    this.familyHeadMemberName = familyHeadMemberName;
    return this;
  }

  /**
   * Get familyHeadMemberName
   * @return familyHeadMemberName
  */
  @ApiModelProperty(value = "")

@Size(max=120) 
  public String getFamilyHeadMemberName() {
    return familyHeadMemberName;
  }

  public void setFamilyHeadMemberName(String familyHeadMemberName) {
    this.familyHeadMemberName = familyHeadMemberName;
  }

  public ApplicantInformation fatherNameorHusbandName(String fatherNameorHusbandName) {
    this.fatherNameorHusbandName = fatherNameorHusbandName;
    return this;
  }

  /**
   * Get fatherNameorHusbandName
   * @return fatherNameorHusbandName
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=120) 
  public String getFatherNameorHusbandName() {
    return fatherNameorHusbandName;
  }

  public void setFatherNameorHusbandName(String fatherNameorHusbandName) {
    this.fatherNameorHusbandName = fatherNameorHusbandName;
  }

  public ApplicantInformation fatherORhusband(Integer fatherORhusband) {
    this.fatherORhusband = fatherORhusband;
    return this;
  }

  /**
   * Get fatherORhusband
   * @return fatherORhusband
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=1) 
  public Integer getFatherORhusband() {
    return fatherORhusband;
  }

  public void setFatherORhusband(Integer fatherORhusband) {
    this.fatherORhusband = fatherORhusband;
  }

  public ApplicantInformation motherName(String motherName) {
    this.motherName = motherName;
    return this;
  }

  /**
   * Get motherName
   * @return motherName
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=120) 
  public String getMotherName() {
    return motherName;
  }

  public void setMotherName(String motherName) {
    this.motherName = motherName;
  }

  public ApplicantInformation gender(Integer gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=1) 
  public Integer getGender() {
    return gender;
  }

  public void setGender(Integer gender) {
    this.gender = gender;
  }

  public ApplicantInformation marriage(Integer marriage) {
    this.marriage = marriage;
    return this;
  }

  /**
   * Get marriage
   * @return marriage
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=1) 
  public Integer getMarriage() {
    return marriage;
  }

  public void setMarriage(Integer marriage) {
    this.marriage = marriage;
  }

  public ApplicantInformation dob(String dob) {
    this.dob = dob;
    return this;
  }

  /**
   * Get dob
   * @return dob
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=10) 
  public String getDob() {
    return dob;
  }

  public void setDob(String dob) {
    this.dob = dob;
  }

  public ApplicantInformation age(Integer age) {
    this.age = age;
    return this;
  }

  /**
   * Get age
   * @return age
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=3) 
  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public ApplicantInformation caste(Integer caste) {
    this.caste = caste;
    return this;
  }

  /**
   * Get caste
   * @return caste
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=1) 
  public Integer getCaste() {
    return caste;
  }

  public void setCaste(Integer caste) {
    this.caste = caste;
  }

  public ApplicantInformation manrega(Boolean manrega) {
    this.manrega = manrega;
    return this;
  }

  /**
   * Get manrega
   * @return manrega
  */
  @ApiModelProperty(value = "")


  public Boolean getManrega() {
    return manrega;
  }

  public void setManrega(Boolean manrega) {
    this.manrega = manrega;
  }

  public ApplicantInformation ration(String ration) {
    this.ration = ration;
    return this;
  }

  /**
   * Get ration
   * @return ration
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=50) 
  public String getRation() {
    return ration;
  }

  public void setRation(String ration) {
    this.ration = ration;
  }

  public ApplicantInformation voterId(String voterId) {
    this.voterId = voterId;
    return this;
  }

  /**
   * Get voterId
   * @return voterId
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=50) 
  public String getVoterId() {
    return voterId;
  }

  public void setVoterId(String voterId) {
    this.voterId = voterId;
  }

  public ApplicantInformation rsBy(String rsBy) {
    this.rsBy = rsBy;
    return this;
  }

  /**
   * Get rsBy
   * @return rsBy
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=50) 
  public String getRsBy() {
    return rsBy;
  }

  public void setRsBy(String rsBy) {
    this.rsBy = rsBy;
  }

  public ApplicantInformation aadharCard(String aadharCard) {
    this.aadharCard = aadharCard;
    return this;
  }

  /**
   * Get aadharCard
   * @return aadharCard
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=50) 
  public String getAadharCard() {
    return aadharCard;
  }

  public void setAadharCard(String aadharCard) {
    this.aadharCard = aadharCard;
  }

  public ApplicantInformation bankName(String bankName) {
    this.bankName = bankName;
    return this;
  }

  /**
   * Get bankName
   * @return bankName
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=50) 
  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  public ApplicantInformation branchName(String branchName) {
    this.branchName = branchName;
    return this;
  }

  /**
   * Get branchName
   * @return branchName
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=50) 
  public String getBranchName() {
    return branchName;
  }

  public void setBranchName(String branchName) {
    this.branchName = branchName;
  }

  public ApplicantInformation acNumber(String acNumber) {
    this.acNumber = acNumber;
    return this;
  }

  /**
   * Get acNumber
   * @return acNumber
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=25) 
  public String getAcNumber() {
    return acNumber;
  }

  public void setAcNumber(String acNumber) {
    this.acNumber = acNumber;
  }

  public ApplicantInformation ifsCode(String ifsCode) {
    this.ifsCode = ifsCode;
    return this;
  }

  /**
   * Get ifsCode
   * @return ifsCode
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=15) 
  public String getIfsCode() {
    return ifsCode;
  }

  public void setIfsCode(String ifsCode) {
    this.ifsCode = ifsCode;
  }

  public ApplicantInformation esiNumber(String esiNumber) {
    this.esiNumber = esiNumber;
    return this;
  }

  /**
   * Get esiNumber
   * @return esiNumber
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=12) 
  public String getEsiNumber() {
    return esiNumber;
  }

  public void setEsiNumber(String esiNumber) {
    this.esiNumber = esiNumber;
  }

  public ApplicantInformation epfNumber(String epfNumber) {
    this.epfNumber = epfNumber;
    return this;
  }

  /**
   * Get epfNumber
   * @return epfNumber
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=12) 
  public String getEpfNumber() {
    return epfNumber;
  }

  public void setEpfNumber(String epfNumber) {
    this.epfNumber = epfNumber;
  }

  public ApplicantInformation sameAsCurrentAddress(Boolean sameAsCurrentAddress) {
    this.sameAsCurrentAddress = sameAsCurrentAddress;
    return this;
  }

  /**
   * Get sameAsCurrentAddress
   * @return sameAsCurrentAddress
  */
  @ApiModelProperty(value = "")


  public Boolean getSameAsCurrentAddress() {
    return sameAsCurrentAddress;
  }

  public void setSameAsCurrentAddress(Boolean sameAsCurrentAddress) {
    this.sameAsCurrentAddress = sameAsCurrentAddress;
  }

  public ApplicantInformation currentAddress(ApplicantAddress currentAddress) {
    this.currentAddress = currentAddress;
    return this;
  }

  /**
   * Get currentAddress
   * @return currentAddress
  */
  @ApiModelProperty(value = "")

  @Valid

  public ApplicantAddress getCurrentAddress() {
    return currentAddress;
  }

  public void setCurrentAddress(ApplicantAddress currentAddress) {
    this.currentAddress = currentAddress;
  }

  public ApplicantInformation permanentAddress(ApplicantAddress permanentAddress) {
    this.permanentAddress = permanentAddress;
    return this;
  }

  /**
   * Get permanentAddress
   * @return permanentAddress
  */
  @ApiModelProperty(value = "")

  @Valid

  public ApplicantAddress getPermanentAddress() {
    return permanentAddress;
  }

  public void setPermanentAddress(ApplicantAddress permanentAddress) {
    this.permanentAddress = permanentAddress;
  }

  public ApplicantInformation applicantId(Integer applicantId) {
    this.applicantId = applicantId;
    return this;
  }

  /**
   * Get applicantId
   * @return applicantId
  */
  @ApiModelProperty(value = "")

@Size(max=10) 
  public Integer getApplicantId() {
    return applicantId;
  }

  public void setApplicantId(Integer applicantId) {
    this.applicantId = applicantId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicantInformation applicantInformation = (ApplicantInformation) o;
    return Objects.equals(this.pmjjyMoney, applicantInformation.pmjjyMoney) &&
        Objects.equals(this.karyaSwaroop, applicantInformation.karyaSwaroop) &&
        Objects.equals(this.karyaPrakriti1, applicantInformation.karyaPrakriti1) &&
        Objects.equals(this.karyaPrakriti2, applicantInformation.karyaPrakriti2) &&
        Objects.equals(this.karyaPrakriti3, applicantInformation.karyaPrakriti3) &&
        Objects.equals(this.programName, applicantInformation.programName) &&
        Objects.equals(this.name, applicantInformation.name) &&
        Objects.equals(this.nameasAADHAR, applicantInformation.nameasAADHAR) &&
        Objects.equals(this.familyHeadMemberName, applicantInformation.familyHeadMemberName) &&
        Objects.equals(this.fatherNameorHusbandName, applicantInformation.fatherNameorHusbandName) &&
        Objects.equals(this.fatherORhusband, applicantInformation.fatherORhusband) &&
        Objects.equals(this.motherName, applicantInformation.motherName) &&
        Objects.equals(this.gender, applicantInformation.gender) &&
        Objects.equals(this.marriage, applicantInformation.marriage) &&
        Objects.equals(this.dob, applicantInformation.dob) &&
        Objects.equals(this.age, applicantInformation.age) &&
        Objects.equals(this.caste, applicantInformation.caste) &&
        Objects.equals(this.manrega, applicantInformation.manrega) &&
        Objects.equals(this.ration, applicantInformation.ration) &&
        Objects.equals(this.voterId, applicantInformation.voterId) &&
        Objects.equals(this.rsBy, applicantInformation.rsBy) &&
        Objects.equals(this.aadharCard, applicantInformation.aadharCard) &&
        Objects.equals(this.bankName, applicantInformation.bankName) &&
        Objects.equals(this.branchName, applicantInformation.branchName) &&
        Objects.equals(this.acNumber, applicantInformation.acNumber) &&
        Objects.equals(this.ifsCode, applicantInformation.ifsCode) &&
        Objects.equals(this.esiNumber, applicantInformation.esiNumber) &&
        Objects.equals(this.epfNumber, applicantInformation.epfNumber) &&
        Objects.equals(this.sameAsCurrentAddress, applicantInformation.sameAsCurrentAddress) &&
        Objects.equals(this.currentAddress, applicantInformation.currentAddress) &&
        Objects.equals(this.permanentAddress, applicantInformation.permanentAddress) &&
        Objects.equals(this.applicantId, applicantInformation.applicantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pmjjyMoney, karyaSwaroop, karyaPrakriti1, karyaPrakriti2, karyaPrakriti3, programName, name, nameasAADHAR, familyHeadMemberName, fatherNameorHusbandName, fatherORhusband, motherName, gender, marriage, dob, age, caste, manrega, ration, voterId, rsBy, aadharCard, bankName, branchName, acNumber, ifsCode, esiNumber, epfNumber, sameAsCurrentAddress, currentAddress, permanentAddress, applicantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicantInformation {\n");
    
    sb.append("    pmjjyMoney: ").append(toIndentedString(pmjjyMoney)).append("\n");
    sb.append("    karyaSwaroop: ").append(toIndentedString(karyaSwaroop)).append("\n");
    sb.append("    karyaPrakriti1: ").append(toIndentedString(karyaPrakriti1)).append("\n");
    sb.append("    karyaPrakriti2: ").append(toIndentedString(karyaPrakriti2)).append("\n");
    sb.append("    karyaPrakriti3: ").append(toIndentedString(karyaPrakriti3)).append("\n");
    sb.append("    programName: ").append(toIndentedString(programName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameasAADHAR: ").append(toIndentedString(nameasAADHAR)).append("\n");
    sb.append("    familyHeadMemberName: ").append(toIndentedString(familyHeadMemberName)).append("\n");
    sb.append("    fatherNameorHusbandName: ").append(toIndentedString(fatherNameorHusbandName)).append("\n");
    sb.append("    fatherORhusband: ").append(toIndentedString(fatherORhusband)).append("\n");
    sb.append("    motherName: ").append(toIndentedString(motherName)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    marriage: ").append(toIndentedString(marriage)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    caste: ").append(toIndentedString(caste)).append("\n");
    sb.append("    manrega: ").append(toIndentedString(manrega)).append("\n");
    sb.append("    ration: ").append(toIndentedString(ration)).append("\n");
    sb.append("    voterId: ").append(toIndentedString(voterId)).append("\n");
    sb.append("    rsBy: ").append(toIndentedString(rsBy)).append("\n");
    sb.append("    aadharCard: ").append(toIndentedString(aadharCard)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    branchName: ").append(toIndentedString(branchName)).append("\n");
    sb.append("    acNumber: ").append(toIndentedString(acNumber)).append("\n");
    sb.append("    ifsCode: ").append(toIndentedString(ifsCode)).append("\n");
    sb.append("    esiNumber: ").append(toIndentedString(esiNumber)).append("\n");
    sb.append("    epfNumber: ").append(toIndentedString(epfNumber)).append("\n");
    sb.append("    sameAsCurrentAddress: ").append(toIndentedString(sameAsCurrentAddress)).append("\n");
    sb.append("    currentAddress: ").append(toIndentedString(currentAddress)).append("\n");
    sb.append("    permanentAddress: ").append(toIndentedString(permanentAddress)).append("\n");
    sb.append("    applicantId: ").append(toIndentedString(applicantId)).append("\n");
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

