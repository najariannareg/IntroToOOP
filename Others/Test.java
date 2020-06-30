import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		PasswordGenerator gen = new PasswordGenerator();
		System.out.println(gen.generate(8));
	}
}