import java.util.Scanner;

public class StringUppercase
{

	public static String toUppercase(String s)

	{

		StringBuilder ret = new StringBuilder();

		for (int i = 0; i < s.length(); i++)

		{

			char c = s.charAt(i);

			if (c >= 'a' && c <= 'z')

				c = (char)(c - 'a' + 'A');

			ret.append(c);

		}

		return ret.toString();

	}


	public static void main(String[] args)

	{

		Scanner sc = new Scanner(System.in);

		String line = sc.nextLine();

		System.out.println(toUppercase(line));

	}

}
