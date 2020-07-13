package com.threedi.hub.employeeHub.applicationService;


import com.threedi.hub.employeeHub.infrastructure.AppConfigurationProperties;
import com.threedi.hub.employeeHub.fileDomain.ExelFile;
import com.threedi.hub.employeeHub.fileDomain.GenericFile;
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

    private long timedif;
    private File file;

    @PostConstruct
    public void postConstruct() {

        file = new File("employeeHubImport.xlsx");
        timedif = file.lastModified();

    }

    @Async
    @Scheduled(fixedDelay = 3000)
    public void whenUpdated() throws Exception {

        log.trace("I am working");
        long timedif = file.lastModified();
        log.trace("Time dif is :" + timedif);

        if (!(this.timedif == timedif)) {

            GenericFile fileWithValues = new ExelFile();

                fileWithValues.updatefileFromFolder(file);

        }

        this.timedif = timedif;

    }
}





