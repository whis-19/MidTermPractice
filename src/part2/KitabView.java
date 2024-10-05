package part2;


import java.util.Scanner;

public class KitabView implements Observer{
	Scanner scan; 
	private Kitab kitab;

public KitabView(Kitab kitab) {
	this.scan = new Scanner(System.in);
	this.kitab = kitab;
}

	public void printKitabInfo() {
		System.out.println("Book: " + kitab.getTitle());
		System.out.println("Price: Rs " + kitab.getPrice());
		System.out.println("Weight: " + kitab.getWeight());
	}

	public double editKitabInfo() {
		System.out.print(" Update price: ");
		return scan.nextDouble(); 
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
        System.out.println("\nBook details updated:");
        printKitabInfo();
		
	}
}