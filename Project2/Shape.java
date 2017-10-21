import java.awt.*;

/**
 * Contains the interface for Shape
 * 
 * @author Zeph Nord
 * @version Project2
 * @version CPE102-5
 * @version Fall 2016
 */
public interface Shape {
	/**
	 * Calculates and returns the area of the object
	 * @return
	 */
	public abstract double getArea();
	
	/**
	 * Returns the Color of the object.
	 * @return
	 */
	public abstract Color getColor();
	
	/**
	 * Sets the Color of the object.
	 * @param color
	 */
	public abstract void setColor(Color color);
	
	/**
	 * Returns true if the object is filled with color, otherwise false.
	 * @return
	 */
	public abstract boolean getFilled();
	
	/**
	 * Sets the filled state of the object.
	 * @param filled
	 */
	public abstract void setFilled(boolean filled);
	
	/**
	 * Moves the shape by the x and y amounts specified in the Point.
	 * @param point
	 */
	public abstract void move(Point point);	
}
