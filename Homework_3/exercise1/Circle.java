
public class Circle {
	
	public double radius;
	
	public double calculateCircumference()
	{
		double circumference = 2 * Math.PI * this.radius;
		return circumference;
	}
	
	public double calculateArea()
	{
		double area = Math.PI * Math.pow(this.radius, 2);
		return area;
	}
	
}
