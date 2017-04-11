package by.htp.lesson9.homework.circle.task9;

import java.util.Scanner;

public class Point {
	public double x; 
	public double y;

	// coordinates
	public String toString() {
		return "(" + x + ";" + y + ")";
	}

	// shows desc of point
	public void show() {
		System.out.print(this.toString());
	}
	// change coordinates
	public void set(double a, double b) {
		x = a;
		y = b;
	}

	public Point() {
		System.out.print("X: ");
		Scanner scan = new Scanner(System.in);
		x = scan.nextDouble();
		Scanner scan1 = new Scanner(System.in);
		System.out.print("Y: ");
		y = scan1.nextDouble();
	}

	// Constructor that creates a point with given coordinates
	public Point(double a, double b) {
		x = a;
		y = b;
	}

	
//	public double perimetr(Point p) {
//		return Math.sqrt(Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2));
//	}
//
//	// is eq point
//	public boolean equalsPoint(Point p) {
//		if (this.x == p.x && this.y == p.y) {
//			return true;
//		} else {
//			return false;
//		}
//	}
}
