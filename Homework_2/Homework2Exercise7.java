import java.util.Scanner;

public class Homework2Exercise7 {
	public static void main(String[] args)
	{
		int[][] matrix = spiral();
		printSpiral(matrix);
	}
	
	public static int[][] spiral() {
		int number = 0;
		while(number < 1 || number > 30) {
			System.out.println("enter 1 <= number <= 30");
			Scanner input = new Scanner(System.in);
			number = input.nextInt();
		}
		
		int[][] matrix = new int[number][number];
		int k = 1;
		

		for(int start = 0, end = number - 1; start < number; start++) {
			for(int column = start; column <= end; column++) {
				matrix[start][column] = k++;
			}
			for(int row = start + 1; row <= end; row++) {
				matrix[row][end] = k++;
			}
			for(int column = end - 1; column >= start; column--) {
				matrix[end][column] = k++;
			}
			for(int row = end - 1; row > start; row--) {
				matrix[row][start] = k++;
			}
			end--;
		}	
		return matrix;
		
	}
	
	public static void printSpiral(int[][] matrix) {
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}

