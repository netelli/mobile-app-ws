package com.apps.ws.mobileappws.service.impl;

import com.apps.ws.mobileappws.service.UserService;
import com.apps.ws.mobileappws.ui.model.request.UserDetailsRequestModel;
import com.apps.ws.mobileappws.ui.model.response.UserRest;
import com.apps.ws.mobileappws.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    private Utils utils;
    Map<String, UserRest> users;

    public UserServiceImpl() {
    }

    @Autowired
    public UserServiceImpl(Utils utils) {
        this.utils = utils;
    }

    @Override
    public UserRest createUser(UserDetailsRequestModel userDetails) {
        UserRest userRest = new UserRest();
        userRest.setFirstName(userDetails.getFirstName());
        userRest.setLastName(userDetails.getLastName());
        userRest.setEmail(userDetails.getEmail());
        String userId = utils.generateUserId();
        userRest.setUserId(userId);

        if (users == null) {
            users = new HashMap<>();
        }
        users.put(userId, userRest);
        return userRest;
    }
}
