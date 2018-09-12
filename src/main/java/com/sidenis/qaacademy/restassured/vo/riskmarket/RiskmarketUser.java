package com.sidenis.qaacademy.restassured.vo.riskmarket;

/**
 * Started by ML on 9/12/2018.
 */
public class RiskmarketUser {
    private Long id;
    private String email;
    private String displayName;
    private String userType;
    private String[] roles;
    private String firstName;
    private String lastName;
    private String middleName;
    private String phoneNumber;
    private String birthDate;
    private Integer bonusesCount;
    private String nationalIdDocument;
    private String internationalPassport;
    private String partnerCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String[] getRoles() {
        return roles;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getBonusesCount() {
        return bonusesCount;
    }

    public void setBonusesCount(Integer bonusesCount) {
        this.bonusesCount = bonusesCount;
    }

    public String getNationalIdDocument() {
        return nationalIdDocument;
    }

    public void setNationalIdDocument(String nationalIdDocument) {
        this.nationalIdDocument = nationalIdDocument;
    }

    public String getInternationalPassport() {
        return internationalPassport;
    }

    public void setInternationalPassport(String internationalPassport) {
        this.internationalPassport = internationalPassport;
    }

    public String getPartnerCode() {
        return partnerCode;
    }

    public void setPartnerCode(String partnerCode) {
        this.partnerCode = partnerCode;
    }
}
