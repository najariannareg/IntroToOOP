import java.util.Scanner;

public class DailyTemperaturesDemo {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		DailyTemperatures myMonth = new DailyTemperatures();
		myMonth.days = input.nextInt();
		myMonth.month = new double[myMonth.days];
		for(int i = 0; i < myMonth.days; i++) {
			myMonth.month[i] = input.nextDouble();
		}

		
		//hottest day and temperature
		double[] hottest = myMonth.hottest();
		int hottestDay = (int)hottest[0];
		double hottestTemperature = hottest[1];
		System.out.println("day " + hottestDay + " is the hottest day of the month with a temperature of " + hottestTemperature + " degrees");
		
		//coolest day and temperature
		double[] coolest = myMonth.coolest();
		int coolestDay = (int)coolest[0];
		double coolestTemperature = coolest[1];
		System.out.println("day " + coolestDay + " is the coolest day of the month with a temperature of " + coolestTemperature + " degrees");
		
		//average temperature
		double average = myMonth.averageTemperature();
		System.out.println("the average temperature of the month is " + average + " degrees");
		
		//temperature difference
		double delta = myMonth.deltaTemperature(hottestTemperature, coolestTemperature);
		System.out.println("the temperature difference between the hottest and the coolest days of the month is " + delta + " degrees");
	}
}
