package by.htp.lesson9.homework.matrix.task3;
//Find and show the largest number of increasing (decreasing) matrix elements that are consecutive.
import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int sizeX = 5;
		int sizeY = 5;
		int[][] matrix = new int[sizeX][sizeY];
		Random rand = new Random();
		// create matrix
		for (int i = 0; i < sizeX; i++) {
			for (int j = 0; j < sizeY; j++) {
				matrix[i][j] = rand.nextInt(10);
			}
		}
		// show matrix
		System.out.println("The original matrix:");
		for (int i = 0; i < sizeX; i++) {
			for (int j = 0; j < sizeY; j++) {
				System.out.print(matrix[i][j] + "  ");
			}
			System.out.println();
		}
		
		int[] matrixToString = new int[matrix.length * matrix.length];//into one-dimensional array

		int j = 0;
		int k = 0;
		int temp = 0;
		int min = 0;
		int max = 0;
		int lenghtAscending = 0;
		int lengthDecrease = 0;

		for (int[] e : matrix) {
			for (int i : e) {
				matrixToString[j++] = i;
			}
		}

		for (int i = 0; i < matrixToString.length - 1; i++) {
			if (matrixToString[i] < matrixToString[i + 1]) {// if next more
				temp += 1;
				if (temp > max) {
					max = temp;
					lenghtAscending = i + 1;
				} // save  length ascending and last ascending element
			} else {
				temp = 0;
			} // end of ascending
			if (matrixToString[i] > matrixToString[i + 1]) {
				k += 1;
				if (k > min) {
					min = k;
					lengthDecrease = i + 1;
				} //save  length ascending and last decrease element
			} else {
				k = 0;
			} // end of decrease
		}
		System.out.println("Max sequence of ascending numbers :");
		int[] ascendingSequense = new int[max + 1];
		System.arraycopy(matrixToString, (lenghtAscending - max), ascendingSequense, 0, (max + 1));
		System.out.println(Arrays.toString(ascendingSequense) + " quantity: " + (max + 1));
		System.out.println("Max sequence of decreasing numbers:");
		int[] decreaseSequense = new int[min + 1];
		System.arraycopy(matrixToString, (lengthDecrease - min), decreaseSequense, 0, (min + 1));
		System.out.println(Arrays.toString(decreaseSequense) + " quantity: " + (min + 1));

	}

}
