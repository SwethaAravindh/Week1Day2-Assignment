package week1.day1;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int input = 153, original, remainder, calculated = 0;

        original = input;

        while (input > 0)
        {
            remainder = input % 10;
            input=input/ 10;
            calculated=calculated+(remainder*remainder*remainder);
        }       
        if(original == calculated)
            System.out.println(calculated + " is an Armstrong number.");
        else
            System.out.println(calculated + " is not an Armstrong number.");
    }
	}


