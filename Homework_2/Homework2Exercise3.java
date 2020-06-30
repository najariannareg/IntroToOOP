import java.util.Scanner;

public class Homework2Exercise3 {
	public static void main(String[] args)
	{		
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();

		//loop
		System.out.println(factorialLoop(number));
			
		//recursion
		System.out.println(factorialRecursion(number));
	}
	
	public static int factorialLoop(int number) {
		if(number == 0) {
			return 1;
		}
		int sum = 1;
		for(int i = 1; i <= number; i++)
			sum *= i;
		return sum;
	}
	
	public static int factorialRecursion(int number) {
		if(number == 0) {
			return 1;
		}
		if(number == 1) {
			return 1;
		}
		return number * factorialRecursion(number - 1);
	}
	
}

/*

the maximum value for n that allows its factorial to be represented with type long is 16, because after that stack overflow happens and it results a negative number.

*/