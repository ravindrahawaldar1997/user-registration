package com.bridgelabz.user_registration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public void validateFirstName(String name) {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
        Matcher matcher = pattern.matcher(name);
        boolean result = matcher.matches();
        if (result == true)
            System.out.println("Valid first name");
        else
            System.out.println("Invalid first name");
    }
    public void validateLastName(String lastName) {
        boolean result = Pattern.compile("^[A-Z][a-z]{2,}").matcher(lastName).matches();
        if (result == true)
            System.out.println("Valid first name");
        else
            System.out.println("Invalid first name");
    }
    public void validateEmail(String email) {
        boolean result = Pattern.compile("^[a-z]+([_.-]?[a-zA-Z0-9])*[@][a-zA-Z0-9]+([.][a-z]{2,3}){1,2}$").matcher(email).matches();
        if (result == true)
            System.out.println("Valid Email");
        else
            System.out.println("Invalid Email");
    }

    public void validateMobileNo(String mobileNo) {
        boolean result = Pattern.compile("^(91)[\\s][0-9]{10}$").matcher(mobileNo).matches();
        if (result == true)
            System.out.println("Valid Mobile No");
        else
            System.out.println("Invalid Mobile No");
    }
    public void validatePassword(String password) {
        boolean result = Pattern.compile("^[a-zA-Z]{8,}$").matcher(password).matches();
        if (result == true)
            System.out.println("Valid Password");
        else
            System.out.println("Invalid Password");
    }
    public void validatePasswordOneUpperCase(String password) {
        boolean result = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z]).+${8,}").matcher(password).matches();
        if (result == true)
            System.out.println("Valid Password");
        else
            System.out.println("Invalid Password");
    }
    public void validatePasswordOneNumeric(String password) {
        boolean result = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).+${8,}").matcher(password).matches();
        if (result == true)
            System.out.println("Valid Password");
        else
            System.out.println("Invalid Password");
    }
    public void validatePasswordOneSpecialChar(String password) {
        boolean result = Pattern.compile("^(?=.+[a-z])(?=.+[A-Z])(?=.+[0-9])(?=.+[-+_!@#$%^&*., ?]).+${8,}").matcher(password).matches();
        if (result == true)
            System.out.println("Valid Password");
        else
            System.out.println("Invalid Password");
    }
}
