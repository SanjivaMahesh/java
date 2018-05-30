package col.week.station;

import java.util.ArrayList;

public class Tester {
	public static void main(String[] args) {
		ArrayList<Stationary> a = new ArrayList<Stationary>();
		a.add(new Marker("camlin", 50));
		System.out.println();
		a.add(new Pen("cello", 15));
		System.out.println();
		a.add(new Pencil("natraj", 3));
		System.out.println(a);
		

	}

}
