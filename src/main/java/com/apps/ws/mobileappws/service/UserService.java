package com.apps.ws.mobileappws.service;

import com.apps.ws.mobileappws.ui.model.request.UserDetailsRequestModel;
import com.apps.ws.mobileappws.ui.model.response.UserRest;

public interface UserService {

    public UserRest createUser(UserDetailsRequestModel userDetails);
}
