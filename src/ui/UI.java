package ui;

import java.util.ArrayList;

import models.Vehicle;

public class UI {

	public void printHeader() {
		System.out.println("Vehicle Type  Vehicle Name        Reg.Number      Remark");
	}
	
	public void printVehicle(Vehicle vehicle) {
		
		System.out.println(fixLengthString(vehicle.getVehicleType().toString(), 14)+ "  " + fixLengthString(vehicle.getBrandName(),20) + 
				"  " + fixLengthString(vehicle.getRegNumber(), 10));
	}
	
	private String fixLengthString(String start, int length) {
		//TODO: fix string padding problems
		if(start.length() >= length) {
			return start.substring(0, length);
		}
		else {
			while(start.length()< length) {
				start += " ";
			}
			return start;
		}
	}
	 
	public void printGarage(ArrayList<Vehicle> vehicles) {
		for(Vehicle nextVehicle: vehicles) {
			System.out.println(nextVehicle.toString());
		}
	}
}
