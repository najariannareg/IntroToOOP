import java.util.Scanner;

public class homework1Exercise5
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double radius = input.nextDouble();
		double circumference = 2 * Math.PI * radius;
		double area = Math.PI * Math.pow(radius, 2);
		System.out.println("circumference = " + circumference);
		System.out.println("area = " + area);
	}
}