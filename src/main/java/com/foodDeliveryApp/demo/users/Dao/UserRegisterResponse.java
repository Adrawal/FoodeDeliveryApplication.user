package com.foodDeliveryApp.demo.users.Dao;

import com.foodDeliveryApp.demo.users.utils.BaseView;

public class UserRegisterResponse extends BaseView {
	
private UserDetailsView userDetails;

public UserDetailsView getUserDetails() {
	return userDetails;
}

public void setUserDetails(UserDetailsView userDetails) {
	this.userDetails = userDetails;
}


}
