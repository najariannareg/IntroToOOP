import java.util.Scanner;

public class Homework2Exercise1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int grade = sc.nextInt();
		
		//(a)
		int a = 0;
		int b = 0;

		switch(grade)
		{
			case 10 | 9:
				a = 1;
				b = 2;
				break;
			case 8:
				a = 3;
				b = 4;
				break;
			default:
				a = 5;
		}
		System.out.println(a);
		System.out.println(b);

		//(b)
		int sum = 0;
		int power = 1;

		int i = 0;
		while(i < 25)
		{
			sum += power;
			power = power << 1;
			i++;
		}
		System.out.println(sum);
		System.out.println(power);
	}
}

/*

the value computed in sum is 33554431

*/