package com.harshitha.regex;

import java.util.Scanner;

public class UserRegexDetails {
    static UserDetails userDetails = new UserDetails();
    static Scanner sc = new Scanner(System.in);

    public static void userLastName() {
        System.out.println("Enter the Last name:");
        String lastName = sc.next();
        userDetails.lastname(lastName);
    }

    public static void userEmailId() {
        System.out.println("Enter the email id:");
        String emailId = sc.next();
        userDetails.firstname(emailId);
    }

    public static void userMobileNumber() {
        System.out.println("Enter the mobile number:");
        String mobileNumber = sc.next();
        userDetails.firstname(mobileNumber);
    }

    public static void userPassword() {
        System.out.println("Enter the password:");
        String password = sc.next();
        userDetails.firstname(password);
    }

    public void userFirstName(){
        System.out.println("Enter the first name:");
        String firstName = sc.next();
        userDetails.firstname(firstName);



    }

}
