import java.util.Scanner;

public class ATM {
	
	static final int PIN = 1234;
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numOfAttempts = 0;
		
		while(true) {
			System.err.println("                 Please enter PIN");
			int pin = input.nextInt();
			
			if(pin == PIN) {
//				System.out.println("************************************");
//				System.out.println("           WELCOME TO GT BANK\n");
//				System.out.println("\t\t1    2    3\n\t\t4    5    6\n\t\t7    8    9\n\t\t*    0    #\n\n\t\t   ENTER");
//				System.out.println("************************************");
//				System.exit(0);
				System.out.println("Your pin is correct");
				System.exit(0);
			}
			
			System.err.println("Your pin is INCORRECT");
			numOfAttempts++;
			
			if (numOfAttempts >=3) {
				System.err.println("SORRY YOU HAVE BEEN BLOCKED!");
				System.exit(0);
			}
			
		}
	}
	
}
