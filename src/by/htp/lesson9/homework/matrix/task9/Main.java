package by.htp.lesson9.homework.matrix.task9;

import java.util.Random;
//page 51 task 9 VAR C
//Create the matrix, subtracting from its elements in each row of the matrix its arithmetic mean.
//Construct the matrix, subtracting from the elements of each row of the matrix average arithmetical.
public class Main {
	public static void main(String[] args) {
		int sizeX = 3;
		int sizeY = 3;

			int[][] matrix = new int[sizeX][sizeY];
			Random rand = new Random();
			//create matrix
			for (int i = 0; i < sizeX; i++) {
				for (int j = 0; j < sizeY; j++) {
					matrix[i][j] = rand.nextInt(10);
				}
			}
			//show matrix
			System.out.println("The original matrix:");
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.print(matrix[i][j] + "  ");
				}
				System.out.println();
			}
			System.out.println("The new matrix:");
			// Average arithmetical of row
			for (int i = 0; i < 3; i++) {
				int sum = 0;
				int rowAverage = 0;
				for (int j = 0; j < 3; j++) {
					sum += matrix[i][j];
				}
				rowAverage = sum / sizeX;
				System.out.println("row " + i + " average arithmetical: " + rowAverage);
				// fill new matrix
				for (int j = 0; j < sizeY; j++) {
					matrix[i][j] = matrix[i][j] - rowAverage;
				}

			}
			//show new matrix
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.print(matrix[i][j] + "   ");
				}
				System.out.println();
			}
		

	}

}
