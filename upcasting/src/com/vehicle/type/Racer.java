package com.vehicle.type;

public class Racer {

	void race() {
		RacerCommunity rc = new RacerCommunity();
		@SuppressWarnings("unused")
		Vehicle v = rc.sponcer();
		if (v != null) {
			System.out.println(v.color + " " + v.brand + " " + v.noOfWheels);
			v.start();
			if (v instanceof Truck) {
				Truck t = (Truck) v;
				t.activateTurbo();
			} else if (v instanceof Car) {
				Car c = (Car) v;
				c.acivateNitrous();
			} else if (v instanceof Bike) {

				Bike b = (Bike) v;
				b.start();
			}
		}

	}

	public static void main(String[] args) {
		Racer r = new Racer();
		r.race();
	}

}
