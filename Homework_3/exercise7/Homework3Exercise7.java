import java.util.Scanner;

public class Homework3Exercise7 {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String string1 = sc.next();
		String string2 = sc.next();
		substringCyclicShiftIterative(string1, string2);
		//substringCyclicShiftRecursive(0, string1, string2);
	}
	
	public static void substringCyclicShiftIterative(String string1, String string2) {
		int number = 0;
		for(int i = 0; i < string1.length() - (string2.length() - 1); i++) {
			String substring = string1.substring(i, i + string2.length());
			//System.out.println(substring);
			
			StringBuilder cyclicShift = new StringBuilder(string2);
			for(int j = 0; j < string2.length(); j++) {
				cyclicShift.append(cyclicShift.charAt(0));
				cyclicShift.deleteCharAt(0);
				if(substring.equals(cyclicShift.toString())) {
					//System.out.println(cyclicShift.toString());
					number++;
				}
			}
		}
		System.out.println(number);
	}
	
	
	/*public static void substringCyclicShiftRecursive(int number, String string1, String string2) {
		
		
	}*/
	
}
