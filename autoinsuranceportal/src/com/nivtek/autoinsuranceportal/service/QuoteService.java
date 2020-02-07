package com.nivtek.autoinsuranceportal.service;

import com.nivtek.autoinsuranceportal.dao.ClaimDAO;
import com.nivtek.autoinsuranceportal.dao.VehicleDAO;
import com.nivtek.autoinsuranceportal.dao.ViolationDAO;
import com.nivtek.autoinsuranceportal.entity.Driver;
import com.nivtek.autoinsuranceportal.entity.Quote;
import com.nivtek.autoinsuranceportal.entity.Request;

public class QuoteService {

	/**
	 * @param request
	 * @return
	 */
	public Quote getQuote(Request request) {

		Driver driver = new Driver();
		String vin = request.getVin();
		int claimNumber;
		int violationNumber;
		String vehicleType;
		int amount = 0;
		Quote quote = new Quote();

		driver.setFirstName(request.getFirstName());
		driver.setLastName(request.getLastName());
		driver.setDlNumber(request.getDlNumber());
		
		
		

		ClaimDAO claimobj = new ClaimDAO();
		ViolationDAO violationobj = new ViolationDAO();
		VehicleDAO vehicleobj = new VehicleDAO();

		claimNumber = claimobj.getClaimDetail(driver);
		violationNumber = violationobj.getViolationDetail(driver);
		vehicleType = vehicleobj.getVehicleInfo(vin).getType();

		if (claimNumber > 5) {
			amount = amount + 600;
		}
		if (claimNumber < 5) {
			amount = amount + 300;
		}
		if (violationNumber > 5) {
			amount = amount + 400;
		}
		if (violationNumber < 5) {
			amount = amount + 250;
		}
		if (vehicleType == "luxury") {
			amount = amount + 200;
		}
		if (vehicleType == "non-luxury") {
			amount = amount + 100;
		}
        
		
		quote.setAmount(amount);
		quote.setQuoteNumber(generateQuoteNumber());
		quote.setTerm(3);

		return quote;

	}

	public static int generateQuoteNumber() {
		int x = (int) (Math.random() * ((99999 - 9999) + 1)) + 9999;
		return x;
	}

}