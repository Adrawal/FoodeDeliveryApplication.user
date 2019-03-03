package com.foodDeliveryApp.demo.users.service;

import org.springframework.stereotype.Service;

import com.foodDeliveryApp.demo.users.Dao.BaseDao;
import com.foodDeliveryApp.demo.users.Dao.UserRegistrationRequestDao;
import com.foodDeliveryApp.demo.users.Dao.UserRegistrationResponseDao;

@Service
public interface UserRegistrationService {
	
	public UserRegistrationResponseDao registration(UserRegistrationRequestDao request);
	
	public boolean isUserExist(UserRegistrationRequestDao request);
	
	

}
