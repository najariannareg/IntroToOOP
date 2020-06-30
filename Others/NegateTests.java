import java.util.Scanner;

public class NegateTests
{
	public static boolean negate(int num)
	{
		System.out.print("The negated value for " + num + " is ");
		num = -num;
		System.out.println(num);
		return (num > 0);
	}
	public static boolean negate(double num)
	{
		System.out.print("The negated value for " + num + " is ");
		num = -num;
		System.out.println(num);
		return (num > 0.0);
	}
	public static boolean negate(int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
			arr[i] = -arr[i];
		return (arr[0] > 0);
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if (negate(number))
			System.out.println("The original value of " + number + " was negative");
		else
			System.out.println("The original value of " + number + " was positive");
		System.out.println("The value is still "+ number);
		System.out.println();

		double fNumber = sc.nextDouble();
		if (negate(fNumber))
			System.out.println("The original value of " + fNumber + " was negative");
		else
			System.out.println("The original value of " + fNumber + " was positive");
		System.out.println("The value is still " + fNumber);
		System.out.println();

		int[] a = {5, -4, 10};
		if (negate(a))
			System.out.println("The first element was negative");
		else
			System.out.println("The first element was positive");
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
	}
}
