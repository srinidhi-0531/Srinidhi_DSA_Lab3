package lab3.brackets;

import java.util.Scanner;

public class BalancedBracketsMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to check if brackets are balanced or not:");
		String brackets = sc.nextLine();
		System.out.println(BBImplementation.balancedOrNot(brackets));
		sc.close();
		
	}
}