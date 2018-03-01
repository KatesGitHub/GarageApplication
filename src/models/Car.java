package models;

import utilities.ColorType;
import utilities.FuelType;

public class Car extends Vehicle {
	
	private double length;
	private int numberOfSeats;
	private FuelType fuelType;
	
		
public Car(String brandName, String modelYear, String regNumber, int weight, ColorType color, double length, int numberOfSeats, FuelType fuelType)
	
		{
			
		super (brandName, modelYear, regNumber, weight, color);
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



public String toString() {
	return "Vehical Brand Name: "+ getBrandName()+".    Reg Number: "+getRegNumber() ;
}
	



}