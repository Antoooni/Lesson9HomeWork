package by.htp.lesson9.homework.fraction.task1;
/*Create a class Fraction (Rational Fraction) with variables m and n.
Enter the values for the fractions array. 
Create an array that changes each element of an array with an even index by adding the element following it.
 * */
import java.util.Random;

public class Fraction {
	private Fraction fraction;
	private int m;
	private int n;
	
	public Fraction getFraction() {
		return fraction;
	}

	public Fraction setFraction(Fraction fraction) {
		return this.fraction = fraction;
	}

	public double[] initialize(double[] fractionMass, int k) {
		Random rand = new Random();

		// double[] fraction = new double[k];
		for (int i = 0; i < k; i++) {
			m = rand.nextInt(10);
			n = rand.nextInt(10);
			fractionMass[i] = (10 * m + 1) / (3 * n - 2);
		}

		return fractionMass;
	}

	public void increaseEvenElement(Fraction[] mass) {
		System.out.println(mass);

	}

	public void show(double[] fractionMass) {
		for (int i = 0; i < fractionMass.length; i++) {
			System.out.print(fractionMass[i] + "    ");
		}
		System.out.println();
	}

}
