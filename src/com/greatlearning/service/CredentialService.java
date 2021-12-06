package com.greatlearning.service;

import com.greatlearning.model.*;
import java.util.*;

public class CredentialService {

	public String generatePassword() {
		String password = "";
		String CHAR_SMALL = "abcdefghijklmnopqrstuvwxyz";
		String CAPS = CHAR_SMALL.toUpperCase();
		String Numbers = "0123456789";
		String specialchar = "!@#$%^&*_=+-/.?<>)([{}]:;',";
		String allPossibleChars = Numbers + CHAR_SMALL + CAPS + specialchar;
		Random random = new Random();

		for (int i = 0; i < 8; i++) {
			int idx = random.nextInt(allPossibleChars.length());
			password = password + allPossibleChars.charAt(idx); // "D" / "^"
		}
		return password;
	}

	public String generateEmailAddress(Employee e) {
		String Email;
		HashMap<Integer, String> dep = new HashMap<Integer, String>();
		dep.put(1, "tech");
		dep.put(2, "adm");
		dep.put(3, "hr");
		dep.put(4, "lg");
		Email = e.getFirstName() + e.getLastName() + "." + dep.get(e.getDepartment()) + "@abc.com";
		return Email;
	}

	public void showCredentials(Employee e) {
		System.out.println("Dear " + e.getFirstName() + " generated credentials are as follows");
		String Email = generateEmailAddress(e);
		System.out.println("Email---->" + Email);
		String Password = generatePassword();
		System.out.println("Password---->" + Password);
	}

	/* (Technical – “tech”, Admin – “adm”, Human Resource – “hr”, Legal – “lg”) */

}
