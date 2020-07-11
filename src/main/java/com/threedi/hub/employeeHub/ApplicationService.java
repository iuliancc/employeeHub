package com.threedi.hub.employeeHub;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.File;



@Service
public class ApplicationService {


    private static final Logger log = LoggerFactory.getLogger(ApplicationService.class);


    public void updateFile() {

        // check if file has been modified
        File file =new File("employeeHubImport.xlsx");



        log.debug("files path is" + file.getAbsoluteFile() + " ");
        long timeDifference = file.lastModified();



        // if fileModified(){
        // GenericFile  = ExcelFile(file)
        // }

        // if file modified save it on the database


    }

}
