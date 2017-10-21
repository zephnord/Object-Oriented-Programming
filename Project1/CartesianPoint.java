/**
 * Contains methods to perform operations on cartesian coordinate points
 * 
 * @author Zeph Nord
 * @version Project 1
 * @version CPE102-5
 * @version Fall 2016
 */

public class CartesianPoint implements Point {
    
    double xCoordinate; //x-Coordinate of the point
    double yCoordinate; //y-Coordinate of the point
    
    /**
     * Constructor for CartesianPoint that creates a new point using
     * and x-Coordinate and a y-Coordinate.
     * 
     * @param xCoord - the x-Coordinate of the point
     * @param yCoord - the y-Coordinate of the point
     */
    public CartesianPoint (double xCoord, double yCoord) {
        xCoordinate = xCoord;
        yCoordinate = yCoord;
    }
    
    /**'
     * @return xCoordinate - the x-Coordinate of the point
     */
    public double xCoordinate () {
    	return xCoordinate;
    }
    
    /**
     * @return yCoordinate - the y-Coordinate of the point
     */
    public double yCoordinate () {
    	return yCoordinate;
    }
    
    /**
     * @return the radius of the point from the origin
     */
    public double radius () {
    	return (Math.sqrt( Math.pow( xCoordinate(), 2) + Math.pow(yCoordinate(), 2)));    	
    }
    
    /**
     * @return the angle of the point from the origin
     */
    public double angle () {
    	return (Math.atan ( yCoordinate() / xCoordinate()));
    }
    
    /**
     * Calculates the distance between two points
     * 
     * @param other - A Point to compare a distance to
     * @return the distance from on point to another
     */
    public double distanceFrom (Point other) {
    	return (Math.sqrt(  Math.pow(other.xCoordinate() - xCoordinate(), 2)
    				+ Math.pow(other.yCoordinate() - yCoordinate(), 2)));
    }
    
    /**
     * Rotates a point by 90 degrees
     * 
     * @return a Point that has been rotated by 90 degrees
     */
    public Point rotate90 (){
    	double temp = xCoordinate;
    	this.xCoordinate = - yCoordinate;
    	this.yCoordinate = temp;
    	return this;
    }
}