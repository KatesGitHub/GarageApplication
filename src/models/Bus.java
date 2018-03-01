package models;

import utilities.ColorType;
import utilities.FuelType;

public class Bus extends Vehicle {

	private int numberOfEngine;
	private double length;
	private int numberOfSeats;
	private FuelType fuelType;
	
	
	


	public Bus(String brandName, String modelYear, String regNumber, double weight, ColorType color, int numberOfEngine,
			 double length,int numberOfSeats,FuelType fuelType ) 
	{
		
		super(brandName, modelYear, regNumber, weight, color);
		
		this.numberOfEngine =numberOfEngine;
	    this.length=length;
		this.numberOfSeats=numberOfSeats;
		this.fuelType=fuelType;
	}



	public int getNumberOfEngine() {
		return numberOfEngine;
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