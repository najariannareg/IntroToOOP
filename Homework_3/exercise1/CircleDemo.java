import java.util.Scanner;

public class CircleDemo {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Circle myCircle = new Circle();
		myCircle.radius = sc.nextDouble();
		while(myCircle.radius >= 0)
		{
			double circumference = myCircle.calculateCircumference();
			double area = myCircle.calculateArea();
			System.out.println(circumference);
			System.out.println(area);
			myCircle.radius = sc.nextDouble();
		}
	}
	
}
