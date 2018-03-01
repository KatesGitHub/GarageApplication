package models;

import utilities.ParkStatus;
import utilities.ColorType;

public abstract class Vehicle {

	private String brandName;
	private String modelYear;
	private String regNumber;
	private double weight;
	private ColorType color;
	private ParkStatus status;
	
	public Vehicle(String brandName, String modelYear, String regNumber, double weight, ColorType color) {
		
		this.brandName = brandName;
		this.modelYear = modelYear;
		this.regNumber = regNumber;
		this.weight = weight;
		this.color = color;
		this.status = ParkStatus.UNPARK;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getModelYear() {
		return modelYear;
	}

	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}

	public String getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public ColorType getColor() {
		return color;
	}

	public void setColor(ColorType color) {
		this.color = color;
	}
	
	public ParkStatus getStatus() {
		return status;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brandName == null) ? 0 : brandName.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((modelYear == null) ? 0 : modelYear.hashCode());
		result = prime * result + ((regNumber == null) ? 0 : regNumber.hashCode());
		long temp;
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Vehicle other = (Vehicle) obj;
		if (brandName == null) {
			if (other.brandName != null)
				return false;
		} else if (!brandName.equals(other.brandName))
			return false;
		if (color != other.color)
			return false;
		if (modelYear == null) {
			if (other.modelYear != null)
				return false;
		} else if (!modelYear.equals(other.modelYear))
			return false;
		if (regNumber == null) {
			if (other.regNumber != null)
				return false;
		} else if (!regNumber.equals(other.regNumber))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Vehicle [getBrandName()=" + getBrandName() + ", getModelYear()=" + getModelYear() + ", getRegNumber()="
				+ getRegNumber() + ", getWeight()=" + getWeight() + ", getColor()=" + getColor() + "]";
	}
	
}
