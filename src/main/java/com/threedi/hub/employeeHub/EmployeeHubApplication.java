package com.threedi.hub.employeeHub;

import com.threedi.hub.employeeHub.applicationService.ApplicationService;
import com.threedi.hub.employeeHub.infrastructure.AppConfigurationProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import javax.annotation.Resource;



@EnableConfigurationProperties(AppConfigurationProperties.class)
@EnableAsync
@EnableScheduling
@SpringBootApplication
public class EmployeeHubApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(EmployeeHubApplication.class);

    @Resource
    ApplicationService applicationService;

    public static void main(String[] args) {
        SpringApplication.run(EmployeeHubApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
    }
}
