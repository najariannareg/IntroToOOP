
public class Point {
	public double x;
	public double y;
	
	public double module() {
		return Math.sqrt(x*x + y*y);
	}
	
	public double distance(Point other) {
		return Math.sqrt((x-other.x)*(x-other.x) +
				(y-other.y)*(y-other.y));
	}
}
