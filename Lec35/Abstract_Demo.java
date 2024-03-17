package Lec35;

public abstract class Abstract_Demo {

	public abstract void fun();

	public int fun2() {
		return 1;
	}

	public abstract void fun3();

	public static void main(String[] args) {
		Abstract_Demo ab = new Abstract_Demo() {

			@Override
			public void fun() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void fun3() {
				// TODO Auto-generated method stub
				
			}
			
		};
		
//		Abstract_Demo ab1 = new Abstract_Demo() {
//
//			@Override
//			public void fun() {
//				// TODO Auto-generated method stub
//				
//			}
//
//			@Override
//			public void fun3() {
//				// TODO Auto-generated method stub
//				
//			}
//			
//		};
	}
}








