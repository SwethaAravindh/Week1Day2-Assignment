package week1.day2;

public class TwoWheeler {
	private static char[] punctured;
	int noOfWheels= 2;
	short noOfMirrors= 2;
	long chassisNumber= 789456123321456L;
	boolean isPunctured= true;
	String bikeName= "Activa";
	double runningKM= 2556.67;
	
	public static void main(String[] args) {
		TwoWheeler details= new TwoWheeler();
		int wheels= details.noOfWheels();
		System.out.println(wheels);
		short mirrors= details.noOfMirrors();
		System.out.println(mirrors);
		long chassis= details.chassisNumber();
		System.out.println(chassis);
		boolean punctured= details.isPunctured();		
		System.out.println(punctured);
		String name= details.bikeName();
		System.out.println(name);
		double km= details.runningKM();
		System.out.println(km);
	}

	public int noOfWheels() {
		int wheels= 2;
		return wheels;
	}
	public short noOfMirrors() {
		short mirrors= 2;
		return mirrors;
	}
	public long chassisNumber() {
		long chassis= 789456123321456L;
		return chassis;
	}
	public boolean isPunctured() {
		boolean punctured= true;
		return punctured;
	}
	public String bikeName() {
		String name= "Activa";
		return name;
	}
	public double runningKM() {
		double km= 2556.67;
		return km;
	}
	

}
