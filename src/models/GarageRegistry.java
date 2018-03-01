package models;

import java.util.ArrayList;

import utilities.ParkStatus;

public class GarageRegistry {
	
	private ArrayList <Vehicle> registry;
	private Garage garage;
	
	
	public GarageRegistry() {
		registry = new ArrayList<Vehicle>();
		garage = new Garage(1, "A garage", 10, 0);
	}
	
	public void parkVehicle(Vehicle vehicle) throws GarageFullException{
		if(registry.size()<garage.getCapacity() && vehicle.getStatus() == ParkStatus.UNPARK) {
			registry.add(vehicle);
		}
		throw new GarageFullException();
	}
	
	public void unparkVehicle(Vehicle vehicle) {
		if(registry.contains(vehicle)) {
			registry.remove(vehicle);
		}
	}
	
	public Vehicle findVehicle(String regNumber) throws VehicleNotFoundException {
		for(Vehicle findVehicle : registry) {
			if(findVehicle.getRegNumber().equals(regNumber)) {
				return findVehicle;
			}
		}
		throw new VehicleNotFoundException();
	}
	
	public void getAllVehicles() {
		for(Vehicle nextVehicle: registry) {
			System.out.println(nextVehicle);
		}
		
		
	}
}
