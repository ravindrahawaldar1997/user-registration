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
        userRegistration.validatePasswordOneSpecialChar("FDhgsavch13@");
        
        String[] validEmail = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com",
                "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au",
                "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"};
        String[] invalidEmail = {"abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com",
                "abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com", "abc@%*.com",
                "abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com",
                "abc@gmail.com.1a", "abc@gmail.com.aa.au"};
        for (String email: validEmail) {
            userRegistration.validateEmail(email);
        }

        for (String email : invalidEmail) {
            userRegistration.validateEmail(email);
        }
    }
}
