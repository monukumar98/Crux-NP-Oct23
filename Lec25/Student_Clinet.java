package Lec25;

import java.util.ArrayList;
//
//import Lec25.Student;

public class Student_Clinet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/// ArrayList<Integer> ll = new ArrayList<>();
		System.out.println("hello");
		Student s = new Student();
		s.name = "Kaju";
		s.age = 19;
		s.Intro_yourSelf();
		Student s1 = new Student();
		System.out.println(s1.name);
		s1.name = "kamlesh";
		s1.age = 17;
		System.out.println(s1.name);
		s1.Intro_yourSelf();
		s1.SayHey("Raju");
		Student.MentorName();
		Student.MentorName();
	}

	

}
