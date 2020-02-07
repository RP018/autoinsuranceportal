package com.nivtek.autoinsuranceportal.dao;

import com.nivtek.autoinsuranceportal.entity.Vehicle;

public class VehicleDAO {

	
	/**
	 * @param vin
	 * @return
	 */
	public Vehicle getVehicleInfo(String vin) {

		Vehicle vehicle = new Vehicle();
		String manufacturer = "";
		String type;
		int number = vin.length() - 5;

		for (int i = 0; i < number; i++) {
			manufacturer = manufacturer + vin.charAt(i);
		}

		if ((manufacturer.equals("AUDI")) || (manufacturer.equals("BMW")) ||(manufacturer.equals("Dodge"))){
			type = "luxury";
		} else {
			type = "non-luxury";
		}

		vehicle.setVin(vin);
		vehicle.setManufacturer(manufacturer);
		vehicle.setType(type);

		return vehicle;

	}

}
