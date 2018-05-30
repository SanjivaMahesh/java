package col.week.list;

import java.util.ArrayList;
import java.util.Collections;

public class Sample {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		Sample s = new Sample();
		a.add("mahi");
		a.add("x");
		a.add("y");
		a.add("z");
		a.add("a");
		System.out.println("before sorting");
		System.out.println(a);
		Collections.sort(a, Collections.reverseOrder());
		System.out.println("after sorting");
		System.out.println(a);
	}

}
