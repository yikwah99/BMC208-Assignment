package com.example.bmc208mobileassignment.model;

public class HousingOfficer extends User{
    private String staffID;

    public HousingOfficer() {
    }

    public HousingOfficer(String username, String password, String fullname, String staffID) {
        super(username, password, fullname);
        this.staffID = staffID;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    @Override
    public String toString() {
        return "HousingOfficer{" +
                "staffID='" + staffID + '\'' +
                '}';
    }
}
