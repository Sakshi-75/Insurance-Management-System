package com.insurance.management.system.policy;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PolicyDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String policyHolderName;
    private int age;
    private Long clientId;
    private double sumAssuredAmount;
    private float years;
    private String modeOfPayment;
    private String depositDate;
    private double premiumAmount;
    private String nomineeDetails;
    private int nomineeAge;
    private String relationship;
    private String policyType;

    public PolicyDetails() {
    }

    public PolicyDetails(String policyHolderName, int age, Long clientId, double sumAssuredAmount, float years, String modeOfPayment, String depositDate, double premiumAmount, String nomineeDetails, int nomineeAge, String relationship, String policyType) {
        this.policyHolderName = policyHolderName;
        this.age = age;
        this.clientId = clientId;
        this.sumAssuredAmount = sumAssuredAmount;
        this.years = years;
        this.modeOfPayment = modeOfPayment;
        this.depositDate = depositDate;
        this.premiumAmount = premiumAmount;
        this.nomineeDetails = nomineeDetails;
        this.nomineeAge = nomineeAge;
        this.relationship = relationship;
        this.policyType = policyType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPolicyHolderName() {
        return policyHolderName;
    }

    public void setPolicyHolderName(String policyHolderName) {
        this.policyHolderName = policyHolderName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public double getSumAssuredAmount() {
        return sumAssuredAmount;
    }

    public void setSumAssuredAmount(double sumAssuredAmount) {
        this.sumAssuredAmount = sumAssuredAmount;
    }

    public float getYears() {
        return years;
    }

    public void setYears(float years) {
        this.years = years;
    }

    public String getModeOfPayment() {
        return modeOfPayment;
    }

    public void setModeOfPayment(String modeOfPayment) {
        this.modeOfPayment = modeOfPayment;
    }

    public String getDepositDate() {
        return depositDate;
    }

    public void setDepositDate(String depositDate) {
        this.depositDate = depositDate;
    }

    public double getPremiumAmount() {
        return premiumAmount;
    }

    public void setPremiumAmount(double premiumAmount) {
        this.premiumAmount = premiumAmount;
    }

    public String getNomineeDetails() {
        return nomineeDetails;
    }

    public void setNomineeDetails(String nomineeDetails) {
        this.nomineeDetails = nomineeDetails;
    }

    public int getNomineeAge() {
        return nomineeAge;
    }

    public void setNomineeAge(int nomineeAge) {
        this.nomineeAge = nomineeAge;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }
}
