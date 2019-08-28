package a1;

import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;


public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String[] firstNames = new String[50];
		String[] lastNames = new String[50];
		String[] items = new String[50];
		String sum = null;
		double total = 0.00;
		int count = scan.nextInt();
		int[] customer = new int[count];
		String[] customers = new String[50];
		for (int i = 0; i < count; i++) {
			String s = scan.next();
			firstNames[i] = s;
			String n = scan.next();
			lastNames[i] = n;
			int itemsBought = scan.nextInt();
			int[] quantity = new int[itemsBought];
			for (int h = 0; h < itemsBought; h++) {
				int amount = scan.nextInt();
				String itemName = scan.next();
				items[h] = itemName;
				double price = scan.nextDouble();
				double cost = amount * price;
				total += cost;
		}	
			DecimalFormat dec = new DecimalFormat("0.00");
			sum = dec.format(total);
			customers[i] = sum;
			total = 0;
			}
		for (int c = 0; c < count; c ++) {
			System.out.println(firstNames[c].charAt(0) + "." + " " + lastNames[c] + ":" + " "+ customers[c]);
		}
	}
}
