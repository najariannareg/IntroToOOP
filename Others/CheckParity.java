/* This program inputs a sequence of positive numbers and, for each, outputs a statement about their parity (odd/even). The sentinel for the end of input is a negative number. Once, a negative number is read, the program terminates. */



import java.util.Scanner;



public class CheckParity
{

	public static void main(String[] args)
	{

		Scanner keyboard = new Scanner(System.in);

		int n = keyboard.nextInt();

		while (n > 0)
		{

			if (n % 2 == 0)
	
			System.out.println(n + " is even");

			else
	
			System.out.println(n + " is odd");

			n = keyboard.nextInt();

		}

	}

}
