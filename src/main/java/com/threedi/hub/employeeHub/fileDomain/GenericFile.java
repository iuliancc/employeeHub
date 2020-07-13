package com.threedi.hub.employeeHub.fileDomain;

import java.io.File;
import java.util.ArrayList;

public interface GenericFile {

    ArrayList<Employee> getListOfEmployee();

    void updatefileFromFolder(File file) throws Exception;


}
