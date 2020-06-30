import java.util.Scanner;

public class ConsecutiveZeros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n!=-1) {
			generate("",n);
			n = sc.nextInt();
		}
	}
	
	public static void generate(String prefix, int n) {
		if(n==0) {
			System.out.println(prefix);
			return;
		}
		
		if(prefix.endsWith("0")) {
			generate(prefix + "1", n-1);
		} else {
			generate(prefix + "0", n-1);
			generate(prefix + "1", n-1);
		}
		
	}
}
