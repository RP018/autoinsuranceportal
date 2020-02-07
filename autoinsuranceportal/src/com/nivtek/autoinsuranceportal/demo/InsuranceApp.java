package com.nivtek.autoinsuranceportal.demo;

import java.util.Scanner;

import com.nivtek.autoinsuranceportal.entity.Quote;
import com.nivtek.autoinsuranceportal.entity.Request;
import com.nivtek.autoinsuranceportal.service.QuoteService;



public class InsuranceApp {

	private static String firstName;
	private static String lastName;
	private static String dlNumber;
	private static String vin;

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter firstname");
		firstName = s.nextLine();

		System.out.println("Enter lastname");
		lastName = s.nextLine();

		System.out.println("Enter dlNumber");
		dlNumber = s.nextLine();

		System.out.println("Enter vin");
		vin = s.nextLine();
		s.close();

		Request request = new Request(firstName, lastName, dlNumber, vin);
		QuoteService qs = new QuoteService();
		Quote quote = qs.getQuote(request);
		
		System.out.println("Your quote details are:"); 
		System.out.println("Quote Number is = " + quote.getQuoteNumber());
		System.out.println("Amount = " + quote.getAmount());
		System.out.println("Term = " + quote.getTerm());
	}


}