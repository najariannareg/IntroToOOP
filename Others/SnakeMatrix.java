public class SnakeMatrix
{
	// define a method that fills an argument matrix with a snake pattern
	// since the parameter is of array type, the argument is passed by reference
	// thus the original array will be modified and there is no need to return
	// the resulting matrix
	public static void snake(int[][] array)
	{
		int current = 1;
		for (int row = 0; row < array.length; row++)
		{
			if (row % 2 == 0) // rows with even index
			{
				// left-to-right processing
				for (int column = 0; column < array[row].length; column++)
				{
					array[row][column] = current;
					current++;
				}
			}
			else // rows with odd index
			{
				// right-to-left processing
				for (int column = array[row].length - 1; column >= 0; column--)
				{
					array[row][column] = current;
					current++;
				}
			}
		}
	}

	public static void main(String[] args)
	{
		// declare and create a square SIZExSIZE matrix
		final int SIZE = 5;
		int[][] matrix = new int[SIZE][SIZE];
		// invoke the snake method to fill the matrix with a snake pattern
		snake(matrix);
		// print the matrix to show the results
		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix[i].length; j++)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}
	}
}
