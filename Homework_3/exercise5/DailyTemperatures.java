
public class DailyTemperatures {
	
	int days;
	double[] month;
	
	public double[] hottest() {
		double[] array = new double[2];
		double hottestDay = 0;
		double hottestTemperature = this.month[0];
		for(int i = 1; i < this.month.length; i++) {
			if(hottestTemperature < this.month[i]) {
				hottestDay = i + 1;
				hottestTemperature = this.month[i];
			}
		}
		array[0] = hottestDay;
		array[1] = hottestTemperature;
		return array;
	}
	
	public double[] coolest() {
		double[] array = new double[2];
		double coolestDay = 0;
		double coolestTemperature = this.month[0];
		for(int i = 1; i < this.month.length; i++) {
			if(coolestTemperature > this.month[i]) {
				coolestDay = i + 1;
				coolestTemperature = this.month[i];
			}
		}
		array[0] = coolestDay;
		array[1] = coolestTemperature;
		return array;
	}
	
	public double averageTemperature() {
		double sum = 0;
		for(int i = 0; i < this.month.length; i++) {
			sum += this.month[i];
		}
		double average = sum / this.month.length;
		return average;
	}
	
	public double deltaTemperature(double hottestTemperature, double coolestTemperature) {
		double delta = hottestTemperature - coolestTemperature;
		return delta;
	}
	
}

	

