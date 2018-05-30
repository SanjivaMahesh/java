package col.week.station;

public class Pencil extends Stationary {

	public Pencil(String brand, int price) {
		super(brand, price);
	}

	@Override
	public String toString() {
		return "Pencil [brand=" + brand + ", price=" + price + "]";
	}

}
