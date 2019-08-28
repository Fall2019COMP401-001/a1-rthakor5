package a1;

import java.util.Scanner;

class CustomerA {
	String firstName;
	String lastName;
	String itemName;
	int itemsBought;
	int quantity;
	double price;
}

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		int[] customers = new int[count];
		String[] firstNames = new String[30];
		String[] lastNames = new String[30];
		for (int i = 0; i < count; i++) {
			CustomerA Consumer = new CustomerA();
			Consumer.firstName = scan.next();
			firstNames[i] = Consumer.firstName;
			Consumer.lastName = scan.next();
			lastNames[i] = Consumer.lastName;
			Consumer.itemsBought = scan.nextInt();
			
		}
		
		

		
		

		

		
		
		
	}
}
