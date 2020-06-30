import java.util.Scanner;

public class PrintReversed
{
	public static void main(String[] args)
	{
		int n; // a variable to read the size of the array
		int[] numbers; // an array variable named numbers

		Scanner in = new Scanner(System.in);
		// read the intended array size
		n = in.nextInt();
		// initialize the array
		numbers = new int[n];
		// read the array elements, one in each iteration
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = in.nextInt();
		// traverse the array backwards and
		// thus print the elements in reversed order
		for (int i = numbers.length - 1; i >= 0; i--)
			System.out.println(numbers[i]);
 
	}
}
/* This is a program that first inputs an integer n, then inputs n integers 
and prints them in reversed order, one per line. */
