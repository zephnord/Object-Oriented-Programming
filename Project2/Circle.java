import java.awt.Color;
import java.awt.Point;

/**
 * Contains the implementation of Circle class
 * 
 * @author Zeph Nord
 * @version Project2
 * @version CPE102-5
 * @version Fall 2016
 */
public class Circle implements Shape {
	private double radius;
	private Point position;
	private Color color;
	private boolean filled;

	/**
	 * Constructor for Circle
	 * @param radius
	 * @param position
	 * @param color
	 * @param filled
	 */
	public Circle(double radius, Point position, Color color, boolean filled) {
		this.radius = radius;
		this.position = position;
		this.color = color;
		this.filled = filled;
	}
	
	/**
	 * Returns the radius of the Circle object
	 * @return
	 */
	public double getRadius() {
		return radius;
	}
	
	/**
	 * Sets the radius of the Circle object
	 * @param radius
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	/**
	 * Returns the position of the Circle object
	 * @return
	 */
	public Point getPosition() {
		return position;
	}
	
	/**
	 * Override the equals-method (from Object) so that it returns 
	 * true for two Circle objects that are
	 * logically equivalent based on the state of all of their instance variables.
	 * @return
	 */
	public boolean equals(Circle circleTwo) {
		if (circleTwo == null)
			return false;
		
		return (this.radius == circleTwo.getRadius()
				&& this.filled == circleTwo.getFilled()
				&& this.color.equals(circleTwo.getColor())
				&& this.position.equals(circleTwo.getPosition()));
	}		

	@Override
	public double getArea() {
		return (Math.PI * Math.pow(this.radius, 2));
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
		position.x += point.x;	
		position.y += point.y;		
	}	
}
