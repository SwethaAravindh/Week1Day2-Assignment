package week1.day1;

import java.util.Scanner;

public class SumOfDigit {
	private static int findSumOfDigits(int no) {
        int sum = 0;

        while (no > 0) {
            sum += no % 10;
            no /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        int no, sum;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        no = sc.nextInt();

        sum = no;

        while (sum > 9) {
            sum = findSumOfDigits(sum);
        }

        System.out.println("Sum for " + no + " is: " + sum);
    }   

}
