package com.example.bmc208mobileassignment.model;

public class Application {
    private String applicationID;
    private String applicationDate;
    private int requiredMonth;
    private int requiredYear;
    private String status;
    private static int generateApplicationID = 1;

    public Application() {
    }

    public Application(String applicationID, String applicationDate, int requiredMonth, int requiredYear) {
        this.applicationID = String.format("A%03d", generateApplicationID++);
        this.applicationDate = applicationDate;
        this.requiredMonth = requiredMonth;
        this.requiredYear = requiredYear;
        this.status = "New";
    }

    public String getApplicationID() {
        return applicationID;
    }

    private void setApplicationID(String applicationID) {
        this.applicationID = applicationID;
    }

    public String getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(String applicationDate) {
        this.applicationDate = applicationDate;
    }

    public int getRequiredMonth() {
        return requiredMonth;
    }

    public void setRequiredMonth(int requiredMonth) {
        this.requiredMonth = requiredMonth;
    }

    public int getRequiredYear() {
        return requiredYear;
    }

    public void setRequiredYear(int requiredYear) {
        this.requiredYear = requiredYear;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static int getGenerateApplicationID() {
        return generateApplicationID;
    }

    @Override
    public String toString() {
        return "Application{" +
                "applicationID='" + applicationID + '\'' +
                ", applicationDate='" + applicationDate + '\'' +
                ", requiredMonth=" + requiredMonth +
                ", requiredYear=" + requiredYear +
                ", status='" + status + '\'' +
                '}';
    }
}
