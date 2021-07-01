import java.util.ArrayList;
import java.util.Scanner;

public class Store {
	
	static Scanner input = new Scanner(System.in);
	
	static ArrayList<String> customers = new ArrayList();
	static ArrayList<Double> amountSpent = new ArrayList();
	static double highest = 0;

	
	
	public void addSale(String customerName, double amount) {
		
		customers.add(customerName);
		amountSpent.add(amount);
	}
	
	public void store() {
		
		boolean isWorkTime = true;
		
		while(isWorkTime) {
			System.out.print("Enter customer name: ");
			String cutomerName = input.next();
			if(cutomerName.equals("end")) {
				isWorkTime = false;
				break;
			}
			
			System.out.print("Enter amount spent: ");
			double amount = input.nextDouble();
			
			addSale(cutomerName, amount);
		}
		
//		System.out.println(customers);
//		System.out.println(amountSpent);
	}
	
	public String nameOfBestCustomer() {
		for(double am:amountSpent) {
			if (am > highest) {
				highest = am;
			}
		}
		
		return "Best Customer is " + customers.get(amountSpent.indexOf(highest)) + ".. spent " +highest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		new Store().store();
		System.out.println(new Store().nameOfBestCustomer());

	}

}
