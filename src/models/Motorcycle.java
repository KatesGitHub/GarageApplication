package models;

import utilities.ColorType;
import utilities.FuelType;
import utilities.VehicleType;

public class Motorcycle extends Vehicle {

	
	private double length;
	private double cylinderVolume;
	private FuelType fuelType;
	
	public Motorcycle(String brandName, String modelYear, String regNumber, double weight, ColorType color,double length,
	double cylinderVolume, 	FuelType fuelType) 
	{
		
		super(brandName, modelYear, regNumber, weight, color, VehicleType.MOTORCYCLE);
		
		this.length=length;
		this.cylinderVolume=cylinderVolume;
		this.fuelType=fuelType;
	}

	public double getLength() {
		return length;
	}

	public double getCylinderVolume() {
		return cylinderVolume;
	}

	public FuelType getFuelType() {
		return fuelType;
	}

	public VehicleType getVehicleType() {
		return VehicleType.MOTORCYCLE;
	}
	
	@Override
	public String toString() {
		return getVehicleType() + ", vehicle name " + getBrandName() + ", regNumber " + getRegNumber() + ", cylinderVolume " + getCylinderVolume();
	}
	
	}

	
	

