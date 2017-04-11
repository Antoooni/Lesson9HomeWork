package by.htp.lesson9.homework.circle.task9;

import java.util.Scanner;

public class Circle {
	private double r; 
	private Point centre; 
	
	// Circle description
	public String toString() {
		return "The circle in centre " + centre + " and radius " + r;
	}

	//show description
	public void show() {
		System.out.print(this.toString());
	}

	

	// change center and radius
	public void set(double a, double b, double m) {
		centre.set(a, b);
		r = m;
	}

	// change center and radius
	public void set(Point p, double m) {
		centre.set(p.x, p.y);
		r = m;
	}

	
	Circle() {
		System.out.println("Enter circle centre:");
		centre = new Point();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter radius: ");
		r = scan.nextDouble();
	}

	Circle(double a, double b, double m) {
		centre.set(a, b);
		r = m;
	}

	
	public double perimeter(Circle c) {
		return 2 * Math.PI * r;
	}

	
	public double square(Circle c) {
		return Math.PI * r * r;
	}

	public boolean sameLine(Circle o) {
		if (
		centre.x == o.centre.x || centre.y == o.centre.y) { // is on the same line
			return true;
		} else {
			return false;
		}
	}

	public void eqSquare(Circle o) {
		if (this.square(o) >  o.square(o)) 
		{
			System.out.println("Square "+ this.square(o)+" more than square "+ o.square(o));
		}
		else if(this.square(o) <  o.square(o)){
			System.out.println("Square "+ this.square(o)+" less than square "+ o.square(o));
		}
		else{
			System.out.println("Squares are equal!");
		}
		
	}

}
