package com.threedi.hub.employeeHub.fileDomain;

import com.threedi.hub.employeeHub.infrastructure.ApplicationException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.File;
import java.util.ArrayList;

public class ExelFile implements GenericFile {

    private final ArrayList<Employee> listOfEmployee = new ArrayList();


    private static final Logger log = LoggerFactory.getLogger(ExelFile.class);


    public void updatefileFromFolder(File file) throws Exception {

        Workbook workbook = WorkbookFactory.create(file);

//        assert workbook != null;
//        log.trace("......" + exelfilePath.getName() + " has " + workbook.getNumberOfSheets() + " Sheets ");

        Sheet sheet = workbook.getSheetAt(0);
        log.trace("The sheet value is : " + (sheet));

        for (Row row : sheet) {

            if (row.getRowNum() == 0) {
                continue;
            }

            final Employee employee = new Employee.Builder().withEmployeeCode(row.getCell(0, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue())
                    .withFirstName(row.getCell(1, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue())
                    .withLastName(row.getCell(2, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue())
                    .withGender(row.getCell(3, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue())
                    .withDob(row.getCell(4, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getDateCellValue())
                    .withContactNumber(row.getCell(5, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue())
                    .withEmail(row.getCell(6, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue())
                    .withDepartment(new Department(row.getCell(7, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getNumericCellValue(), row.getCell(8, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue()))
                    .withAddress(new Address(row.getCell(9, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue(), row.getCell(10, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue(), row.getCell(11, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue(), row.getCell(12, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue(), row.getCell(13, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue()))
                    .withIsCurrentAddress(convertIsCurrentAddressToBoolean(row.getCell(14, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue()))
                    .build();

            log.trace("The Employee who is taken from row :" + row.getRowNum() + " \n" + employee);
            listOfEmployee.add(employee);

        }


    }

    public ArrayList<Employee> getListOfEmployee() {
        return listOfEmployee;
    }

    private boolean convertIsCurrentAddressToBoolean(String s) {

        switch (s) {

            case "Yes":
            case "YES":
            case "yes":
                return true;
            case "NO":
            case "no":
            case "No":
                return false;
            default:
                throw new ApplicationException("The cell should have as values : 'Yes' or 'No'");

        }
    }


}
