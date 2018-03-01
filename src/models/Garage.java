package models;

import utilities.ParkStatus;

public class Garage {
	

	private int id;
	private String name;
	private int capacity;
	private int nrOfVehicle;
	private Vehicle vehicle;
	
	public Garage(int id, String name, int capacity, int nrOfVehicle) {
		super();
		this.id = id;
		this.name = name;
		this.capacity = capacity;
		this.nrOfVehicle = nrOfVehicle;
		
	}


	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getCapacity() {
		return capacity;
	}

	public int getNrOfVehicle() {
		return nrOfVehicle;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + nrOfVehicle;
		result = prime * result + capacity;
		result = prime * result + ((vehicle == null) ? 0 : vehicle.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Garage other = (Garage) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (nrOfVehicle != other.nrOfVehicle)
			return false;
		if (capacity != other.capacity)
			return false;
		if (vehicle == null) {
			if (other.vehicle != null)
				return false;
		} else if (!vehicle.equals(other.vehicle))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Garage [getId()=" + getId() + ", getName()=" + getName() + ", getSize()=" + getCapacity()
				+ ", getNrOfVehicle()=" + getNrOfVehicle() + ", getVehicle()=" + getVehicle() 
				+ ", hashCode()=" + hashCode() + "]";
	}

	
}
