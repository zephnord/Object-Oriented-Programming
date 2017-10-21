import java.awt.Color;
import java.awt.Point;

/**
 * Contains the implementation of Triangle class
 * 
 * @author Zeph Nord
 * @version Project2
 * @version CPE102-5
 * @version Fall 2016
 */
public class Triangle implements Shape{
	private Point a;
	private Point b;
	private Point c;
	private Color color;
	private boolean filled;
	/**
	 * Constructor for Triangle object
	 * @param a
	 * @param b
	 * @param c
	 * @param color
	 * @param filled
	 */
	public Triangle(Point a, Point b, Point c, Color color, boolean filled) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.color = color;
		this.filled = filled;
	}
	/**
	 * Returns a specific vertex of the triangle.
	 * @return
	 */
	public Point getVertexA() {
		return a;
	}
	
	/**
	 * Sets a specific vertex of the triangle.
	 * @param point
	 */
	public void setVertexA(Point point) {
		this.a.x = point.x;
		this.a.y = point.y;
	}
	
	/**
	 * Returns a specific vertex of the triangle.
	 * @return
	 */
	public Point getVertexB() {
		return b;
	}
	
	/**
	 * Sets a specific vertex of the triangle.
	 * @param point
	 */
	public void setVertexB(Point point) {
		this.b.x = point.x;
		this.b.y = point.y;
	}	
	
	/**
	 * Returns a specific vertex of the triangle.
	 * @return
	 */
	public Point getVertexC() {
		return c;
	}
	
	/**
	 * Sets a specific vertex of the triangle.
	 * @param point
	 */
	public void setVertexC(Point point) {
		this.c.x = point.x;
		this.c.y = point.y;
	}
	
	/**
	 * Overridden equals method
	 * @return
	 */
	public boolean equals(Triangle triangleTwo) {
		if (triangleTwo == null)
			return false;
		
		return (this.getVertexA().equals(triangleTwo.getVertexA())
				&& this.getVertexB().equals(triangleTwo.getVertexB())
				&& this.getVertexC().equals(triangleTwo.getVertexC())
				&& this.filled == triangleTwo.getFilled()
				&& this.color.equals(triangleTwo.getColor()));
	}

	@Override
	public double getArea() {
		double sideOne =  (Math.sqrt(Math.pow((b.getX() - a.getX()),2) 
				+ Math.pow((b.getY() - a.getY()),2)));
		double sideTwo =  (Math.sqrt(Math.pow((c.getX() - a.getX()),2) 
				+ Math.pow((c.getY() - a.getY()),2)));
		double sideThree =  (Math.sqrt(Math.pow((c.getX() - b.getX()),2) 
				+ Math.pow((c.getY() - b.getY()),2)));
		
		double semiPerimeter = (sideOne + sideTwo + sideThree) / 2;
		
		return (Math.sqrt(semiPerimeter * (semiPerimeter - sideOne)
				* (semiPerimeter - sideTwo) * (semiPerimeter - sideThree)));
	}

	@Override
	public Color getColor() {
		return this.color;
	}

	@Override
	public void setColor(Color color) {
		this.color = color;		
	}

	@Override
	public boolean getFilled() {
		return this.filled;
	}

	@Override
	public void setFilled(boolean filled) {
		this.filled = filled;		
	}

	@Override
	public void move(Point point) {
		this.a.x += point.x;
		this.a.y += point.y;
		
		this.b.x += point.x;
		this.b.y += point.y;

		this.c.x += point.x;
		this.c.y += point.y;
	}
}
