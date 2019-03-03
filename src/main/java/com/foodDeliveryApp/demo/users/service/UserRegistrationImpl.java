package com.foodDeliveryApp.demo.users.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.foodDeliveryApp.demo.users.Dao.UserRegistrationRequestDao;
import com.foodDeliveryApp.demo.users.Dao.UserRegistrationResponseDao;

public class UserRegistrationImpl implements UserRegistrationService
{

    public final static Logger logger = LoggerFactory.getLogger(UserRegistrationImpl.class);

    @Override
    public UserRegistrationResponseDao registration(UserRegistrationRequestDao request)
    {
        logger.info("registration service is invoked.");
        UserRegistrationResponseDao userRegistrationResponseDao = null;
        try {

        } catch (Exception e) {

        }

        return userRegistrationResponseDao;
    }

    @Override
    public boolean isUserExist(UserRegistrationRequestDao request)
    {
        return false;
    }

}
