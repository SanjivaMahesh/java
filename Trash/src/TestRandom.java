import java.util.Random;
public class TestRandom {
	public static void main(String[] args) {
		Random r=new Random();
		int num=r.nextInt();
		int num1=r.nextInt(4)+1;
		int num2=r.nextInt(100);
		System.out.println(num);
		System.out.println(num1);
	System.out.println(num2);
	}

}
