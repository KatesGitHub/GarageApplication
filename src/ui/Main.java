package ui;

import models.Airplane;
import models.Boat;
import models.Bus;
import models.Car;
import models.GarageFullException;
import models.GarageRegistry;
import models.Motorcycle;
import models.Vehicle;
import models.VehicleNotFoundException;
import models.VehicleParkedAlreadyException;
import utilities.ColorType;
import utilities.FuelType;

public class Main {

	public static void main(String[] args) {
		
		
	Vehicle opel=new Car("Opel Corsa", "2010", "XDR 543", 1550, ColorType.RED, 3,4, FuelType.BENSIN);
	
	Bus b1=new Bus("brandName", "modelYear", "regNumber",34561.76, ColorType.BLACK, 2, 23.23,45,FuelType.BIO);
	Motorcycle mCycle=new Motorcycle("Honda Hero", "2013", "XTR 543", 550, ColorType.RED, 2,2.4, FuelType.BENSIN);
	Bus b2=new Bus("brandName", "modelYear", "regNumber",34561.76, ColorType.BLACK, 2, 23.23,45,FuelType.BIO);
	
	Airplane airbus = new Airplane("AitUnited", "2018", "1245", 90000, ColorType.RED, 4, 350, FuelType.BIO);
	Boat boat1 = new Boat("Yamaha", "2015", "BB5665", 1200.00, ColorType.GREEN, 67, true);
	

	GarageRegistry registry = new GarageRegistry();
	
	try {
		registry.parkVehicle(opel);
		registry.parkVehicle(b1);
		registry.parkVehicle(mCycle);
//		registry.parkVehicle(b2);
		registry.parkVehicle(airbus);
//		registry.parkVehicle(boat1);
		
		registry.parkVehicle(b1);
		registry.parkVehicle(mCycle);
		
	} catch (GarageFullException e) {
		
		System.out.println("Garage is full");
		
	} catch (VehicleParkedAlreadyException e) {
			
		System.out.println("Vehicle is already parked");
	}
	
	registry.getAllVehicles();
	registry.getVehicleType();
	
	registry.unparkVehicle(airbus);
//	
//	System.out.println();
//	registry.getAllVehicles();
//	registry.getVehicleType();
//
//	System.out.println();
//	
//	try {
//		registry.findVehicle("XDR 543");
//		System.out.println("Vehicle is found");
//	} catch (VehicleNotFoundException e) {
//		System.out.println("Vehicle is not found");
//	}
//	
	}

}
