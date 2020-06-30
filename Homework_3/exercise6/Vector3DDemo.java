import java.util.Scanner;

public class Vector3DDemo {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		Vector3D vector1 = new Vector3D();
		Vector3D vector2 = new Vector3D();
		
		vector1.vector = new int[number];
		for(int i = 0; i < number; i++) {
			vector1.vector[i] = sc.nextInt();
		}
		
		vector2.vector = new int[number];
		for(int i = 0; i < number; i++) {
			vector2.vector[i] = sc.nextInt();
		}
		
		Vector3D vectorProduct = vector1.vectorProduct(vector2);
		vectorProduct.printVector();
		
	}
	
}
