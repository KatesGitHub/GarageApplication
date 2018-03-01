package models;

import utilities.ColorType;
import utilities.FuelType;
import utilities.VehicleType;

public class Bus extends Vehicle {

	private int numberOfEngine;
	private double length;
	private int numberOfSeats;
	private FuelType fuelType;
	private int numberOfBus;
	
	public Bus(String brandName, String modelYear, String regNumber, double weight, ColorType color, int numberOfEngine,
			 double length,int numberOfSeats,FuelType fuelType ) 
	{
		
		super(brandName, modelYear, regNumber, weight, color, VehicleType.BUS);
		
		this.numberOfEngine =numberOfEngine;
	    this.length=length;
		this.numberOfSeats=numberOfSeats;
		this.fuelType=fuelType;
		numberOfBus++;
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

	public VehicleType getVehicleType() {
		return VehicleType.BUS;
	}

	public String toString() {
		return "Vehical Brand Name: "+ getBrandName()+".    Reg Number: "+getRegNumber() ;
	}

}