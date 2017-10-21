
public class PointDriver {
	public static void main (String[] args){
		
		Point p1 = new CartesianPoint(5.0, 6.0);
		Point p2 = new CartesianPoint(4.0, 7.0);
		
		//Cartesian x and y test
		System.out.println("p1 xCoordinate: " + p1.xCoordinate() + " ; " + "Should be: 5.0");
		System.out.println("p1 yCoordinate: " + p1.yCoordinate() + " ; " + "Should be: 6.0");
		
		System.out.println("p2 yCoordinate: " + p2.xCoordinate() + " ; " + "Should be: 4.0");
		System.out.println("p2 yCoordinate: " + p2.yCoordinate() + " ; " + "Should be: 7.0");
		
		//Cartesian radius test
		System.out.println("p1 radius: " + p1.radius() + " ; " + "Should be: 7.81");
		System.out.println("p2 radius: " + p2.radius() + " ; " + "Should be: 8.06");
		
		//Cartesian angle test
		System.out.println("p1 angle: " + p1.angle() + " ; " + "Should be: 0.876");
		System.out.println("p2 angle: " + p2.angle() + " ; " + "Should be: 1.051");
		
		//Cartesian distanceFrom test
		System.out.println("Distance of p1 from p2: " + p1.distanceFrom(p2) + " ; " + "Should be: 1.414");
		System.out.println("Distance of p2 from p1: " + p2.distanceFrom(p1) + " ; " + "Should be: 1.414");
		
		//Cartesian rotate90 test
		p1.rotate90();
		System.out.println("p1 new xCoordinate: " + p1.xCoordinate() + " ; " + "Should be: (-6.0)");
		System.out.println("p1 new yCoordinate: " + p1.yCoordinate() + " ; " + "Should be: (5.0)");
		
		p2.rotate90();
		System.out.println("p2 new xCoordinate: " + p2.xCoordinate() + " ; " + "Should be: (-7.0)");
		System.out.println("p2 new yCoordinate: " + p2.yCoordinate() + " ; " + "Should be: (4.0)");
		
		//PolarPoint Tests
		//---------------------------------------------------------------------------------------------------
		Point p3 = new PolarPoint(10.0, Math.PI/2);
		Point p4 = new PolarPoint(5.0, Math.PI/3);
		Point p5 = new PolarPoint(0.0, 0.0);
		
		//Cartesian x and y test
		System.out.println("p3 xCoordinate: " + p3.xCoordinate() + " ; " + "Should be: 0.0");
		System.out.println("p3 yCoordinate: " + p3.yCoordinate() + " ; " + "Should be: 10.0");
		
		System.out.println("p4 yCoordinate: " + p4.xCoordinate() + " ; " + "Should be: 2.5");
		System.out.println("p4 yCoordinate: " + p4.yCoordinate() + " ; " + "Should be: 4.33");
		
		//Cartesian radius test
		System.out.println("p3 radius: " + p3.radius() + " ; " + "Should be: 10.0");
		System.out.println("p4 radius: " + p4.radius() + " ; " + "Should be: 5.0");
		
		//Cartesian angle test
		System.out.println("p3 angle: " + p3.angle() + " ; " + "Should be: 1.57");
		System.out.println("p4 angle: " + p4.angle() + " ; " + "Should be: 1.047");
		
		//Cartesian distanceFrom test
		System.out.println("Distance of p3 from (0,1): " + p3.distanceFrom(p5) + " ; " + "Should be: 10.0");
		System.out.println("Distance of p4 from (0,1): " + p4.distanceFrom(p5) + " ; " + "Should be: 5.0");
		
		//Cartesian rotate90 test
		p3.rotate90();
		System.out.println("New angle: " + p3.angle());
		System.out.println("p3 new xCoordinate: " + p3.xCoordinate() + " ; " + "Should be: (-10.0)");
		System.out.println("p3 new yCoordinate: " + p3.yCoordinate() + " ; " + "Should be: (0)");
		
		p4.rotate90();
		System.out.println("p4 new xCoordinate: " + p4.xCoordinate() + " ; " + "Should be: (-4.33)");
		System.out.println("p4 new yCoordinate: " + p4.yCoordinate() + " ; " + "Should be: (2.5)");
	}
}
