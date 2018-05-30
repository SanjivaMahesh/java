package array.mahesh;

public class Sample {

	public static void main(String[] args) {
		Object[] o = null;
		System.out.println(o);
		o = new Object[3];
		System.out.println(o);
		o[0] = new Student();
		o[1] = new Pen();
		o[2] = new Chocolate();

	}

}
