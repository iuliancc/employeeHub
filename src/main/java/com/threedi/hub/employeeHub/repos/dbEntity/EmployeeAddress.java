package com.threedi.hub.employeeHub.repos.dbEntity;

import java.util.Objects;

public class EmployeeAddress {

    private int id;
    private int employeeID;
    private String addressLine1;
    private String addressLine2;
    private String addressTown;
    private String addressPostcode;
    private String addressCountry;
    private int isCurrent;

    public EmployeeAddress(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getAddressTown() {
        return addressTown;
    }

    public void setAddressTown(String addressTown) {
        this.addressTown = addressTown;
    }

    public String getAddressPostcode() {
        return addressPostcode;
    }

    public void setAddressPostcode(String addressPostcode) {
        this.addressPostcode = addressPostcode;
    }

    public String getAddressCountry() {
        return addressCountry;
    }

    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
    }

    public int getIsCurrent() {
        return isCurrent;
    }

    public void setIsCurrent(int isCurrent) {
        this.isCurrent = isCurrent;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeAddress that = (EmployeeAddress) o;
        return id == that.id &&
                isCurrent == that.isCurrent &&
                employeeID == that.employeeID &&
                addressLine1.equals(that.addressLine1) &&
                addressLine2.equals(that.addressLine2) &&
                addressTown.equals(that.addressTown) &&
                addressPostcode.equals(that.addressPostcode) &&
                addressCountry.equals(that.addressCountry);
    }

    public int hashCode() {
        return Objects.hash(id, employeeID, addressLine1, addressLine2, addressTown, addressPostcode, addressCountry, isCurrent);
    }

    public String toString() {
        return "EmployeeAddress{" +
                "id=" + id +
                ", employeeID='" + employeeID + '\'' +
                ", addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", addressTown='" + addressTown + '\'' +
                ", addressPostcode='" + addressPostcode + '\'' +
                ", addressCountry='" + addressCountry + '\'' +
                ", isCurrent=" + isCurrent +
                '}';
    }

}
