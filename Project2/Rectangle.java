import java.awt.Color;
import java.awt.Point;

/**
 * Contains the implementation of Rectangle class
 * 
 * @author Zeph Nord
 * @version Project2
 * @version CPE102-5
 * @version Fall 2016
 */
public class Rectangle implements Shape {
	private double width;
	private double height;
	private Point position;
	private Color color;
	private boolean filled;
	
	/**
	 * Constructor for Rectangle Object
	 * @param a
	 * @param b
	 * @param c
	 * @param color
	 * @param filled
	 */
	public Rectangle(double width, double height, Point position, Color color, boolean filled) {
		this.width = width;
		this.height = height;
		this.position = position;
		this.color = color;
		this.filled = filled;
	}
	
	/**
	 * Returns the width of the Rectangle Object
	 * @return
	 */
	public double getWidth() {
		return width;
	}
	
	/**
	 * Sets the width of the Rectangle object.
	 * @param width
	 */
	public void setWidth(double width) {
		this.width = width;
	}
	
	/**
	 * Returns the height of the Rectangle Object
	 * @return
	 */
	public double getHeight() {
		return height;
	}
	
	/**
	 * Sets the height of the Rectangle Object
	 * @return
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	
	/**
	 * Returns the position of the Rectangle Object
	 * Position represent lower left corner of rectangle
	 * @return
	 */
	public Point getPosition() {
		return position;
	}
	
	/**
	 * Overridden equals method to compare two Rectangle Objects
	 * @return
	 */
	public boolean equals(Rectangle rectangleTwo) {
		if (rectangleTwo == null)
			return false;
		
		return (this.width == rectangleTwo.getWidth()
				&& this.height == rectangleTwo.getHeight()
				&& this.filled == rectangleTwo.getFilled()
				&& this.color.equals(rectangleTwo.getColor())
				&& this.position.equals(rectangleTwo.getPosition()));
	}	
	

	@Override
	public double getArea() {
		return (this.width * this.height);
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
