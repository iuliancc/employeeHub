package com.threedi.hub.employeeHub.fileDomain;

public class Department {

    private double DepartmentCode;
    private String DepartmentName;


    public Department(double departmentCode, String departmentName) {
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
