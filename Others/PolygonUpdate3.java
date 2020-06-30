public class PolygonUpdate3
{
	private static int counter = 0;
	private double[] sideLengths;

	public Polygon()
	{
		counter++;
	}

	public Polygon(int numberOfSides)
	{
		counter++;
		sideLengths = new double[numberOfSides];
	}

	public Polygon(double[] sideLengths)
	{
		counter++;
/*		this.sideLengths = new double[sideLengths.length];
		for (int i = 0; i < this.sideLengths.length; i++)
			this.sideLengths[i] = sideLengths[i];
*/
		this.sideLengths = new double[sideLengths.length];
		for (int i = 0; i < this.sideLengths.length; i++)
			setSideLength(i + 1, sideLengths[i]);
	}

	public static int getCounter()
	{
		return counter;
	}

	public static void printDescription()
	{
		System.out.println("Polygon is a class for representing various polygons.");
	}

	public static Polygon generateEquilateral(int numberOfSides, double side)
	{
		Polygon poly = new Polygon(numberOfSides);
		for (int i = 0; i < poly.sideLengths.length; i++)
			poly.sideLengths[i] = side;
		return poly;
	}

	public int getNumberOfSides()
	{
		return sideLengths.length;
	}

	/**
	 Indexing starts at 1
	 */
	public double getSideLength(int number)
	{
		if (number < 1 || number > sideLengths.length)
		{
			System.out.println("Index out of range");
			System.exit(0);
		}
		return sideLengths[number - 1];
	}

	public void setNumberOfSides(int numberOfSides)
	{
		if (numberOfSides < 3)
		{
			System.out.println("Invalid number of sides");
			System.exit(0);
		}
		sideLengths = new double[numberOfSides];
	}

	/**
	 Indexing starts at 1
	 */
/*	public void setSideLength(int number, double length)
	{
		if (number < 1 || number > sideLengths.length)
		{
			System.out.println("Index out of range");
			System.exit(0);
		}
		sideLengths[number - 1] = length;
	}
*/
	public boolean setSideLength(int number, double length)
	{
		if (number < 1 || number > sideLengths.length)
			return false;
		else
		{
			sideLengths[number - 1] = length;
			return true;
		}
	}

	public double findPerimeter()
	{
		double sum = 0.0;
		for (int i = 0; i < this.sideLengths.length; i++)
			sum += this.sideLengths[i];
		return sum;
	}

	// Updated this method to take care of the case when the array does not exist
	public String toString()
	{
		if (this.sideLengths == null)
		{
			System.out.println("Fatal Error: Polygon sideLengths array does not exist");
			System.exit(0);
			return ""; // This line is required by the compiler
		}
		else
		{
			StringBuilder sb = new StringBuilder("A polygon with side lengths\n");
			for (int i = 0; i < this.sideLengths.length; i++)
				sb.append(this.sideLengths[i] + " ");
			return sb.toString();
		}
	}

	public boolean equals(Polygon that)
	{
		if (this.sideLengths.length != that.sideLengths.length)
			return false;

		// comparison of array elements goes here
		return true;
	}


	/* A main method can be added into any class definition.
	 Sometimes adding such a method is convenient for testing. */
	public static void main(String[] args)
	{
		printDescription();
		// counter and getCounter() can be used interchangeably
		// since this main method is still in the same class
		System.out.println("The counter is currently " +  getCounter());

		Polygon square = generateEquilateral(4, 6.0);
		System.out.println(square);
		System.out.println("The counter is currently " +  getCounter());

		double[] rectangleSides = {1.0, 3.0, 1.0, 3.0};
		Polygon rectangle = new Polygon(rectangleSides);
		System.out.println(rectangle);
		System.out.println("The counter is currently " + getCounter());

		Polygon triangle = new Polygon(3);
		triangle.setSideLength(1, 3.0);
		triangle.setSideLength(2, 4.0);
		triangle.setSideLength(3, 5.0);
		System.out.println(triangle);
		System.out.println("The counter is currently " + getCounter());

		Polygon dummy = new Polygon();
		System.out.println(dummy);
		System.out.println("The counter is currently " + getCounter());
		printDescription();
	}
}
