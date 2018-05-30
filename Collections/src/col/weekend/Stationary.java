package col.weekend;

public class Stationary {
	String brand;
	int price;

	public Stationary(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}

	class Pen extends Stationary {

		public Pen(String brand, int price) {
			super(brand, price);
		}

	}

	class Marker extends Stationary {

		public Marker(String brand, int price) {
			super(brand, price);
			// TODO Auto-generated constructor stub
		}

	}

}
