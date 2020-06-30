import java.util.Scanner;

public class Homework3Exercise3 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number < 1 || number > 80)
			number = sc.nextInt();
		
		System.out.println(fibonacciIterative(number));
		System.out.println(fibonacciRecursive(number));
	}
	
	public static int fibonacciIterative(int number) {
		int prevNumber = 1;
		int lastNumber = 1;
		if(number <= 2)
			return 1;
		for(int i = 3; i <= number; i++) {
			int tempNumber = lastNumber;
			lastNumber += prevNumber;
			prevNumber = tempNumber;
		}
		return lastNumber;
	}
	
	public static int fibonacciRecursive(int number) {
		if(number <= 1)
			return number;
		return fibonacciRecursive(number - 1) + fibonacciRecursive(number - 2);
	}
	
}
