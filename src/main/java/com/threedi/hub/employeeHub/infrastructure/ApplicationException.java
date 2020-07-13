package com.threedi.hub.employeeHub.infrastructure;

public class ApplicationException extends RuntimeException {

    public ApplicationException(String errorMessage) {
        super(errorMessage);
    }
}


