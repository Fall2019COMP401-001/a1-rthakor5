package a1;

import java.text.DecimalFormat;
import java.util.Scanner;


class CustomerA {
	String firstName; 
	String lastName; 
	String itemName;
	double total;
	double itemPrice;
	int customerCount;
	int numberOfItems;
	int quantity;
}

public class A1Adept {
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scanning(scan);
	}
	
	public static void scanning(Scanner scan) {
		String firstNames[] = new String[50];
		String lastNames[] = new String[50];
		String items[] = new String[50];
		double price[] = new double[50];
		double customers[] = new double[50];
		int amount = scan.nextInt();
		for (int i = 0; i < amount; i++) {
			String name = scan.next();
			items[i] = name;
			double itemPrice = scan.nextDouble();
			price[i] = itemPrice;
		}
		int customerCount = scan.nextInt();
		CustomerA[] customer = new CustomerA[customerCount];
		for (int x = 0; x < customerCount; x++) {
			CustomerA Consumer = new CustomerA();
			Consumer.firstName = scan.next();
			firstNames[x] = Consumer.firstName;
			Consumer.lastName = scan.next();
			lastNames[x] = Consumer.lastName;
			Consumer.numberOfItems = scan.nextInt();
			for (int h = 0; h < Consumer.numberOfItems; h++) {
				double total = 0.00;
				Consumer.quantity = scan.nextInt();
				Consumer.itemName = scan.next();
				for (int y = 0; y < amount; y++) {
					if(items[y].equals(Consumer.itemName)) {
						double itemTotal = Consumer.quantity * price[y];
						Consumer.total += itemTotal;
					}
				customers[x] = Consumer.total;
				}
			}
		}
			double min = customers[0];
			double max = customers[0];
			double avg = 0;
			double cost = 0;
			String largestFN = null;
			String largestLN = null;
			String smallestFN = null;
			String smallestLN = null;
			String largestValue;
			String smallestValue;
			String average;
			for (int r = 0; r < customerCount; r++) {
				if(customers[r] >= max) {
					max = customers[r];
					largestFN = firstNames[r];
					largestLN = lastNames[r];
				}
				if(customers[r] <= min) {
					min = customers[r];
					smallestFN = firstNames[r];
					smallestLN = lastNames[r];
				}
				cost += customers[r];
			}
			avg = cost / customerCount;
			DecimalFormat dec = new DecimalFormat("0.00");
			largestValue = dec.format(max);
			smallestValue = dec.format(min);
			average = dec.format(avg);
			System.out.println("Biggest: " + largestFN + " " + largestLN + " (" + largestValue + ") ");
			System.out.println("Smallest: " + smallestFN + " " + smallestLN + " (" + smallestValue + ") " );
			System.out.println("Average: " + average);
	}
}





