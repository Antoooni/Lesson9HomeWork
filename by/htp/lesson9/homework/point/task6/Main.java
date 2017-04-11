package by.htp.lesson9.homework.point.task6;

public class Main {

	public static void main(String[] args) {
		double x1, y1, x2, y2, x3, y3, x4, y4;
		//first point
        Point a = new Point();
        System.out.println("Enter coordinates of first point: ");
        a.inputPoint();
        x1=a.getX();
        y1=a.getY();
        Point a1 = new Point(0,0);
        System.out.println("Coordinates of first point after move: ");
        a1.inputPoint();
        x2=a1.getX();
        y2=a1.getY();
        System.out.println("Distance between positions first point: "+a1.getDistance(a)+"m");
        System.out.println("Speed first point: "+a.getSpeed(a1.getDistance(a))+"m/c");
        System.out.println("Acceleration first point:" + a.getAcceleration(a1.getDistance(a))+"m/c2");
        
        //second point
        Point b = new Point(0,0);
        System.out.println("Enter coordinates of second point: ");
        b.inputPoint();
        x3=b.getX();
        y3=b.getY();
        Point b1 = new Point(0,0);
        System.out.println("Coordinates of second point after move: ");
        b1.inputPoint();
        x4=b1.getX();
        y4=b1.getY();
        System.out.println("Distance between positions second point: "+b1.getDistance(b)+"m");
        System.out.println("Speed second point: "+b.getSpeed(b1.getDistance(a))+"m/c");
        System.out.println("Acceleration second point: "+b.getAcceleration(b1.getDistance(b1))+ "m/c2");
        System.out.println("Trajectories intersect? "+ Point.intersectionPath(x1, y1, x2, y2, x3, y3, x4, y4));

	}

}
