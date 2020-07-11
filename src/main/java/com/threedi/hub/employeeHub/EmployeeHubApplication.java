package com.threedi.hub.employeeHub;

import com.threedi.hub.employeeHub.infrastructure.AppConfigurationProperties;
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
public class EmployeeHubApplication {

	@Resource
	ApplicationService applicationService;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeHubApplication.class, args);
	}



}
