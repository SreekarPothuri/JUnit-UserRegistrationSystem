package com.junitUserRegistrationSystem;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class FirstNameTest {
	
	static UserRegistration user;
	@BeforeClass
	public static void createUserRegistrationObj(){
		user = new UserRegistration();
		System.out.println("In before class: First Name");
	}
	
	@AfterClass
	public static void nullObj(){
		System.out.println("In After class: First Name");
		user = null;
	}
	
	@Test
	public void testFirstNameWithFirstLetterCapital_testAssertionHappy() {
		boolean result = user.firstName("Sreekar");
		Assert.assertTrue(result);
	}
	
	@Test
	public void testFirstNameWithoutFirstLetterCapital_testAssertionHappy() {
		boolean result = user.firstName("sreekar");
		Assert.assertFalse(result);
	}
	
	@Test
	public void testFirstNameWithoutFirstLetterCapital_testAssertionSad() {
		boolean result = user.firstName("sreekar");
		Assert.assertTrue(result);
	}
	
	
	@Test
	public void testFirstNameWithFirstLetterCapital_testAssertionSad() {
		boolean result = user.firstName("Sreekar");
		Assert.assertFalse(result);
	}
}
