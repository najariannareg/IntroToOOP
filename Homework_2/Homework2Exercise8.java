import java.util.*;

public class Homework2Exercise8 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		String out = "";

		bitString(number, out, 1);
	}
	
	public static void bitString(int number, String result, int lastDigit){
		if (number == 0){
			System.out.println(result);
			return;
		}
		bitString(number - 1, result + "1", 1);
		if (lastDigit == 1) {
			bitString(number - 1, result + "0", 0);
		}
	}
	
}


/*

for n=4 the program makes 4 recursive calls.

1 - 11 - 111 - 1111
             - 1110
       - 110 - 1101
  - 10 - 101 - 1011
             - 1010
0 - 01 - 011 - 0111
             - 0110
       - 010 - 0101

the number of resulting string of length n is 
(number of resulting string of length n - 1) + (number of resulting string of length n - 2)
	
*/