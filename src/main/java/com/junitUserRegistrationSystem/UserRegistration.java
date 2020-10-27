package com.junitUserRegistrationSystem;

import java.util.regex.Pattern;

public class UserRegistration {
	public static boolean firstName(String firstName) {
		boolean fname = Pattern.matches("^[A-Z]([a-z]{2,})$", firstName);
		return fname;
	}

	public static boolean lastName(String lastName) {
		boolean lname = Pattern.matches("^[A-Z]([a-z]{2,})$", lastName);
		return lname;
	}

	public static boolean email(String mail) {
		boolean email = Pattern.matches("^[A-Za-z0-9]+([._%+-][0-9a-zA-Z]+)*@[A-Za-z0-9]+([.]([a-zA-Z]{2,3})*)+$",mail);
		return email;
	}

	public static boolean mobileNum(String mNum) {
		boolean mobileNum = Pattern.matches("^[+]*([0-9]{1,3})+[[:space:]]+[0-9]{10}$", mNum);
		return mobileNum;
	}
}
