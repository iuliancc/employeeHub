package com.threedi.hub.employeeHub.fileDomain;


import java.util.Date;

public class Employee {

    private String employeeCode;
    private String firstName;
    private String lastName;
    private String gender;
    private Date dob;
    private String contactNumber;
    private String email;
    private Department department;
    private Address address;
    private Boolean isCurrentAddress;

    private Employee() {

    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public Date getDob() {
        return dob;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public Department getDepartment() {
        return department;
    }

    public Address getAddress() {
        return address;
    }

    public Boolean getCurrentAddress() {
        return isCurrentAddress;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeCode='" + employeeCode + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", dob=" + dob +
                ", contactNumber='" + contactNumber + '\'' +
                ", email='" + email + '\'' +
                ", department=" + department +
                ", address=" + address +
                ", isCurrentAddress=" + isCurrentAddress +
                '}';
    }

    public static class Builder {

        private String employeeCode;
        private String firstName;
        private String lastName;
        private String gender;
        private Date dob;
        private String contactNumber;
        private String email;
        private Department department;
        private Address address;
        private Boolean isCurrentAddress;


        public Builder withEmployeeCode(String employeeCode) {

            this.employeeCode = employeeCode;
            return this;
        }

        public Builder withFirstName(String firstName) {

            this.firstName = firstName;
            return this;

        }

        public Builder withLastName(String lastName) {

            this.lastName = lastName;
            return this;

        }

        public Builder withGender(String gender) {

            this.gender = gender;
            return this;

        }

        public Builder withDob(Date date) {

            this.dob = date;
            return this;

        }

        public Builder withContactNumber(String contactNumber) {

            this.contactNumber = contactNumber;
            return this;
        }

        public Builder withEmail(String email) {

            this.email = email;
            return this;

        }

        public Builder withDepartment(Department department) {

            this.department = department;
            return this;
        }

        public Builder withAddress(Address address) {

            this.address = address;
            return this;
        }

        public Builder withIsCurrentAddress(Boolean isCurrentAddress) {
            this.isCurrentAddress = isCurrentAddress;
            return this;
        }

        public Employee build() {
            Employee employee = new Employee();
            employee.employeeCode = this.employeeCode;
            employee.firstName = this.firstName;
            employee.lastName = this.lastName;
            employee.gender = this.gender;
            employee.dob = this.dob;
            employee.contactNumber = this.contactNumber;
            employee.email = this.email;
            employee.department = this.department;
            employee.address = this.address;
            employee.isCurrentAddress = this.isCurrentAddress;

            return employee;
        }

    }
}
