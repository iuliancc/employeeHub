package com.threedi.hub.employeeHub.infrastructure;


import org.springframework.boot.context.properties.ConfigurationProperties;



@ConfigurationProperties(prefix = "app")
public class AppConfigurationProperties {

    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
