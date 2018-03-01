package ui;

import models.Bus;
import models.Car;
import models.Motorcycle;
import models.Vehicle;
import utilities.ColorType;
import utilities.FuelType;

public class Main {

	public static void main(String[] args) {
		
		
	Vehicle opel=new Car("Opel Corsa", "2010", "XDR 543", 1550, ColorType.RED, 3,4, FuelType.BENSIN);
	
	Bus b1=new Bus("brandName", "modelYear", "regNumber",34561.76, ColorType.BLACK, 2, 23.23,45,FuelType.BIO);
	
	Motorcycle mCycle=new Motorcycle("Honda Hero", "2013", "XTR 543", 550, ColorType.RED, 2,2.4, FuelType.BENSIN);
		

	System.out.println(opel);
	
	
	
	}

}
