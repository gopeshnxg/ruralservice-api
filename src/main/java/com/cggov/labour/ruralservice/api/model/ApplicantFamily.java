package com.cggov.labour.ruralservice.api.model;

import java.util.Objects;
import com.cggov.labour.ruralservice.api.model.ApplicantFamilyMembers;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ApplicantFamily
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-07T15:38:48.432585-05:00[America/New_York]")

public class ApplicantFamily   {
  @JsonProperty("applicantId")
  private Integer applicantId;

  @JsonProperty("members")
  @Valid
  private List<ApplicantFamilyMembers> members = null;

  public ApplicantFamily applicantId(Integer applicantId) {
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

  public ApplicantFamily members(List<ApplicantFamilyMembers> members) {
    this.members = members;
    return this;
  }

  public ApplicantFamily addMembersItem(ApplicantFamilyMembers membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<>();
    }
    this.members.add(membersItem);
    return this;
  }

  /**
   * Get members
   * @return members
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ApplicantFamilyMembers> getMembers() {
    return members;
  }

  public void setMembers(List<ApplicantFamilyMembers> members) {
    this.members = members;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicantFamily applicantFamily = (ApplicantFamily) o;
    return Objects.equals(this.applicantId, applicantFamily.applicantId) &&
        Objects.equals(this.members, applicantFamily.members);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicantId, members);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicantFamily {\n");
    
    sb.append("    applicantId: ").append(toIndentedString(applicantId)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
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

