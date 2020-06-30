import java.util.Scanner;

public class PolygonDemo
{
	public static void main(String[] args)
	{
		Polygon myPolygon = new Polygon();
		Scanner sc = new Scanner(System.in);
		myPolygon.sideLengths = new double[sc.nextInt()];
		for (int i = 0; i < myPolygon.sideLengths.length; i++)
			myPolygon.sideLengths[i] = sc.nextDouble();

		System.out.println("The perimeter is " + myPolygon.findPerimeter());	
	}
}