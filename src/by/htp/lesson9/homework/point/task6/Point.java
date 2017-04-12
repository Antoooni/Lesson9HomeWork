package by.htp.lesson9.homework.point.task6;

import java.util.Scanner;

public class Point {
	private double x; // abscissa
	private double y; // ordinate

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public Point() {
		x = 0;
		y = 0;
	}

	public Point(double x, double y) {

		this.x = x;// this.x is absciss
		this.y = y;// this.y is ordinate
	}

	public double getAcceleration(double s) {
		return 2 * s / t / t;
	}

	private static int t = 5;// time in sec

	public double getSpeed(double s) {
		return s / t;// s/t
	}

	// move point in specified coordinates
	public void setPoint(double a, double b) {
		x = a;
		y = b;
	}

	// enter new coordinates
	public void inputPoint() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x: ");
		double x = sc.nextDouble();
		System.out.print("Enter y: ");
		double y = sc.nextDouble();
		setPoint(x, y);// fix coordinates
	}

	public void inputPointMove() {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter new x: ");
		double x = inp.nextDouble();
		System.out.print("Enter new y: ");
		double y = inp.nextDouble();
		setPoint(x, y);// fix coordinates
	}

	// find distance
	public double getDistance(Point a) {
		return Math.sqrt(Math.pow(x - a.x, 2) + Math.pow(y - a.y, 2));
	}

	static boolean intersectionPath(double x1, double y1, double x2, double y2, double x3, double y3, double x4,
			double y4) {
		double x = 0;
		double y;
		double a, a1 = 0, a2 = 0;
		double b, b1 = 0, b2 = 0;
		if (x1 == x2) {
			if (x3 == x4)
				return false;
			x = x1;
		} else {
			a1 = (y1 - y2) / (x1 - x2);
			b1 = y1 - a1 * x1;
		}

		if (x3 == x4) {
			x = x3;
		} else {
			a2 = (y3 - y4) / (x3 - x4);
			b2 = y3 - a2 * x3;
		}

		if (x == 0) {
			x = (b2 - b1) / (a1 - a2);
		}
		if (x == x1) {
			a = a2;
			b = b2;
		} else {
			a = a1;
			b = b1;
		}
		if (x > Math.max(x1, x2) || x > Math.max(x3, x4) || x < Math.min(x1, x2) || x < Math.min(x3, x4))
			return false;
		y = a * x + b;

		return y >= Math.min(y1, y2) && y <= Math.max(y1, y2) && y >= Math.min(y3, y4) && y <= Math.max(y3, y4);
	}
}
