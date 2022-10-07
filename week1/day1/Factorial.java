package week1.day1;

public class Factorial {
	public static void main(String[] args) {
		int F=1;
		for (int i = 5; i >= 1;i--) {
			F=i*F;		
		}
		System.out.println(F);	
	}

}
