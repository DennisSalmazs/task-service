package com.teambridge.exception;

public class UserNotEmployeeException extends RuntimeException {
    public UserNotEmployeeException(String message) {
        super(message);
    }
}
