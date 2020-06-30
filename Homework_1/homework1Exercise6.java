import java.util.Scanner;

public class homework1Exercise6
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String str1 = input.nextLine();
		String str2 = input.nextLine();
		String str3 = input.nextLine();
		System.out.println(str1.replaceFirst("apple", "pear"));
		System.out.println(str2.replaceFirst("apple", "pear"));
		System.out.println(str3.replaceFirst("apple", "pear"));
	}
}