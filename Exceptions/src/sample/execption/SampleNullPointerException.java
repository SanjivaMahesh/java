package sample.execption;

public class SampleNullPointerException {
	String name;

	public static void main(String[] args) {
		SampleNullPointerException s = new SampleNullPointerException();
		System.out.println(s.name);// null
		try {
			System.out.println(s.name.toUpperCase());

		} catch (NullPointerException ne) {
			System.out.println("performing operation on null change it");
		}
		System.out.println("succesfully completed execution");

	}

}
