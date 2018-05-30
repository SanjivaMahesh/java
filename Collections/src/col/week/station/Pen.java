package col.week.station;

public class Pen extends Stationary {

	public Pen(String brand, int price) {
		super(brand,price);
	}

	@Override
	public String toString() {
		return "Pen [brand=" + brand + ", price=" + price + "]";
	}

}
