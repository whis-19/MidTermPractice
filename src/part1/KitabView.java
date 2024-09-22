package part1;

import java.util.Scanner;

public class KitabView {
	Scanner scan; 

public KitabView() {
	this.scan = new Scanner(System.in);
}

	public void printKitabInfo(String title, double price, double weight) {
		System.out.println("Book: " + title);
		System.out.println("Price: Rs " + price);
		System.out.println("Weight: " + weight);
	}

	public double editKitabInfo() {
		System.out.print(" Update price: ");
		return scan.nextDouble(); 
	}
}