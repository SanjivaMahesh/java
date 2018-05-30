package col.week.station;

public class Marker extends Stationary {

	public Marker(String brand, int price) {
		super(brand, price);
	}

	@Override
	public String toString() {
		return "Marker [brand=" + brand + ", price=" + price + "]";
	}

}
