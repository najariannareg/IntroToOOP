import java.util.Scanner;

public class ReverseSequence
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int numberOfValues = 0;
		double[] array = new double[1000];
		while (keyboard.hasNextDouble())
		{
			array[numberOfValues] = keyboard.nextDouble();
			numberOfValues++;
		}
		for (int i = numberOfValues - 1; i >= 0; i--)
			System.out.println(array[i]);
	}
}
