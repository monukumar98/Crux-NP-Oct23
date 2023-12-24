package Lec15;

public class Check_Ith_Bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 68;
		int i = 4;
		int mask = (1 << i);// 10000
		if ((n & mask) != 0) {
			System.out.println("Set hai kisi aur ke sath");// mtlb bit 1 hai ith index pe 
		} else {
			System.out.println("Set nhi hai Try kr skte ho");//mtlb bit 0 hai  ith index pe
		}

	}

}
