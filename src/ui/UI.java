package ui;

import java.util.ArrayList;

import models.Vehicle;

public class UI {

	public void printHeader() {
		System.out.println("Vehicle Type  Vehicle Name        Reg.Number      Remark");
	}
	
	public void printVehicle(Vehicle vehicle) {
		System.out.println();
	}
	 
	public void printGarage(ArrayList<Vehicle> vehicles) {
		for(Vehicle nextVehicle: vehicles) {
			System.out.println(nextVehicle.toString());
		}
	}
}
