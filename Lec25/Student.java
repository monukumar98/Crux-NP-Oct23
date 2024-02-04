package Lec25;

public class Student {
	String name;
	int age;

	public void Intro_yourSelf() {

		System.out.println("My Name is " + this.name + " and age is " + this.age);

	}

	public void SayHey(String name) {

		System.out.println(this.name + " say hey " + name);
	}

	public static void MentorName() {
		System.out.println("Monu Bhiya Java DSA Mentor");
	}

	static {
		System.out.println("hello i am in Static block");
	}

}
