package com.nivtek.autoinsuranceportal.dao;

import com.nivtek.autoinsuranceportal.entity.Driver;

public class ViolationDAO {

	
	/**
	 * @param driver
	 * @return
	 */
	public int getViolationDetail(Driver driver) {

		String dlNumber = driver.getDlNumber();
		
		int violationNumber = Integer.parseInt(""+dlNumber.charAt(2));
		
		return violationNumber;

	}

}
