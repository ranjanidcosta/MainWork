package com.ranjani.ui;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

import com.ranjani.bean.Customer;
import com.ranjani.exception.BankingException;
import com.ranjani.service.BankingService;
import com.ranjani.service.BankingServiceImpl;

public class BankingClient {

	BankingService bService;

	public static void main(String[] args) {
		new BankingClient();
	}

	public BankingClient() {
		Scanner scan = new Scanner(System.in);
		bService = new BankingServiceImpl();
		while (true) {
			int choice = getChoice(scan);
			//System.out.println("Choice = " + choice);
			switch (choice) {
			case 1:
				System.out.println("Register a customer");
				long accno = 0;
				boolean keepDoing = true;
				do {
					try {
						System.out.println("Enter account number");
						accno = scan.nextLong();
						keepDoing = false;
					} catch (InputMismatchException e) {
						System.out.println("Enter only number for account number");
						scan.nextLine();
					}
				} while (keepDoing);

				String fname = null;
				boolean valid = false;
				do {
					System.out.println("Enter first name");
					fname = scan.next();
					valid = bService.isNameValid(fname);
					if (!valid)
						System.out.println("Name should start with uppercase");
				} while (!valid);

				String lname = null;
				do {
					System.out.println("Enter last name");
					lname = scan.next();
					valid = bService.isNameValid(lname);
					if (!valid)
						System.out.println("Name should start with uppercase");
				} while (!valid);

				LocalDate dob = null;
				valid = false;
				do {
				try {
					System.out.println("Enter DOB <yyyy-mm-dd>");
					String dobStr = scan.next();
					dob = bService.getDob(dobStr);
					if(dob!=null)
						valid = true;
				} catch (BankingException e1) {
					System.err.println(e1.getMessage());
				}
				}
				while(!valid);

				keepDoing = true;
				long mobile = 0;
				do {
					try {
						System.out.println("Enter mobile number");
						mobile = scan.nextLong();
						keepDoing = false;
					} catch (InputMismatchException e) {
						System.err.println("Enter only number for mobile number");
						scan.nextLine();
					}
				} while (keepDoing);

				Customer cust = new Customer(accno, fname, lname, dob, mobile);
				System.out.println(cust);

				boolean success;
				try {
					success = bService.register(cust);
				} catch (BankingException e1) {
					// TODO Auto-generated catch block
					System.err.println(e1.getMessage());
				}
				break;
			
			case 2:
				System.out.println("Display the customer");
				Map<Long, Customer> custMap = null;
				try {
					custMap = bService.getCustomer();
					System.out.println(custMap);
				} catch (BankingException e2) {
					// TODO Auto-generated catch block
					System.err.println(e2.getMessage());
				}
				break;
			case 3: 
				System.out.println("Search Customer");
				long custNoRetrieve = 0;
				System.out.println("Enter the customer account number: ");
				custNoRetrieve = scan.nextLong();
				Customer customer;
				try {
					customer = bService.getCustomer(custNoRetrieve);
					System.out.println("Customer info: "+ customer);
				} catch (BankingException e1) {
					// TODO Auto-generated catch block
					System.err.println(e1.getMessage());
				}
				break;
			case 4: 
				System.out.println("Deposit Amount");
				custNoRetrieve = 0;
				double depositAmount = 0;
				System.out.println("Enter customer account number: ");
				custNoRetrieve = scan.nextLong();
				System.out.println("Enter amount to be deposited: ");
				depositAmount = scan.nextDouble();
				try {
					success = bService.depositAmount(custNoRetrieve, depositAmount);
					if (success) {
						System.out.println("Amount deposited successfully.");
					}
					else {
						System.out.println("Account number does not exist");
					}
				} catch (BankingException e1) {
					// TODO Auto-generated catch block
					System.err.println(e1.getMessage());
				}
				break;
			case 5:
				System.out.println("Withdraw Amount");
				custNoRetrieve = 0;
				double withdrawAmount = 0;
				System.out.println("Enter customer account number: ");
				custNoRetrieve = scan.nextLong();
				System.out.println("Enter amount to be withdrawn: ");
				withdrawAmount = scan.nextDouble();
				try {
					success = bService.withdrawAmount(custNoRetrieve, withdrawAmount);
					if (success) {
						System.out.println("Amount successfully withdrawn");
					}
					else {
						System.out.println("Total balance is lesser than 1000 OR Customer Account number does not exist.");
					}
				} catch (BankingException e) {
					System.err.println(e.getMessage());
				}
				break;
			case 6:
				System.out.println("Check Balance");
				custNoRetrieve = 0;
				double availableBalance = 0;
				System.out.println("Enter customer account number: ");
				custNoRetrieve = scan.nextLong();
				try {
					availableBalance = bService.getBalance(custNoRetrieve);
					System.out.println("Current Balance: " + availableBalance);
				} catch (BankingException e) {
					// TODO Auto-generated catch block
					System.err.println(e.getMessage());
				}
				break;
			case 7:
				System.out.println("Thank you for using application.. Bye !");
				// close DB conn
				bService.closeResource();
				System.exit(0);
				break;

			default:
				System.err.println("Enter only options mentioned");
				break;
			}
		}

	}

	private int getChoice(Scanner scan) {
		int choice = 0;
		System.out.println("Banking System");
		System.out.println("1. Register Customer");
		System.out.println("2. Display Customers");
		System.out.println("3. Search Customer");
		System.out.println("4. Deposit Amount");
		System.out.println("5. Withdraw Amount");
		System.out.println("6. Check Balance");
		System.out.println("7. Exit Application");
		System.out.println("Choose option 1-7");
		try {
			choice = scan.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Enter only numbers");
			scan.nextLine();
		}
		return choice;
	}

}
