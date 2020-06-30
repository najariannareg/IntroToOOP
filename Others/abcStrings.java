import java.util.*;

public class abcStrings
{
	public static void generateStrings(StringBuilder sb, int index, int cap)
	{
		if (index == cap)
			return;
		sb.append('a');
		System.out.println(sb);
		generateStrings(sb, index + 1, cap);
		sb.delete(index, index + 1);
		sb.append('b');
		System.out.println(sb);
		generateStrings(sb, index + 1, cap);
		sb.delete(index, index + 1);
		sb.append('c');
		System.out.println(sb);
		generateStrings(sb, index + 1, cap);
		sb.delete(index, index + 1);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		generateStrings(sb, 0, n);
	}
}
