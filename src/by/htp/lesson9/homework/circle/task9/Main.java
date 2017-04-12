package by.htp.lesson9.homework.circle.task9;
/*
 * Determine the class Circle in the plane. Determine the area and perimeter.
 * Find circles whose centers lie on one line. Determine the largest and smallest object in area.
 * */
public class Main {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println("Perimeter c1: "+c1.perimeter(c1)+ "m, square: "+c1.square(c1)+" m2");
		c1.show();
		Circle c2 = new Circle();
		System.out.println("Perimeter c2: "+c2.perimeter(c2)+ "m, square: "+c2.square(c2)+"m2");
		c2.show();
		
		boolean isOnTheSameLine=c1.sameLine(c2);
		System.out.println("Circles on the same line: "+isOnTheSameLine);
		
		c1.eqSquare(c2);
	}

}
