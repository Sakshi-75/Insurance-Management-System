package com.insurance.management.system.maturity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MaturityDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long policyId;
    private String policyHolderName;
    private double sumAssured;
    private int years;
    private double premiumAmount;
    private float rateOfInterest;
    private double paidAmount;

    public MaturityDetails() {
    }

    public MaturityDetails(Long policyId, String policyHolderName, double sumAssured, int years, double premiumAmount, float rateOfInterest, double paidAmount) {
        this.policyId = policyId;
        this.policyHolderName = policyHolderName;
        this.sumAssured = sumAssured;
        this.years = years;
        this.premiumAmount = premiumAmount;
        this.rateOfInterest = rateOfInterest;
        this.paidAmount = paidAmount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    public String getPolicyHolderName() {
        return policyHolderName;
    }

    public void setPolicyHolderName(String policyHolderName) {
        this.policyHolderName = policyHolderName;
    }

    public double getSumAssured() {
        return sumAssured;
    }

    public void setSumAssured(double sumAssured) {
        this.sumAssured = sumAssured;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public double getPremiumAmount() {
        return premiumAmount;
    }

    public void setPremiumAmount(double premiumAmount) {
        this.premiumAmount = premiumAmount;
    }

    public float getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(float rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public double getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(double paidAmount) {
        this.paidAmount = paidAmount;
    }
}
