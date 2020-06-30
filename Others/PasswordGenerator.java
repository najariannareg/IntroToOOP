
public class PasswordGenerator {
	char[] characters = {'a','b','c','d','e','f'};
	public String generate(int length) {
		String result = "";
		for (int i=0; i<length; i++) {
			int number = (int)(Math.random() * 6);
			result += characters[number];	
		   }
		return result;
	}
}
