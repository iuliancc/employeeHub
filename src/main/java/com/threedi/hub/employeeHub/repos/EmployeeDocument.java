package com.threedi.hub.employeeHub.repos;



import org.springframework.data.mongodb.core.mapping.Document;


import java.util.Date;

@Document(collection = "employee")
public class EmployeeDocument {

    private String employeeCode;
    private String firstName;
    private String lastName;
    private String gender;
    private Date dob;
    private String contactNumber;
    private String email;
    private DepartmentDocument department;
    private AddressDocument address;
    private Boolean isCurrentAddress;


    public EmployeeDocument(String employeeCode, String firstName, String lastName, String gender, Date dob, String contactNumber, String email, DepartmentDocument department, AddressDocument address, Boolean isCurrentAddress) {
        this.employeeCode = employeeCode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dob = dob;
        this.contactNumber = contactNumber;
        this.email = email;
        this.department = department;
        this.address = address;
        this.isCurrentAddress = isCurrentAddress;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public DepartmentDocument getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentDocument department) {
        this.department = department;
    }

    public AddressDocument getAddress() {
        return address;
    }

    public void setAddress(AddressDocument address) {
        this.address = address;
    }

    public Boolean getCurrentAddress() {
        return isCurrentAddress;
    }

    public void setCurrentAddress(Boolean currentAddress) {
        isCurrentAddress = currentAddress;
    }
}

class DepartmentDocument {

    private double DepartmentCode;
    private String DepartmentName;


    public DepartmentDocument(double departmentCode, String departmentName) {
        DepartmentCode = departmentCode;
        DepartmentName = departmentName;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }

    public double getDepartmentCode() {
        return DepartmentCode;
    }

    public void setDepartmentCode(double departmentCode) {
        DepartmentCode = departmentCode;
    }

}

class AddressDocument{
    private  String addressLine1 ;
    private  String addressLine2 ;
    private  String addressTown  ;
    private  String addressPostCode ;
    private  String addressCountry ;


    public AddressDocument(String addressLine1, String addressLine2, String addressTown, String addressPostCode, String addressCountry) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressTown = addressTown;
        this.addressPostCode = addressPostCode;
        this.addressCountry = addressCountry;
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

    public String getAddressPostCode() {
        return addressPostCode;
    }

    public void setAddressPostCode(String addressPostCode) {
        this.addressPostCode = addressPostCode;
    }

    public String getAddressCountry() {
        return addressCountry;
    }

    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
    }


}
