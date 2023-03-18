package com.bridgelabz.user_registration;

public class UserRegistrationMain {
    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.validateFirstName("Ravi");
        userRegistration.validateLastName("Hawaldar");
        userRegistration.validateEmail("ravi@gmail.com");
        userRegistration.validateMobileNo("91 7795234718");
        userRegistration.validatePassword("ravinDdrasdcs");
        userRegistration.validatePasswordOneUpperCase("RavindraAZDFgjhj");
        userRegistration.validatePasswordOneNumeric("rahgvHGF12321wsadf");
    }
}
