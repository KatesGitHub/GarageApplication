package models;

import utilities.ColorType;
import utilities.FuelType;
import utilities.VehicleType;

public class Car extends Vehicle {
	
	private double length;
	private int numberOfSeats;
	private FuelType fuelType;
	
		
public Car(String brandName, String modelYear, String regNumber, int weight, ColorType color, double length, int numberOfSeats, FuelType fuelType)
	
		{
			
		super (brandName, modelYear, regNumber, weight, color, VehicleType.CAR);
		this.length= length;
		this.numberOfSeats=numberOfSeats;
		this.fuelType=fuelType;
	    }


public double getLength() {
	return length;
}

public int getNumberOfSeats() {
	return numberOfSeats;
}


public FuelType getFuelType() {
	return fuelType;
}

public VehicleType getVehicleType() {
	return VehicleType.CAR;
}

public String toString() {
	return "Vehical Brand Name: "+ getBrandName()+".    Reg Number: "+getRegNumber() ;
}

}