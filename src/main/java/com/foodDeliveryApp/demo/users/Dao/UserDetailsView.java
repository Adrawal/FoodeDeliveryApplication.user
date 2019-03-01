package com.foodDeliveryApp.demo.users.Dao;

public class UserDetailsView {

	private String firstName;
	private String lastName;
	private UserAddressView userAddress;
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
