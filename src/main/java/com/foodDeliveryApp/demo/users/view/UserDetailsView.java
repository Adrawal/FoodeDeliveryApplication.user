package com.foodDeliveryApp.demo.users.view;

public class UserDetailsView {

	private String firstName;
	private String lastName;
	private UserAddressView userAddress;
	private String mobileNumber;
	private String username;
	
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public UserAddressView getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(UserAddressView userAddress) {
		this.userAddress = userAddress;
	}

}
