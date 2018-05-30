package hashcode;

public class Student {
	int id;

	public Student(int id) {
		this.id = id;
	}

	public int hashCode() {
		return this.id;

	}

	public static void main(String[] args) {
		Student s1 = new Student(1);
		Student s2 = new Student(2);
		Student s3 = new Student(3);
		Student s4 = new Student(2);
		Student s5 = new Student(3);
		System.out.println(s1 + "\n" + s2 + "\n" + s3 + "\n" + s4);
	}

}
