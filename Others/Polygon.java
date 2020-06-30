public class Polygon
{
	public double[] sideLengths;

	public double findPerimeter()
	{
		double sum = 0.0;
		for (int i = 0; i < sideLengths.length; i++)
			sum += sideLengths[i];
		return sum;
	}
}