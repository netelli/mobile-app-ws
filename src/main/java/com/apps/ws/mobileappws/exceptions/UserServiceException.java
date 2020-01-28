package com.apps.ws.mobileappws.exceptions;

public class UserServiceException extends RuntimeException {

    private static final long serialVersionUID = -648661217410499727L;

    public UserServiceException(String message) {
        super(message);
    }
}
