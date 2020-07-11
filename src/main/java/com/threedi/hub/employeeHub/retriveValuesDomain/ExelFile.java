package com.threedi.hub.employeeHub.retriveValuesDomain;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExelFile implements GenericFile {

    private final ArrayList<Employee> listOfEmployee = new ArrayList(25);
    private File file;



    public void fileUpdatedInFolder(File file) {

        try {

            Workbook workbook = WorkbookFactory.create(file);


        } catch (IOException e) {

            e.printStackTrace();

        }
        //here I retreive the list of Employees

    }

    public List<Employee> getListOfEmployee() {
        fileUpdatedInFolder(file);
        return listOfEmployee;
    }
}
