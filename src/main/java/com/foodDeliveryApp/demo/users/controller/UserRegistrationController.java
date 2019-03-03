package com.foodDeliveryApp.demo.users.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodDeliveryApp.demo.users.Dao.UserRegistrationRequestDao;
import com.foodDeliveryApp.demo.users.Dao.UserRegistrationResponseDao;
import com.foodDeliveryApp.demo.users.service.UserRegistrationService;
import com.foodDeliveryApp.demo.users.view.UserRegisterRequestView;
import com.foodDeliveryApp.demo.users.view.UserRegisterResponseView;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

/**
 * The Class UserRegistrationController.
 */
@RestController
@RequestMapping("/users")
public class UserRegistrationController {
	
	/** The registration service. */
	@Autowired
	private UserRegistrationService registrationService;
	
	/** The Constant logger. */
	public final static Logger logger = LoggerFactory.getLogger(UserRegistrationController.class);
	
	private MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
	MapperFacade mapper = mapperFactory.getMapperFacade();
	
	/**
	 * Registration.
	 *
	 * @param registrationReq the registration req
	 * @return the user register response view
	 */
	@PostMapping("/register")
	public UserRegisterResponseView registration(UserRegisterRequestView registrationReq) {
	    logger.info("user registration service invoked");
	    Long startTime = System.currentTimeMillis();
	    UserRegisterResponseView userRegisterResponseView = null;

		try {
		    userRegisterResponseView = new UserRegisterResponseView();
		    UserRegistrationRequestDao userRegistrationRequest = mapper.map(registrationReq, UserRegistrationRequestDao.class);
			boolean userExist = registrationService.isUserExist(userRegistrationRequest);
			if(userExist) {
			    logger.debug("Username aleardy exist in database.",registrationReq.getUsername());
			    userRegisterResponseView.setCode("202");
			    userRegisterResponseView.setMsg("email adddress or mobileNumber aleardy exist in system.");
			    return userRegisterResponseView;
			}else {
			    UserRegistrationResponseDao userRegistrationResponse = registrationService.registration(userRegistrationRequest);
			   if( "Success".equalsIgnoreCase(userRegistrationResponse.getMessage())){
			       userRegisterResponseView =  mapper.map(userRegistrationResponse, UserRegisterResponseView.class);
			   }else {
			       logger.debug("UserRegistrationService didn't returned prpper response",userRegistrationResponse);
			       userRegisterResponseView.setMsg("Something went wrong please contact adminstrator.");
			   }
			}
			
			
		}catch(Exception e) {
		    logger.info("while registering new user some error occured.",e.getMessage());
		    logger.error("while registering new user some error occured.",e.getMessage());
		    logger.debug("while registering new user some error occured.",e.getMessage());
		    userRegisterResponseView.setCode("404");
		    userRegisterResponseView.setMsg("please contact service provider or administrator team");
		    
		}
		logger.info("total time taken to complete registration in ms",System.currentTimeMillis()-startTime);

		return userRegisterResponseView;
	}

}
