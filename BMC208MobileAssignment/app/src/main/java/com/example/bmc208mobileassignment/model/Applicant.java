package com.example.bmc208mobileassignment.model;

public class Applicant extends User{
    private String email;
    private double monthlyIncome;

    public Applicant() {
    }

    public Applicant(String username, String password, String fullname, String email, double monthlyIncome) {
        super(username, password, fullname);
        this.email = email;
        this.monthlyIncome = monthlyIncome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "email='" + email + '\'' +
                ", monthlyIncome=" + monthlyIncome +
                '}';
    }
}
