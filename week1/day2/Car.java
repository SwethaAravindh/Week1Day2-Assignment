package week1.day2;

public class Car {
	public static void main(String[] args) {
	Car obj= new Car();
	int sum= obj.addTwoNumber(5, 5);
	System.out.println(sum);
	obj.printCarName();
	int regNum= obj.getRegNum();
	System.out.println(regNum);
	int sub= obj.subTwoNumber(5, 3);
	System.out.println(sub);
	float mult= obj.multiplyThreeNumber(5, 3, 2);
	System.out.println(mult);
	}
	public void printCarName() {
		System.out.println("BMW");
	}
    public int getRegNum() {
    	int regNum= 9999;
    	return regNum;
    }
	
    public String getColour() {
    	String colour="Black";
    	return colour;
    }

    public boolean isCarPunctured() {
    	//boolean Punctured= 'False';
    	return false;
    }
    public int addTwoNumber(int num1,int num2) {
		return num1+num2;
    }
    
    private int subTwoNumber(int num1,int num2) {
		return num1-num2;
	}
    float multiplyThreeNumber(int num1,int num2,int num3) {
    	float multiply= num1*num2*num3;
		return multiply;
	}
    public float divTwoNumber(int num1,int num2) {
    	float div= num1/num2;
		return div;
	}

}
