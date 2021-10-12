package org.allvehicle;

import org.twowheeler.TwoWheeler;

public class Vehicle {
	private void vehicleNecessary() {
	System.out.println("Choose the Vehicle is Necessary First");

	}
public static void main(String[] args) {
	Vehicle vehicle = new Vehicle();
	vehicle.vehicleNecessary();
	TwoWheeler two = new TwoWheeler();
	two.bike();
	two.cycle();
}
}
