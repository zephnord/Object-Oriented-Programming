import java.awt.*;
import java.util.ArrayList;

/**
 * Contains the implementation of WorkSpace class
 * 
 * @author Zeph Nord
 * @version Project2
 * @version CPE102-5
 * @version Fall 2016
 */

public class WorkSpace {
	private ArrayList<Shape> myShapes;
	
	/**
	 * Default Constructor for WorkSpace Object
	 */
	public WorkSpace() {
		myShapes = new ArrayList<Shape>();
	}
	
	/**
	 * Adds objects which implement the Shape interface to the end of the
	 * WorkSpace's ArrayList instance variable.
	 * @param shape
	 */
	public void add(Shape shape) {
		myShapes.add(shape);
	}
	
	/**
	 * Removes the Shape at the specified index and returns a reference to it
	 * or null if the index is out-of-bounds
	 * @param index
	 * @return
	 */
	public Shape remove(int index) {		
		if (myShapes.get(index) != null) 
			return myShapes.remove(index);
		else
			return null;
	}
	
	/**
	 * Return the ith Shape object from the WorkSpace
	 * @param index
	 * @return
	 */
	public Shape get(int index) {
		return myShapes.get(index);
	}
	
	/**
	 * Returns the number of Shapes contained by the WorkSpace
	 * @return
	 */
	public int size() {
		return myShapes.size();
	}
	
	/**
	 * Returns an ArrayList of all of the Circle objects contained in the WorkSpace
	 * @return
	 */
	public ArrayList<Circle> getCircles() {
		ArrayList<Circle> myCircles = new ArrayList<Circle>();
		
		for (int i = 0; i < myShapes.size(); i++) {
			if (myShapes.get(i) instanceof Circle)
				myCircles.add((Circle) myShapes.get(i));
		}
		return myCircles;
	}
	
	/**
	 * Returns an ArrayList of all of the Rectangle objects contained in the WorkSpace
	 * @return
	 */
	public ArrayList<Rectangle> getRectangles() {
		ArrayList<Rectangle> myRectangles = new ArrayList<Rectangle>();
		
		for (int i = 0; i < myShapes.size(); i++) {
			if (myShapes.get(i) instanceof Rectangle)
				myRectangles.add((Rectangle) myShapes.get(i));
		}
		return myRectangles;
	}
	
	/**
	 * Returns an ArrayList of all of the Triangle objects contained in the WorkSpace
	 * @return
	 */
	public ArrayList<Triangle> getTriangles() {
		ArrayList<Triangle> myTriangles = new ArrayList<Triangle>();
		
		for (int i = 0; i < myShapes.size(); i++) {
			if (myShapes.get(i) instanceof Triangle)
				myTriangles.add((Triangle) myShapes.get(i));
		}
		return myTriangles;
	}
	
	/**
	 * Returns an ArrayList of all of the ConvexPolygon objects contained in the WorkSpace
	 * @return
	 */
	public ArrayList<ConvexPolygon> getConvexPolygons() {
		ArrayList<ConvexPolygon> myConvexPolygons = new ArrayList<ConvexPolygon>();
		
		for (int i = 0; i < myShapes.size(); i++) {
			if (myShapes.get(i) instanceof ConvexPolygon)
				myConvexPolygons.add((ConvexPolygon) myShapes.get(i));
		}
		return myConvexPolygons;
	}
	
	/**
	 * Returns an ArrayList of all Shape objects in
 	 * the WorkSpace that match the specified Color
	 * @return
	 */
	public ArrayList<Shape> getShapesByColor(Color color) {
		ArrayList<Shape> shapesByColor = new ArrayList<Shape>();
		
		for (int i = 0; i < myShapes.size(); i++) { //might be able to use enhanced for loop
			if (myShapes.get(i).getColor() == color)
				shapesByColor.add(myShapes.get(i));
		}
		return shapesByColor;		
	}
	
	/**
	 * Returns the sum of the area of all Shape objects in the Workspace
	 * @return
	 */
	public double getAreaOfAllShapes() {
		double area = 0;
		
		for (int i = 0; i < myShapes.size(); i++) {
			area += myShapes.get(i).getArea();
		}
		return area;
	}
}
