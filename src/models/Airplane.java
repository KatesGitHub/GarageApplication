package models;

import utilities.ColorType;
import utilities.FuelType;

public class Airplane extends Vehicle {
	
	private int nrOfEngines;
	private int nrOfSeats;
	private FuelType fuelType;

	public Airplane(String brandName, String modelYear, String regNumber, double weight, ColorType color, int nrOfEngines, int nrOfSeats, FuelType fuelType) {
		super(brandName, modelYear, regNumber, weight, color);
		this.nrOfEngines = nrOfEngines;
		this.nrOfSeats = nrOfSeats;
		this.fuelType = fuelType;
	}

	public int getNrOfEngines() {
		return nrOfEngines;
	}
	
	public int getNrOfSeats() {
		return nrOfSeats;
	}

	public FuelType getFuelType() {
		return fuelType;
	}

}
