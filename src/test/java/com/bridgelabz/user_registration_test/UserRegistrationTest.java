package com.bridgelabz.user_registration_test;

import com.bridgelabz.user_registration.UserRegistrationValidation;
import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        Assert.assertTrue(userRegistrationValidation.validateFirstName("Ravindra"));
    }

    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse() {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        Assert.assertFalse(userRegistrationValidation.validateFirstName("ra"));
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        Assert.assertTrue(userRegistrationValidation.validateLastName("Hawaldar"));
    }

    @Test
    public void givenLastName_WhenShort_ShouldReturnFalse() {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        Assert.assertFalse(userRegistrationValidation.validateLastName("ws"));
    }
    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        Assert.assertTrue(userRegistrationValidation.validateEmail("ravi@gmail.com"));
    }

    @Test
    public void givenEmail_WhenNotProper_ShouldReturnFalse() {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        Assert.assertFalse(userRegistrationValidation.validateEmail("Rahsgv##"));
    }
    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        Assert.assertTrue(userRegistrationValidation.validateMobileNumber("91 7975301655"));
    }

    @Test
    public void givenMobileNumber_WhenNotProper_ShouldReturnFalse() {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        Assert.assertFalse(userRegistrationValidation.validateMobileNumber("91879546565546"));
    }

    @Test
    public void givenPassWord_WhenProper_ShouldReturnTrue() {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        Assert.assertTrue(userRegistrationValidation.validatePassword("asdfadfsadf"));
    }
    @Test
    public void givenPassWord_WhenShort_ShouldReturnFalse() {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        Assert.assertFalse(userRegistrationValidation.validatePassword("ds"));
    }
    @Test
    public void givenPassWordWith_One_Upper_Case_WhenProper_ShouldReturnTrue() {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        Assert.assertTrue(userRegistrationValidation.validatePasswordOneUpperCase("Rasdadfsadf"));
    }
    @Test
    public void givenPassWord_With_One_Upper_Case_ShouldReturnFalse() {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        Assert.assertFalse(userRegistrationValidation.validatePasswordOneUpperCase("ds"));
    }
    @Test
    public void givenPassWordWith_One_Number_WhenProper_ShouldReturnTrue() {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        Assert.assertTrue(userRegistrationValidation.validatePasswordOneNumber("Rasdadfsadf123"));
    }
    @Test
    public void givenPassWord_With_One_Number_Not_Proper_ShouldReturnFalse() {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        Assert.assertFalse(userRegistrationValidation.validatePasswordOneNumber("wqerg"));
    }
    @Test
    public void givenPassWordWith_One_Special_Char_WhenProper_ShouldReturnTrue() {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        Assert.assertTrue(userRegistrationValidation.validatePasswordSpecialCharacter("FDhgsavch13@"));
    }
    @Test
    public void givenPassWord_With_One_Special_Char_Not_Proper_ShouldReturnFalse() {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        Assert.assertFalse(userRegistrationValidation.validatePasswordSpecialCharacter("$%#"));
    }
    
}
