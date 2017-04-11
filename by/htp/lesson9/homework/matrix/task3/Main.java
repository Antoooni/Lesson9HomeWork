package by.htp.lesson9.homework.matrix.task3;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int sizeX = 5;
		int sizeY = 5;

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
			for (int i = 0; i < sizeX; i++) {
				for (int j = 0; j < sizeY; j++) {
					System.out.print(matrix[i][j] + "  ");
				}
				System.out.println();
			}
			int count=0;
			int maxCount=0;
			for (int i = 0; i < sizeX; i++) {
				count=0;
				for (int j = 0; j < sizeY; j++) {
					if (j==0&&matrix[i][j]<matrix[i][j+1]){
						count=count+1;
					}
					else if (j!=0 &&matrix[i][j]>matrix[i][j-1]&&count!=0){
						count = count+1;
					} 
					if(maxCount<count){
						maxCount=count;
					}
				}
				System.out.println("Max lenght sequence of elements in ascending in row "+i+" "+count);
			}

	}

}
