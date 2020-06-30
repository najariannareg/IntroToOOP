import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		//Multiway	
		System.out.println(nameMultiway(number));
			
		//Switch
		System.out.println(nameSwitch(number));
		
	}
	
	public static String nameMultiway(int number) {
		String name = "";
		if(number == 6)
			name += "Million";
		else if(number == 9)
			name += "Billion";
		else if(number == 12)
			name += "Trillion";
		else if(number == 15)
			name += "Quadrillion";
		else if(number == 18)
			name += "Quintillion";
		else if(number == 21)
			name += "Sextillion";
		else if(number == 30)
			name += "Nonillion";
		else if(number == 100)
			name += "Googol";
		else
			name += "no corresponding name";
		return name;
	}
	
	public static String nameSwitch(int number) {
		String name = "";
		switch(number)
		{
			case 6:
				name += "Million";
				break;
			case 9:
				name += "Billion";
				break;
			case 12:
				name += "Trillion";
				break;
			case 15:
				name += "Quadrillion";
				break;
			case 18:
				name += "Quintillion";
				break;
			case 21:
				name += "Sextillion";
				break;
			case 30:
				name += "Nonillion";
				break;
			case 100:
				name += "Googol";
				break;
			default:
				name += "no corresponding name";
		}
		return name;
	}
}
