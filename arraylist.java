import java.util.ArrayList;
import java.util.Scanner;
public class arraylist {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> products = new ArrayList<>();
		ArrayList<Integer> qty = new ArrayList<>();
		
		System.out.println("Enter 6 Products and quantities:");
		for (int i = 0; i < 6; i++) {
			System.out.print("Product name: ");
			products.add(sc.nextLine()); 
			
			System.out.print("Quantity: ");
			qty.add(sc.nextInt());
			sc.nextLine(); 
		}
		System.out.println("\nPRODUCT INVENTORY REPORT\n");
		System.out.printf("%-15s %10s%n", "Product", "Quantity");
		for (int i = 0; i < products.size(); i++) {
			System.out.printf("%-15s %10s%n", products.get(i), qty.get(i));
		}
		int high = 0, low = 0;
		for (int i = 1; i < qty.size(); i++) {
			if (qty.get(i) > qty.get(high)) high = i;
			if (qty.get(i) < qty.get(low)) low = i;
		}
		System.out.println("\nHighest Stock: " + products.get(high) + " (" + qty.get(high) + ")");
		System.out.println("Lowest Stock: " + products.get(low) + " (" + qty.get(low) + ")");
		
		System.out.print("\nSearch Product: ");
		String search = sc.nextLine(); 
		for (int i = 0; i < products.size(); i++) {
			if (products.get(i).equalsIgnoreCase(search)) {
				System.out.println("\nSearch Result:\n" + products.get(i) + " - " + qty.get(i) + " units");
				break;
			}
		}
		int lowCount = 0;
		for (int q : qty) if (q <= 5) lowCount++;
		System.out.println("\nProducts with Low Stock (5 or below): " + lowCount);
		
		System.out.print("\nRemove product: ");
		String remove = sc.nextLine();
		for (int i = 0; i < products.size(); i++) {
			if (products.get(i).equalsIgnoreCase(remove)) {
				products.remove(i);
				qty.remove(i);
				break;
			}
		}
		System.out.println("\nUPDATED INVENTORY\n");
		for (int i = 0; i < products.size(); i++) {
			System.out.println(products.get(i) + " - " + qty.get(i));
		}
		System.out.println("\nTotal Products: " + products.size());
		sc.close();
	}
}