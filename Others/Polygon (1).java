public class Polygon
{
	public double[] sideLengths;

	public double findPerimeter()
	{
		double sum = 0.0;
		for (int i = 0; i < this.sideLengths.length; i++)
			sum += this.sideLengths[i];
		return sum;
	}

	public String toString()
	{
		StringBuilder sb = new StringBuilder("A polygon with side lengths\n");
		for (int i = 0; i < this.sideLengths.length; i++)
			sb.append(this.sideLengths[i] + " ");
		return sb.toString();
	}

	public boolean equals(Polygon that)
	{
		if (this.sideLengths.length != that.sideLengths.length)
			return false;

		// comparison of array elements goes here
		return true;
	}
}
