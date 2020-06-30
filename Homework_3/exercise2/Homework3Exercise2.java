import java.util.Scanner;

public class Homework3Exercise2 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] K = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
		calculatePercentage(N, K);
	}
	
	public static boolean checkPrime(int number){
		for(int i = 2; i < number; i++){
			if(number == 2)
				return true;
			if(number % i == 0){
				return false;
			}
		}
		return true;
	}
	
	public static void calculatePercentage(int N, int[] K){
		for(int j = 0; j < K.length; j++){
			double percentage = 0.0;
			double numberOfPrimes = 0.0;
			for(int i = 1; i <= K[j]; i++){
				int rand = (int)(Math.random() * N + 1);
				if(checkPrime(rand))
					numberOfPrimes++;
			}
			percentage = numberOfPrimes / K[j] * 100;
			System.out.println("for " + K[j] + " the percentage of prime numbers is " + percentage);
		}
	}
	
}
