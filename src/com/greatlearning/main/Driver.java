package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;

public class Driver {

	private final static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {

		String Firstname = sc.next();
		String Lastname = sc.next();
		int choice = displayDepartment();
		Employee e = new Employee(Firstname, Lastname, choice);
		CredentialService cs = new CredentialService();
		cs.showCredentials(e);
	}

	private static int displayDepartment() {
		System.out.println("Please enter the department from the following");
		System.out.print("1.Technical");
		System.out.print("2.Admin");
		System.out.print("3.Human Resource");
		System.out.print("4.Legal");
		return sc.nextInt();
	}
}