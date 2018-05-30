package col.week.station;

public class Stationary {
	String brand;
	int price;

	public Stationary(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Stationary [brand=" + brand + ", price=" + price + "]";
	}

/*	public String toString() {
		return this.brand + " " + this.price;

	}*/

}
