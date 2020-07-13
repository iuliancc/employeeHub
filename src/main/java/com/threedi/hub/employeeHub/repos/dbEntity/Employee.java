package com.threedi.hub.employeeHub.repos.dbEntity;

import java.util.Date;
import java.util.Objects;

public class Employee {


    private int id;
    private String employeeCode;
    private String firstName;
    private String lastName;
    private int gender;
    private Date dob;
    private String email;
    private String contactNumber;

    public Employee(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
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

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                gender == employee.gender &&
                employeeCode.equals(employee.employeeCode) &&
                firstName.equals(employee.firstName) &&
                lastName.equals(employee.lastName) &&
                dob.equals(employee.dob) &&
                email.equals(employee.email) &&
                contactNumber.equals(employee.contactNumber);
    }

    public int hashCode() {
        return Objects.hash(id, employeeCode, firstName, lastName, gender, dob, email, contactNumber);
    }

    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", employeeCode='" + employeeCode + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                '}';
    }
}
