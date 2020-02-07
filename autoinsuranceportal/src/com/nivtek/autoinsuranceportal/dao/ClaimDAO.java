package com.nivtek.autoinsuranceportal.dao;

import com.nivtek.autoinsuranceportal.entity.Driver;

public class ClaimDAO {


	/**
	 * @param driver
	 * @return
	 */
	public int getClaimDetail(Driver driver) {

		//String dlNumber = driver.getDlNumber();
		String lastDigit = ""+driver.getDlNumber().charAt(driver.getDlNumber().length()-1);
		
		int claimNumber = Integer.parseInt(lastDigit);
		return claimNumber;

	}

}
