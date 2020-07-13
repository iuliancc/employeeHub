package com.threedi.hub.employeeHub.repos;


import com.threedi.hub.employeeHub.fileDomain.Employee;
import com.threedi.hub.employeeHub.fileDomain.ExelFile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


public interface ExelFileRepository {

    void addExelFile(ExelFile excelFile);

}


// you can use hibernate or any other implementation for the database as the database is decoupled from the domain.
//I have used mongo just because is faster and the scenario of the task has fit it very well with the mongo database.
@Service
class ExelFileImplementation implements ExelFileRepository {

    private final MongoOperations mongoOperations;

    @Autowired
    public ExelFileImplementation(MongoOperations mongoOperations) {
        this.mongoOperations = mongoOperations;
    }

    @Override
    public void addExelFile(ExelFile excelFile) {

        final ArrayList<Employee> listOfEmployeeFromFile = excelFile.getListOfEmployee();

        listOfEmployeeFromFile.forEach(employee ->

                mongoOperations.save(new EmployeeDocument(

                        employee.getEmployeeCode(), employee.getFirstName(), employee.getLastName(), employee.getGender(), employee.getDob(), employee.getContactNumber(), employee.getEmail(), new DepartmentDocument(employee.getDepartment().getDepartmentCode(), employee.getDepartment().getDepartmentName()), new AddressDocument(employee.getAddress().getAddressLine1(), employee.getAddress().getAddressLine2(), employee.getAddress().getAddressTown(), employee.getAddress().getAddressPostCode(), employee.getAddress().getAddressTown()), employee.getIsCurrentAddress())

                ));

    }

}


