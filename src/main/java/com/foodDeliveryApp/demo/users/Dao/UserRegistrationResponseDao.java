package com.foodDeliveryApp.demo.users.Dao;


/**
 * The Class UserRegistrationResponseDao.
 */
public class UserRegistrationResponseDao extends BaseDao {
    
    /** The user details. */
    private UserDetailsDao userDetails;

    /**
     * Gets the user details.
     *
     * @return the user details
     */
    public UserDetailsDao getUserDetails()
    {
        return userDetails;
    }

    /**
     * Sets the user details.
     *
     * @param userDetails the new user details
     */
    public void setUserDetails(UserDetailsDao userDetails)
    {
        this.userDetails = userDetails;
    }
    
    

}
