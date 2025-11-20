package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Intern
 */

@JsonTypeName("intern")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-10-14T12:32:47.611557+05:30[Asia/Kolkata]", comments = "Generator version: 7.8.0")
public class Intern {

  private Long internId;

  private String rollNo;

  private String firstName;

  private String lastName;

  private String contactNo;

  private String fatherName;

  private String motherName;

  public Intern internId(Long internId) {
    this.internId = internId;
    return this;
  }

  /**
   * Get internId
   * @return internId
   */
  
  @Schema(name = "internId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("internId")
  public Long getInternId() {
    return internId;
  }

  public void setInternId(Long internId) {
    this.internId = internId;
  }

  public Intern rollNo(String rollNo) {
    this.rollNo = rollNo;
    return this;
  }

  /**
   * Get rollNo
   * @return rollNo
   */
  @Size(min = 1, max = 10) 
  @Schema(name = "rollNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rollNo")
  public String getRollNo() {
    return rollNo;
  }

  public void setRollNo(String rollNo) {
    this.rollNo = rollNo;
  }

  public Intern firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
   */
  
  @Schema(name = "firstName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Intern lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
   */
  
  @Schema(name = "lastName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Intern contactNo(String contactNo) {
    this.contactNo = contactNo;
    return this;
  }

  /**
   * Get contactNo
   * @return contactNo
   */
  
  @Schema(name = "contactNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contactNo")
  public String getContactNo() {
    return contactNo;
  }

  public void setContactNo(String contactNo) {
    this.contactNo = contactNo;
  }

  public Intern fatherName(String fatherName) {
    this.fatherName = fatherName;
    return this;
  }

  /**
   * Get fatherName
   * @return fatherName
   */
  
  @Schema(name = "fatherName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fatherName")
  public String getFatherName() {
    return fatherName;
  }

  public void setFatherName(String fatherName) {
    this.fatherName = fatherName;
  }

  public Intern motherName(String motherName) {
    this.motherName = motherName;
    return this;
  }

  /**
   * Get motherName
   * @return motherName
   */
  
  @Schema(name = "motherName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("motherName")
  public String getMotherName() {
    return motherName;
  }

  public void setMotherName(String motherName) {
    this.motherName = motherName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Intern intern = (Intern) o;
    return Objects.equals(this.internId, intern.internId) &&
        Objects.equals(this.rollNo, intern.rollNo) &&
        Objects.equals(this.firstName, intern.firstName) &&
        Objects.equals(this.lastName, intern.lastName) &&
        Objects.equals(this.contactNo, intern.contactNo) &&
        Objects.equals(this.fatherName, intern.fatherName) &&
        Objects.equals(this.motherName, intern.motherName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(internId, rollNo, firstName, lastName, contactNo, fatherName, motherName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Intern {\n");
    sb.append("    internId: ").append(toIndentedString(internId)).append("\n");
    sb.append("    rollNo: ").append(toIndentedString(rollNo)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    contactNo: ").append(toIndentedString(contactNo)).append("\n");
    sb.append("    fatherName: ").append(toIndentedString(fatherName)).append("\n");
    sb.append("    motherName: ").append(toIndentedString(motherName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

