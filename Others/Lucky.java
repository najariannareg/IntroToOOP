import java.util.*;

public class Lucky {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		while(number != -1) {
			System.out.println(isLucky(number));
			number = sc.nextInt();
		}
	}
	
	public static boolean isLucky(int n) {
		return digitsSum(n%1000)==digitsSum(n/1000);
	}
	
	public static int digitsSum(int n) {
		int sum = 0;
		
		while(n!=0) {
			sum += n%10;
			n /= 10;
		}
		
		return sum;
	}
}
