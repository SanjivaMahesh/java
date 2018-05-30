package sample.execption;

public class SampleNumberFormatException {
	public static void main(String[] args) {
		String num = "152.235";
		int n = 0;
		try {
			n = Integer.parseInt(num);
			System.out.println(n);
			System.out.println("succesfully converted from string to integer");
		} catch (NumberFormatException ne) {
			System.out.println("not a proper number to convert");
		}
		System.out.println("succesfully terminated the program");
	}

}
