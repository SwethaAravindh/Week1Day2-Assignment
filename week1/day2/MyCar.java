package week1.day2;

public class MyCar {
	public static void main(String[] args) {
		Car obj= new Car();
		obj.printCarName();
		int regNum= obj.getRegNum();
		System.out.println(regNum);
		//int sub= obj.subTwoNumber(5, 3);
		//System.out.println(sub);
		float mult= obj.multiplyThreeNumber(5, 3, 2);
		System.out.println(mult);
	}

}
