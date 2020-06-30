import java.util.Scanner;
public class Exercise6 {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		boolean status = ticketStatus(number);
		printTicketStatus(number, status);
		
	}
	
	public static boolean ticketStatus(int number) {
		int sumRight = 0;
		int sumLeft = 0;
		for(int i = 0; i <= 2; i++) {
			int digit = number % 10;
			sumRight += digit;
			number /= 10;
		}
		for(int i = 0; i <= 2; i++) {
			int digit = number % 10;
			sumLeft += digit;
			number /= 10;
		}
		boolean ticketStatus = sumRight == sumLeft;
		return ticketStatus;
	}
	
	public static void printTicketStatus(int number, boolean status) {
		if(status == false) {
			System.out.println(number + " is not a lucky ticket");
		}
		else {
			System.out.println(number + " is a lucky ticket");
		}
	}
	
}
