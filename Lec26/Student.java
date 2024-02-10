package Lec26;
public class Student {
	private String name = "Kaju";
	private int age = 17;

	public void Intro_yourSelf() {

		System.out.println("My Name is " + this.name + " and age is " + this.age);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		try {
			if (age < 0) {
				throw new Exception("Bklol age -ve nhi hota hai ");
			}
			this.age = age;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			System.out.println("I am in finly blocks");
		}
		

	}

//	public void setAge(int age) throws Exception{
//		
//		this.age = age;
//	}

}
