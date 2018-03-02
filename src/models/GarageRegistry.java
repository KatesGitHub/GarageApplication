package models;

import java.util.ArrayList;

import utilities.ParkStatus;
import utilities.VehicleType;

public class GarageRegistry {
	
	private ArrayList <Vehicle> registry;
	private Garage garage;
	
	
	public GarageRegistry() {
		registry = new ArrayList<Vehicle>();
		garage = new Garage(1, "A garage", 10, 0);
	}
	
	public void parkVehicle(Vehicle vehicle) throws GarageFullException, VehicleParkedAlreadyException {
		
		if(registry.size() >= garage.getCapacity()) {
			throw new GarageFullException();
		}else if (registry.contains(vehicle)) {
			throw new VehicleParkedAlreadyException();
		}
		
		registry.add(vehicle);
		
	}
	
	public void unparkVehicle(Vehicle vehicle) {
		if(registry.contains(vehicle)) {
			registry.remove(vehicle);
		}
	}
	
	public Vehicle findVehicle(String regNumber) throws VehicleNotFoundException {
		for(Vehicle findVehicle : registry) {
			if(findVehicle.getRegNumber().equals(regNumber) && findVehicle.getStatus() == ParkStatus.PARK) {
				return findVehicle;
			}			
		}
	
		throw new VehicleNotFoundException();
	}
	
	public ArrayList<Vehicle> getAllVehicles() {
		return registry;
	}
	
	public int getNumberOfVehicles() {
		return registry.size();
	}
	
	public void getVehicleType() {
		
		int countBus=0;
		int countCar=0;
		int countMotorcycle=0;
		int countAirplane=0;
		int countBoat=0;
		
		for(Vehicle nextVehicle: registry) {
			if(nextVehicle.getVehicleType() == VehicleType.BUS) {
				countBus++;
			} else if(nextVehicle.getVehicleType() == VehicleType.CAR) {
				countCar++;
			} else if(nextVehicle.getVehicleType() == VehicleType.MOTORCYCLE) {
				countMotorcycle++;
			} else if(nextVehicle.getVehicleType() == VehicleType.AIRPLANE) {
				countAirplane++;
			} else if(nextVehicle.getVehicleType() == VehicleType.BOAT) {
				countBoat++;
			}
		}
			
		System.out.println("There are " + countBus + " buses, " + countCar + " cars, " + countMotorcycle + " motorcycles, " + countAirplane + " airplanes, " + countBoat + " boats");
		
	}
	
	
}
