import java.util.ArrayList;
import java.util.Scanner;

public class GCCI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<Double> prices = new ArrayList<>();
		int sanitel = 0;
		double price = 1;
		double temPrice =0;
		
		int itemCount = 1;
		int weekCount = 1;
		double percentage = 12/100.0;
	
		while(price != sanitel) {
			System.out.println("Enter price");
			price = input.nextDouble();
			if(price == 0) {
				break;
			}
			
			prices.add(price);
		}
		
		for(double p:prices) {
			System.out.println("Different prices for item " +itemCount);
			itemCount++;
			
			temPrice = p;
			
			for(int i =1; i<=6; i++) {
				System.out.println("Week "+weekCount + " " +temPrice);
				temPrice = temPrice -(percentage * temPrice);
				weekCount++;
			}
			weekCount = 1;
			temPrice = 0;
			System.out.println(p);
			
		}
		
		

	}

}
