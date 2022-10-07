package week1.day2;

public class LearnMethods {
	public static void main(String[] args) {
		LearnMethods obj= new LearnMethods();
		obj.printMyName();
		String output= obj.getMyName();
		System.out.println(output);
		int sum = obj.addTwoNumber(5, 5);
		System.out.println(sum);
	}
	public void printMyName() {
		System.out.println("Swetha");
	}
	public String getMyName() {
		String name="Aravindh";
		return name;
	}
	public int addTwoNumber(int num1,int num2) {
		return num1+num2;
	}
	public int addTwoNumber1(int num1,int num2) {
		int sum= num1+num2;
		return sum;
	}

}
