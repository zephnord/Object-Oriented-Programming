/**
 * Contains methods to perform operations on polar coordinate points
 * 
 * @author Zeph Nord
 * @version Project 1
 * @version CPE102-5
 * @version Fall 2016
 */

public class PolarPoint implements Point {
	double polarRadius; // Radius of the point to be created
	double polarAngle; // Angle of the point to be created

	/**
	 * Constructor for PolarPoint that creates a new polar point using a radius
	 * and angle.
	 * 
	 * @param radius - the radius of the polar point
	 * @param angle - the angle of the polar point
	 */
	public PolarPoint(double radius, double angle) {
		polarRadius = radius;
		polarAngle = angle;
	}

	/**
	 * Calculates the xCoordinate using r*cos(theta)
	 * 
	 * @return the xCoordinate of the point in radians
	 */
	public double xCoordinate() {
		return (polarRadius * Math.cos(polarAngle));
	}

	/**
	 * Calculates the yCoordinate using r*sin(theta)
	 *
	 * @return the yCoordinate of the point in radians
	 */
	public double yCoordinate() {
		return (polarRadius * Math.sin(polarAngle));
	}

	/**
	 * @return polarRadius
	 */
	public double radius() {
		return polarRadius;
	}

	/**
	 * @return polarAngle
	 */
	public double angle() {
		return polarAngle;
	}

	/**
	 * @param other - A polar point object
	 */
	public double distanceFrom(Point other) {
		return (Math.sqrt(
				Math.pow(other.xCoordinate() - xCoordinate(), 2) + Math.pow(other.yCoordinate() - yCoordinate(), 2)));
	}

	/**
	 * Rotates 9the current point by 90 degrees
	 * 
	 * @return this - A polar point object
	 */
	public Point rotate90() {
		this.polarAngle += (Math.PI / 2);
		return this;
	}
}