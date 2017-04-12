package by.htp.lesson9.homework.matrix.task12;

import java.util.Random;

//Find in the matrix min element and move it to the place of the specified element by rearranging rows and columns
public class Main {

	public static void main(String[] args) {
		// position of chosen element
		int x = 1;
		int y = 2;

		// matrix size
		int sizeX = 3;
		int sizeY = 3;

		int[][] matrix = new int[sizeX][sizeY];
		Random rand = new Random();
		// create matrix
		for (int i = 0; i < sizeX; i++) {
			for (int j = 0; j < sizeY; j++) {
				matrix[i][j] = rand.nextInt(30);
				if (i == x && j == y) {
					System.out.println("Element in potition " + "[" + x + "," + y + "]" + " is: " + matrix[i][j]);
				}
			}
		}
		// show matrix
		System.out.println("The original matrix:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matrix[i][j] + "   ");
			}
			System.out.println();
		}
		// find min
		int min = matrix[0][0];
		int minPositionX = 0;
		int minPositionY = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (matrix[i][j] < min) {
					min = matrix[i][j];
					minPositionX = i;
					minPositionY = j;
				}
			}
		}
		System.out.println("Min element: " + min + " in position " + "[" + minPositionX + "," + minPositionY + "]");
		int temporary = 0;
		//change rows
		for (int i = 0; i < sizeX; i++) {
			temporary = matrix[minPositionX][i];
			matrix[minPositionX][i] = matrix[x][i];
			matrix[x][i] = temporary;
		}
		// change columns
		for (int i = 0; i < sizeY; i++) {
			temporary = matrix[i][minPositionY];
			matrix[i][minPositionY] = matrix[i][y];
			matrix[i][y] = temporary;
		}
		
		//new matrix 
		System.out.println("New matrix: ");
        for (int i = 0; i < sizeX; i++){
            for (int j = 0; j < sizeY; j++){
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }

	}

}
