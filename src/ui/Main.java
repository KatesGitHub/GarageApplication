package ui;

import models.Airplane;
import models.Bus;
import models.Car;
import models.VehicleParkedAlreadyException;
import models.GarageRegistry;
import models.Motorcycle;
import models.Vehicle;
import models.VehicleNotFoundException;
import utilities.ColorType;
import utilities.FuelType;

public class Main {

	public static void main(String[] args) {
		
		
	MyFrameClass myframe=new  MyFrameClass();
		
	Vehicle opel=new Car("Opel Corsa", "2010", "XDR 543", 1550, ColorType.RED, 3,4, FuelType.BENSIN);
	Bus b1=new Bus("brandName", "modelYear", "regNumber",34561.76, ColorType.BLACK, 2, 23.23,45,FuelType.BIO);
	Motorcycle mCycle=new Motorcycle("Honda Hero", "2013", "XTR 543", 550, ColorType.RED, 2,2.4, FuelType.BENSIN);
	Bus b2=new Bus("brandName", "modelYear", "regNumber",34561.76, ColorType.BLACK, 2, 23.23,45,FuelType.BIO);
	
	Airplane airbus = new Airplane("AitUnited", "2018", "1245", 90000, ColorType.RED, 4, 350, FuelType.BIO);
	

	GarageRegistry registry = new GarageRegistry();
	
	try {
		registry.parkVehicle(opel);
		registry.parkVehicle(b1);
		registry.parkVehicle(mCycle);
		registry.parkVehicle(b2);
		registry.parkVehicle(airbus);
		
		
	} catch (VehicleParkedAlreadyException e) {
		
		System.out.println("Garage is full");
	}
	
	registry.getAllVehicles();
	registry.getVehicleType();
	
	
	registry.unparkVehicle(airbus);
	registry.getAllVehicles();
	registry.getVehicleType();
	
	try {
		registry.findVehicle("XDR 543");
		System.out.println("Vehicle is found");
	} catch (VehicleNotFoundException e) {
		System.out.println("Vehicle is not found..test");
	}
	
	}

}
