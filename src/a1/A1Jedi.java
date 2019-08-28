package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] customers = new int[50];
		int[] quantity = new int[50];
		int[] itemNumber = new int[50];
		String[] itemName = new String[50];
		String[] itemBought = new String[50];
		String[] firstNames = new String[50];
		String[] lastNames = new String[50];
		int[] amountOfItems = new int[50];
		int itemsInStore = scan.nextInt();
		for (int i = 0; i < itemsInStore; i++) {
			itemName[i] = scan.next();
			double price = scan.nextDouble();
			customers[i] = 0;
			itemNumber[i] = 0;
		}
		int count = scan.nextInt();
		int[] customerCount = new int[count];
		for (int h = 0; h < count; h++) {
			String s = scan.next();
			firstNames[h] = s;
			String l = scan.next();
			lastNames[h] = l;
			int amount = scan.nextInt();
			boolean bought[] = new boolean[50];
			amountOfItems[h] = amount;
			for (int k = 0; k < itemsInStore; k++) {
				bought[k] = true;
			}
			for (int f = 0; f < amount; f++) {
				int quantityItem = scan.nextInt();
				quantity[f] = quantityItem;
				String item = scan.next();
				itemBought[f] = item;
				for (int g = 0; g < itemsInStore; g++) {
					if (itemBought[f].equals(itemName[g]) && bought[g]) {
						customers[g] += 1;
					}
					if (itemBought[f].equals(itemName[g])) {
						itemNumber[g] += quantityItem;
						bought[g] = false;
					}
				}
			}
		}
				for (int y = 0; y < itemsInStore; y++) {
					if (customers[y] > 0) {
						System.out.println(customers[y] + " customers bought " + itemNumber[y] + " " + itemName[y]);
					} else {
						System.out.println("No customers bought " + itemName[y]);
					}
				}
	}
}
