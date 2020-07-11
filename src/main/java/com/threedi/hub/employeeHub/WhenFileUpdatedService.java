package com.threedi.hub.employeeHub;


import com.threedi.hub.employeeHub.infrastructure.AppConfigurationProperties;
import com.threedi.hub.employeeHub.retriveValuesDomain.ExelFile;
import com.threedi.hub.employeeHub.retriveValuesDomain.GenericFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.File;

@Service
public class WhenFileUpdatedService {



    private static final Logger log = LoggerFactory.getLogger(WhenFileUpdatedService.class);

    @Autowired
    AppConfigurationProperties appConfigurationProperties;

    private Long timedif;
    private File file;

    @PostConstruct
    public void postConstruct() {

        file = new File(appConfigurationProperties.getPath());
        timedif = file.lastModified();

    }

    @Async
    @Scheduled(fixedDelay = 1000)
    public void whenUpdated() {

        Long timedif = file.lastModified();
        if (!this.timedif.equals(timedif)) {

            GenericFile fileWithValues = new ExelFile(File);
            fileWithValues.employeesValues;

            repo.save(employeesValues)


        }


    }


}


