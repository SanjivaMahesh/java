import java.util.Scanner;

public class Information {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
				System.out.println("enter ur name");
				String name= s.next();
				System.out.println("enter your age");
				int age= s.nextInt();
				System.out.println("enter ur clg name");
				String collegeName= s.nextLine();
				System.out.println("enter ur phone number");
				long phoneNumber= s.nextLong();
				System.out.println("r u present enter true/false");
				boolean isPresent= s.nextBoolean();
				System.out.println("enter ur height"); 
				double height= s.nextDouble();
				System.out.println( );
	}

}
