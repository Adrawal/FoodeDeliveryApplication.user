package com.foodDeliveryApp.demo.users.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodDeliveryApp.demo.users.view.UserLoginRequestView;
import com.foodDeliveryApp.demo.users.view.UserLoginResponseView;


// TODO: Auto-generated Javadoc
/**
 * The Class UserLoginController.
 */
@RestController
@RequestMapping("/base")
public class UserLoginController {
    
    /** The Constant logger. */
    private static final Logger logger = LoggerFactory.getLogger(UserLoginController.class);
    
	
	/**
	 * Login.
	 *
	 * @param request the request
	 * @return the user login response view
	 */
	@PostMapping("/login")
	public UserLoginResponseView login(UserLoginRequestView request) {
	    
	    
		return null;
		

	}

}
