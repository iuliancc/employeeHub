package com.threedi.hub.employeeHub.applicationService;


import com.threedi.hub.employeeHub.infrastructure.AppConfigurationProperties;
import com.threedi.hub.employeeHub.fileDomain.ExelFile;
import com.threedi.hub.employeeHub.fileDomain.GenericFile;
import com.threedi.hub.employeeHub.repos.ExelFileRepository;
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


    private AppConfigurationProperties appConfigurationProperties;
    private ExelFileRepository exelFileRepository;


    private long timedif;
    private File file;

    @Autowired
    public WhenFileUpdatedService(AppConfigurationProperties appConfigurationProperties,ExelFileRepository exelFileRepository) {
        this.appConfigurationProperties = appConfigurationProperties;
        this.exelFileRepository = exelFileRepository;
    }

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

            exelFileRepository.addExelFile((ExelFile) fileWithValues);
        }

        this.timedif = timedif;

    }
}





