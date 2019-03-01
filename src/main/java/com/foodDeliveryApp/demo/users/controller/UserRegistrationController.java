package com.foodDeliveryApp.demo.users.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodDeliveryApp.demo.users.Dao.UserRegisterRequest;
import com.foodDeliveryApp.demo.users.Dao.UserRegisterResponse;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserRegistrationController {

	@PostMapping("/register")
	public UserRegisterResponse registration(UserRegisterRequest registrationReq) {
		

		return null;
	}

}
