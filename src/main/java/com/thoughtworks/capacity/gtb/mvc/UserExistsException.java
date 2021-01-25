package com.thoughtworks.capacity.gtb.mvc;

public class UserExistsException extends RuntimeException {

    public UserExistsException(String message) {
        super(message);
    }
}
