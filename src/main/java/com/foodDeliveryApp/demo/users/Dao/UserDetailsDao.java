package com.foodDeliveryApp.demo.users.Dao;

import com.foodDeliveryApp.demo.users.view.UserAddressView;

/**
 * The Class UserDetailsDao.
 */
public class UserDetailsDao {


	/** The first name. */
	private String firstName;
	
	/** The last name. */
	private String lastName;
	
	/** The user address. */
	private UserAddressView userAddress;
	
	/** The mobile number. */
	private String mobileNumber;
	
	/** The username. */
	private String username;
	
	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Sets the first name.
	 *
	 * @param firstName the new first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * Sets the last name.
	 *
	 * @param lastName the new last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * Gets the user address.
	 *
	 * @return the user address
	 */
	public UserAddressView getUserAddress() {
		return userAddress;
	}
	
	/**
	 * Sets the user address.
	 *
	 * @param userAddress the new user address
	 */
	public void setUserAddress(UserAddressView userAddress) {
		this.userAddress = userAddress;
	}
	
	/**
	 * Gets the mobile number.
	 *
	 * @return the mobile number
	 */
	public String getMobileNumber() {
		return mobileNumber;
	}
	
	/**
	 * Sets the mobile number.
	 *
	 * @param mobileNumber the new mobile number
	 */
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	/**
	 * Gets the username.
	 *
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	
	/**
	 * Sets the username.
	 *
	 * @param username the new username
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
