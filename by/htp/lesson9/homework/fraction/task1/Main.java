package by.htp.lesson9.homework.fraction.task1;

public class Main {

	public static void main(String[] args) {
		final int k = 4;
		
		Fraction[] mass= new Fraction[k];
		double[] fractionMass = new double[k];

		Fraction fraction1 = new Fraction();
		fractionMass = fraction1.initialize(fractionMass, k);
		mass[0]= fraction1.getFraction();
		fraction1.show(fractionMass);
		
		Fraction fraction2 = new Fraction();
		fractionMass = fraction2.initialize(fractionMass, k);
		mass[1]= fraction2;
		fraction2.show(fractionMass);
		
		Fraction fraction3 = new Fraction();
		fractionMass = fraction3.initialize(fractionMass, k);
		mass[2]= fraction3;
		fraction3.show(fractionMass);
		
		Fraction fraction4 = new Fraction();
		fractionMass = fraction4.initialize(fractionMass, k);
		mass[3]= fraction4;
		fraction4.show(fractionMass);
		
		
		
		//!!!!!!!!
		//fraction1.setFraction(fraction1);
		//fraction1 =increaseEvenElement(mass);

	}

}
