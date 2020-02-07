package com.nivtek.autoinsuranceportal.entity;

public class Request {
	
	private String firstName;
	private String lastName;
	private String dlNumber;
	private String vin;
	
	public Request(String firstName, String lastName, String dlNumber, String vin) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dlNumber = dlNumber;
		this.vin = vin;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the dlNumber
	 */
	public String getDlNumber() {
		return dlNumber;
	}
	/**
	 * @param dlNumber the dlNumber to set
	 */
	public void setDlNumber(String dlNumber) {
		this.dlNumber = dlNumber;
	}
	/**
	 * @return the vin
	 */
	public String getVin() {
		return vin;
	}
	/**
	 * @param vin the vin to set
	 */
	public void setVin(String vin) {
		this.vin = vin;
	}

}
