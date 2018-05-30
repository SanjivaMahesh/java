import java.util.Scanner;

public class Employee {
	String name;
	int age;
	String dept;
	String address;
	double salary;
	String empID;

	void show() {
		System.out.println(this.name + " " + this.age + " " + this.address + " " + this.salary + " " + this.empID + " "
				+ this.dept);
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		Scanner s = new Scanner(System.in);
		System.out.println("enter your name");
		e.name = s.next();
		System.out.println("enter your age");
		e.age = s.nextInt();
		System.out.println("enter your dept");
		e.dept = s.next();
		s.nextLine();
		System.out.println("enter your address");
		e.address = s.nextLine();
		System.out.println("enter your empId");
		e.empID = s.next();
		System.out.println("enter your salary");
		e.salary = s.nextDouble();
		e.show();

	}
}
