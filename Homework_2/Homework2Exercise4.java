import java.util.Scanner;

public class Homework2Exercise4 {
	public static void main(String[] args)
	{
		//every day and temperature
		double[] month = month();
		
		//hottest day and temperature
		double[] hottest = hottest(month);
		int hottestDay = (int)hottest[0];
		double hottestTemperature = hottest[1];
		System.out.println("day " + hottestDay + " is the hottest day of the month with a temperature of " + hottestTemperature + " degrees");
		
		//coolest day and temperature
		double[] coolest = coolest(month);
		int coolestDay = (int)coolest[0];
		double coolestTemperature = coolest[1];
		System.out.println("day " + coolestDay + " is the coolest day of the month with a temperature of " + coolestTemperature + " degrees");
		
		//average temperature
		double average = averageTemperature(month);
		System.out.println("the average temperature of the month is " + average + " degrees");
		
		//temperature difference
		double delta = deltaTemperature(hottestTemperature, coolestTemperature);
		System.out.println("the temperature difference between the hottest and the coolest days of the month is " + delta + " degrees");
	}
	
	public static double[] month() {
		Scanner input = new Scanner(System.in);
		int days = input.nextInt();
		double[] month = new double[days];
		for(int i = 0; i < days; i++) {
			month[i] = input.nextDouble();
		}
		return month;
	}
	
	public static double[] hottest(double[] month) {
		double[] array = new double[2];
		double hottestDay = 0;
		double hottestTemperature = month[0];
		for(int i = 1; i < month.length; i++) {
			if(hottestTemperature < month[i]) {
				hottestDay = i + 1;
				hottestTemperature = month[i];
			}
		}
		array[0] = hottestDay;
		array[1] = hottestTemperature;
		return array;
	}
	
	public static double[] coolest(double[] month) {
		double[] array = new double[2];
		double coolestDay = 0;
		double coolestTemperature = month[0];
		for(int i = 1; i < month.length; i++) {
			if(coolestTemperature > month[i]) {
				coolestDay = i + 1;
				coolestTemperature = month[i];
			}
		}
		array[0] = coolestDay;
		array[1] = coolestTemperature;
		return array;
	}
	
	public static double averageTemperature(double[] month) {
		double sum = 0;
		for(int i = 0; i < month.length; i++) {
			sum += month[i];
		}
		double average = sum / month.length;
		return average;
	}
	
	public static double deltaTemperature(double hottestTemperature, double coolestTemperature) {
		double delta = hottestTemperature - coolestTemperature;
		return delta;
	}
	
}
