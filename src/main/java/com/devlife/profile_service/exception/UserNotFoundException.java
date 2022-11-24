package com.devlife.profile_service.exception;

public class UserNotFoundException extends IllegalArgumentException{
    public UserNotFoundException(String... s) {
        super("User not found \n " + s.toString());
    }
}
