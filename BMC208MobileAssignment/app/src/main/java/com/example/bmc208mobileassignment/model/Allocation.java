package com.example.bmc208mobileassignment.model;

public class Allocation {
    private String fromDate;
    private int duration;
    private String endDate;

    public Allocation() {
    }

    public Allocation(String fromDate, int duration, String endDate) {
        this.fromDate = fromDate;
        this.duration = duration;
        this.endDate = endDate;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Allocation{" +
                "fromDate='" + fromDate + '\'' +
                ", duration=" + duration +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
