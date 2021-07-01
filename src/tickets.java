import java.util.Scanner;

public class tickets {
	
	static final int TICKET_COUNT = 100;
	static final int MAX_TICKETS_PER_USER = 4;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int tickets = TICKET_COUNT;
		int customrs = 0;
		
		System.out.println("Total tickets = " +tickets);
		
		while(tickets > 0) {
			System.out.println("Hello, how many tickets would you like?");
			int ticketAmount  = input.nextInt();
			
			if (ticketAmount < 0 || ticketAmount > MAX_TICKETS_PER_USER) {
				System.err.println("Sorry you can only buy  1 to "+ MAX_TICKETS_PER_USER+ " tickets");
				continue;
			}
			
			if (ticketAmount == 0) {
				System.err.println("What are you doing here if you do not want to buy");
				continue;
			}
			
			if (tickets < ticketAmount) {
				System.out.println("Sorry you are too late, there are only "+ tickets+ " left");
				continue;
			}
			
			tickets -= ticketAmount;
			customrs++;
			System.out.println("Thank you!! you have sucessfully bought "+ ticketAmount+ " tickets");
		}
		
		System.out.println("YESSSS! All tickets have been sold to "+ customrs+ " customers");

	}

}
