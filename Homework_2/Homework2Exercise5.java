import java.util.Scanner;

public class Homework2Exercise5 {
	public static void main(String[] args)
	{
		String[] phrase = phrase();
		String[] swappingPhrase = swappingPairs(phrase);
		printSwappedPhrase(swappingPhrase);
		
	}
	
	public static String[] phrase() {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String[] phrase = new String[n];
		for(int i = 0; i < n; i++) {
			phrase[i] = input.next();
		}
		return phrase;
	}
	
	public static String[] swappingPairs(String[] array) {
		String[] swappedPhrase = new String[array.length];
		for(int i = 0; i < array.length; i++) {
			if(array.length % 2 == 1 && i == array.length - 1) {
				swappedPhrase[i] = array[i];
			}
			else if(i % 2 == 1) {
				swappedPhrase[i] = array[i - 1];
			}
			else if(i % 2 == 0) {
				swappedPhrase[i] = array[i + 1];
			}
		}
		return swappedPhrase;
	}
	
	public static void printSwappedPhrase(String[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
}
