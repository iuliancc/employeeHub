package com.threedi.hub.employeeHub.repos.dbEntity;

import java.util.Objects;

public class Department {

    private int id;
    private String departmentCode;
    private String departmentName;

    public Department(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return id == that.id &&
                departmentCode.equals(that.departmentCode) &&
                departmentName.equals(that.departmentName);
    }

    public int hashCode() {
        return Objects.hash(id, departmentCode, departmentName);
    }

    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentCode='" + departmentCode + '\'' +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}

