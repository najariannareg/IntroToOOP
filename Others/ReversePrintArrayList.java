import java.util.*;
//import java.util.ArrayList;
//import java.util.Scanner;

public class ReversePrintArrayList
{
	public static void main(String[] args)
	{
		ArrayList<Double> arrayList = new ArrayList<>();
		readValues(arrayList);
		for (double element : arrayList)
			System.out.println(element);

		for (int i = arrayList.size() - 1; i >= 0; i--)
			System.out.println(arrayList.get(i));
	}

	public static void readValues(ArrayList<Double> al)
	{
		Scanner keyboard = new Scanner(System.in);
		while (keyboard.hasNextDouble())
			al.add(keyboard.nextDouble());
	}
}
