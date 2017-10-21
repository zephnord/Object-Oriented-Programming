import java.awt.Color;
import java.awt.Point;

/**
 * Contains the Tester Class for Shapes 
 * 
 * @author Zeph Nord
 * @version Project2
 * @version CPE102-5
 * @version Fall 2016
 */
public class Driver {
	public static void main(String[] args) {
		
//----------------------------------Circle Test Cases------------------------------------
		System.out.println();
		System.out.println(" --------------------Circle Tests--------------------------");
		
		Point c1 = new Point(0, 0);
		Point c2 = new Point(3, 5);
		Point c3 = new Point(3, 5);

		Circle circleOne = new Circle(3, c1, Color.BLUE, true);
		Circle circleTwo = new Circle(4, c2, Color.RED, false);
		
		System.out.println(circleOne.getPosition() + " ACTUAL: (0, 0)");
		System.out.println(circleOne.getRadius() + " ACTUAL 3");
		System.out.println(circleOne.getArea() + " ACTUAL: 28.27");
		System.out.println(circleOne.getColor() + " ACTUAL: BLUE");
		System.out.println(circleOne.getFilled() + " ACTUAL: TRUE");		
		System.out.println(circleOne.equals(circleTwo) + " ACTUAL: FALSE");
		
		circleOne.setColor(Color.RED);
		circleOne.setFilled(false);
		circleOne.setRadius(4);
		circleOne.move(c3);
		
		System.out.println(circleTwo.getPosition() + " ACTUAL: (3, 5)");
		System.out.println(circleTwo.getRadius() + " ACTUAL 4");
		System.out.println(circleTwo.getArea() + " ACTUAL: 50.26");
		System.out.println(circleTwo.getColor() + " ACTUAL: RED");
		System.out.println(circleTwo.getFilled() + " ACTUAL: false");		
		System.out.println(circleTwo.equals(circleOne) + " ACTUAL: TRUE");	

//-------------------------------Rectangle Test Cases-------------------------------------
		System.out.println();
		System.out.println("----------------------Rectangle Tests-----------------------");
		
		Point r1 = new Point(0, 0);
		Point r2 = new Point(3, 5);
		Point r3 = new Point(3, 5);
		
		Rectangle rectangleOne = new Rectangle(10, 10, r1, Color.RED, true);
		Rectangle rectangleTwo = new Rectangle(10, 5, r2, Color.BLACK, false);
		
		System.out.println(rectangleOne.getWidth() + " ACTUAL: 10");
		System.out.println(rectangleOne.getHeight() + " ACTUAL: 10");
		System.out.println(rectangleOne.getArea() + " ACTUAL: 100");
		System.out.println(rectangleOne.getColor() + " ACTUAL: RED");
		System.out.println(rectangleOne.getFilled() + " ACTUAL: TRUE");
		System.out.println(rectangleOne.getPosition() + "ACTUAL: (0, 0)");
		System.out.println(rectangleOne.equals(rectangleTwo) + " ACTUAL: FALSE");
		
		rectangleOne.move(r3);
		rectangleOne.setColor(Color.BLACK);
		rectangleOne.setFilled(false);
		rectangleOne.setHeight(5);
		rectangleOne.setWidth(10);		
		
		System.out.println(rectangleTwo.getWidth() + " ACTUAL: 10");
		System.out.println(rectangleTwo.getHeight() + " ACTUAL: 5");
		System.out.println(rectangleTwo.getArea() + " ACTUAL: 50");
		System.out.println(rectangleTwo.getColor() + " ACTUAL: BLACK");
		System.out.println(rectangleTwo.getFilled() + " ACTUAL: FALSE");
		System.out.println(rectangleTwo.getPosition() + "ACTUAL: (3, 5)");
		System.out.println(rectangleTwo.equals(rectangleOne) + " ACTUAL: TRUE");		
		
//---------------------------Triangle Test Cases------------------------------------------
		System.out.println();
		System.out.println("---------------------Triangle Tests-------------------------");
		
		Point t1 = new Point(0, 0);
		Point t2 = new Point(1, 2);
		Point t3 = new Point(3, 4);
		
		Point t4 = new Point(1, 1);
		Point t5 = new Point(3, 5);
		Point t6 = new Point(2, 1);
		
		Point t7 = new Point(1, -1);
		Point t8 = new Point(3, 5);
		Point t9 = new Point(2, 1);
		
		Point t10 = new Point(0, 0);
		Point t11 = new Point(2, 4);
		Point t12 = new Point(1, 0);
		Point t13 = new Point(1, 1);
		
		Point t14 = new Point(0, 0);
		Point t15 = new Point(1, 2);
		Point t16 = new Point(3, 4);
		
		
		Triangle triangleOne = new Triangle(t1, t2, t3, Color.GREEN, true);
		Triangle triangleTwo = new Triangle(t4, t5, t6, Color.BLACK, false);
		
		System.out.println(triangleOne.getVertexA() + " ACTUAL: (0, 0)");
		System.out.println(triangleOne.getVertexB() + " ACTUAL: (1, 2)");
		System.out.println(triangleOne.getVertexC() + " ACTUAL: (3, 4)");
		System.out.println(triangleOne.getArea() + " ACTUAL: 1");
		System.out.println(triangleOne.getColor() + " ACTUAL: GREEN");
		System.out.println(triangleOne.getFilled() + " ACTUAL: TRUE");
		System.out.println(triangleOne.equals(triangleTwo) + " ACTUAL: FALSE");
		
		triangleOne.setVertexA(t15);
		triangleOne.setVertexB(t14);
		triangleOne.setVertexC(t15);
		
		System.out.println(triangleOne.getVertexA() + " ACTUAL: (1, 2)");
		System.out.println(triangleOne.getVertexB() + " ACTUAL: (0, 0)");
		System.out.println(triangleOne.getVertexC() + " ACTUAL: (1, 2)");
		System.out.println(triangleOne.getArea() + " ACTUAL: 0");	
		
		triangleOne.setVertexA(t10);
		triangleOne.setVertexB(t11);
		triangleOne.setVertexC(t12);
		triangleOne.move(t13);
		triangleOne.setColor(Color.BLACK);
		triangleOne.setFilled(false);
		
		System.out.println(triangleTwo.getVertexA() + " ACTUAL: (1, 1)");
		System.out.println(triangleTwo.getVertexB() + " ACTUAL: (3, 5)");
		System.out.println(triangleTwo.getVertexC() + " ACTUAL: (2, 1)");
		System.out.println(triangleTwo.getArea() + " ACTUAL: 2");
		System.out.println(triangleTwo.getColor() + " ACTUAL: BLACK");
		System.out.println(triangleTwo.getFilled() + " ACTUAL: FALSE");
		System.out.println(triangleTwo.equals(triangleTwo) + " ACTUAL: TRUE");		
		
//-----------------------------ConvexPolygon Test Cases------------------------------------------
				
		System.out.println("-------------------ConvexPolygon Tests---------------------");
		System.out.println();
		Point p1 = new Point (5, 1);
		Point p2 = new Point (2, 5);
		Point p3 = new Point (-4, 3);
		
		Point p4 = new Point (0, 0);		
		Point p5 = new Point (1, 1);
		Point p6 = new Point (2, 8);
		
		Point p7 = new Point (-2, 4);
		
		Point p8 = new Point (2, 2);
		Point p9 = new Point (-1, 1);
		Point p10 = new Point (2, 3);
		Point p11 = new Point (2, -4);
		
		Point p12 = new Point (-1, -1);		
		Point p13 = new Point (0, 0);
		Point p14 = new Point (1, 7);
		
		Point p15 = new Point(1, 1);
		
		Point vertices[] = new Point[3];
		vertices[0] = p1;
		vertices[1] = p2;
		vertices[2] = p3;
		
		Point verticesTwo[] = new Point[3];
		verticesTwo[0] = p4;
		verticesTwo[1] = p5;
		verticesTwo[2] = p6;
		
		ConvexPolygon polyOne = new ConvexPolygon(vertices, Color.BLUE, true);
		ConvexPolygon polyTwo = new ConvexPolygon(verticesTwo, Color.RED, false);
		
		System.out.println(polyOne.getArea() + " ACTUAL: 15");
		System.out.println(polyOne.getVertex(0) + " ACTUAL: (5, 1)");		
		System.out.println(polyOne.getVertex(1) + " ACTUAL: (2, 5)");
		System.out.println(polyOne.getVertex(2) + " ACTUAL: (-4, 3)");
		System.out.println(polyOne.getColor() + " ACTUAL: BLUE");
		System.out.println(polyOne.getFilled() + " ACTUAL: TRUE");		
		System.out.println(polyOne.equals(polyTwo) + " ACTUAL: FALSE");
		
		polyOne.setVertex(1, p8);
		polyOne.setColor(Color.RED);
		polyOne.setFilled(false);
		polyOne.move(p9);
		
		System.out.println(polyOne.getArea() + " ACTUAL: 1.5");
		System.out.println(polyOne.getVertex(0) + " ACTUAL: (4, 2)");		
		System.out.println(polyOne.getVertex(1) + " ACTUAL: (1, 3)");
		System.out.println(polyOne.getVertex(2) + " ACTUAL: (-5, 4)");
		System.out.println(polyOne.getColor() + " ACTUAL: RED");
		System.out.println(polyOne.getFilled() + " ACTUAL: FALSE");		
		System.out.println(polyOne.equals(polyTwo) + " ACTUAL: FALSE");
		
		polyOne.setVertex(0, p12);
		polyOne.setVertex(1, p13);
		polyOne.setVertex(2, p14);
		polyOne.move(p15);
		
		System.out.println(polyOne.getArea() + " ACTUAL: 3.0");
		System.out.println(polyOne.equals(polyTwo) + " ACTUAL: TRUE");		
		
//-----------------------------WorksSpace Test Cases------------------------------------------	
		System.out.println();
		System.out.println("-------------------WorkSpace Tests-------------------------");		
		
		WorkSpace workspace = new WorkSpace();	
		
		workspace.add(circleOne);
		workspace.add(circleTwo);
		workspace.add(triangleOne);
		workspace.add(triangleTwo);
		workspace.add(rectangleOne);
		workspace.add(rectangleTwo);
		workspace.add(polyOne);
		workspace.add(polyTwo);
		
		System.out.println(workspace.getAreaOfAllShapes() + " ACTUAL: 208.52");
		System.out.println(workspace.size() + " ACTUAL: 8");
		System.out.println(workspace.getShapesByColor(Color.RED).get(0).getColor() + " ACTUAL: RED");
		System.out.println(workspace.getCircles().get(0).getClass() + " ACTUAL: Circle");
		System.out.println(workspace.getTriangles().get(0).getClass() + " ACTUAL: Triangle");
		System.out.println(workspace.getRectangles().get(0).getClass() + " ACTUAL: Rectangle");
		System.out.println(workspace.getConvexPolygons().get(0).getClass() + " ACTUAL: ConvexPolygon");
		
		workspace.remove(0);
		System.out.println(workspace.size() + " ACTUAL: 7");		
		System.out.println(workspace.get(1).getClass() + " ACTUAL: Triangle");
	}
}
