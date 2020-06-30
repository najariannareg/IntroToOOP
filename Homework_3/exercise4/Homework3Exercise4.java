import java.util.Scanner;

public class Homework3Exercise4 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		while(number >= 0) {
			addDigitsGame(number);
			number = sc.nextInt();
		}	
	}
	
	public static void addDigitsGame(int number) {
		String str = Integer.toString(number);
		int steps = 0;
		int tempNumber = number;
		int tempNumberOfDigits = str.length();
		while(tempNumberOfDigits > 1) {
			int sum = 0;
			for(int i = tempNumber; i > 0; i /= 10) {
				sum += i % 10;
			}
			tempNumber = sum;
			System.out.println("sum of digits is " + sum);
			tempNumberOfDigits--;
			steps++;
		}
		System.out.println("the number of steps taken is " + steps);
	}
		
}
