package com.example.bmc208mobileassignment.model;

public class Residence {
    private String residenceID;
    private String address;
    private int numUnits;
    private int sizePerUnit;
    private double monthlyRental;
    private static int generateResidenceID = 1;

    public Residence() {
    }

    public Residence(String address, int numUnits, int sizePerUnit, double monthlyRental) {
        this.residenceID = String.format("R%03d", generateResidenceID++);
        this.address = address;
        this.numUnits = numUnits;
        this.sizePerUnit = sizePerUnit;
        this.monthlyRental = monthlyRental;
    }

    public static class Unit{
        private String unitNo;
        private boolean availability;
        private static int generateUnitNo = 1;

        public Unit() {
        }

        public Unit(String unitNo) {
            this.unitNo = String.format("U%03d", generateUnitNo++);
            this.availability = true;
        }

        public String getUnitNo() {
            return unitNo;
        }

        private void setUnitNo(String unitNo) {
            this.unitNo = unitNo;
        }

        public boolean isAvailability() {
            return availability;
        }

        public void setAvailability(boolean availability) {
            this.availability = availability;
        }

        public static int getGenerateUnitNo() {
            return generateUnitNo;
        }

        @Override
        public String toString() {
            return "Unit{" +
                    "unitNo='" + unitNo + '\'' +
                    ", availability=" + availability +
                    '}';
        }
    }

    public String getResidenceID() {
        return residenceID;
    }

    private void setResidenceID(String residenceID) {
        this.residenceID = residenceID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumUnits() {
        return numUnits;
    }

    public void setNumUnits(int numUnits) {
        this.numUnits = numUnits;
    }

    public int getSizePerUnit() {
        return sizePerUnit;
    }

    public void setSizePerUnit(int sizePerUnit) {
        this.sizePerUnit = sizePerUnit;
    }

    public double getMonthlyRental() {
        return monthlyRental;
    }

    public void setMonthlyRental(double monthlyRental) {
        this.monthlyRental = monthlyRental;
    }

    public static int getGenerateResidenceID() {
        return generateResidenceID;
    }

    @Override
    public String toString() {
        return "Residence{" +
                "residenceID='" + residenceID + '\'' +
                ", address='" + address + '\'' +
                ", numUnits=" + numUnits +
                ", sizePerUnit=" + sizePerUnit +
                ", monthlyRental=" + monthlyRental +
                '}';
    }
}
