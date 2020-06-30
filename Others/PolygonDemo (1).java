import java.util.Scanner;

public class PolygonDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Polygon p1 = new Polygon();
		p1.sideLengths = new double[sc.nextInt()];
		for (int i = 0; i < p1.sideLengths.length; i++)
			p1.sideLengths[i] = sc.nextDouble();

		System.out.println(p1.toString());
		System.out.println("The perimeter is " + p1.findPerimeter());

		Polygon p2 = new Polygon();
		p2.sideLengths = new double[sc.nextInt()];
		for (int i = 0; i < p2.sideLengths.length; i++)
			p2.sideLengths[i] = sc.nextDouble();

		System.out.println(p2);
		System.out.println("The perimeter is " + p2.findPerimeter());

		if (p1.equals(p2))
			System.out.println("The two polygons are equal.");
		else
			System.out.println("The two polygons are not equal.");
	}
}
