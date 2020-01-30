package com.apps.ws.mobileappws.utils;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class Utils {

    public String generateUserId() {
        return UUID.randomUUID().toString();
    }
}
