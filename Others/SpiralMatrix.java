import java.util.Scanner;

public class SpiralMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n!=-1) {
			int[][] spiral = input(n);
			printMatrix(spiral);
			n = sc.nextInt();
		}
	}
	
	public static int[][] input(int n){
		int[][] result = new int[n][n];
		int layer = 0;
		int index = 1;
		
		while(index <= n*n) {
			int start = layer;
			int end = n-1-layer;
			for(int i=start; i <=end; ++i) {
				result[start][i] = index++;
			}
			
			for(int i = start +1; i<=end; ++i) {
				result[i][end] = index++;
			}
			
			for(int i = end-1;i>=start; --i) {
				result[end][i] = index++;
			}
			
			for(int i=end-1; i>start; --i) {
				result[i][start] = index++;
			}
			
			layer++;
		}
		
		return result;
	}
	
	public static void printMatrix(int[][] matrix) {
		int size = matrix.length;
		
		for(int i=0; i<size; ++i) {
			for(int j=0; j<size;++j) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
