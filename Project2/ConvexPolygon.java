import java.awt.Color;
import java.awt.Point;

/**
 * Contains the implementation of ConvexPolygon class
 * 
 * @author Zeph Nord
 * @version Project2
 * @version CPE102-5
 * @version Fall 2016
 */
public class ConvexPolygon implements Shape {
	private Point[] vertices;
	private Color color;
	private boolean filled;

	/**
	 * Constructor for ConvexPolygon Object.
	 * @param vertices -- Specified in counterclockwise order. First/last point is same element
	 * @param color
	 * @param filled
	 */
	public ConvexPolygon(Point[] vertices, Color color, boolean filled) {
		this.vertices = new Point[vertices.length];
		this.vertices = vertices;
		this.color = color;
		this.filled = filled;
	}
	
	/**
	 * Returns the specified vertex
	 * @param index
	 * @return
	 */
	public Point getVertex(int index) {
		if (index >= 0 && index < this.vertices.length) {
			return vertices[index];
		}
		else{
			System.out.println("index out of range");
			return null;
		}
	}
	
	/**
	 * Sets the specified vertex of the polygon
	 * @param index
	 * @param point
	 */
	public void setVertex(int index, Point point) {
		this.vertices[index] = point;
	}
	
	/**
	 * Overridden method to compare two ConvexPolygon objects 
	 * @return
	 */
	public boolean equals(ConvexPolygon convexPolygonTwo) {		
		if (convexPolygonTwo == null)
			return false;
		
		boolean equal = false;
		
		if (this.vertices.length != convexPolygonTwo.vertices.length) {
			return false;
		}
		
		equal = (this.getColor().equals(convexPolygonTwo.getColor())
				&& this.getFilled() == convexPolygonTwo.getFilled());
		
		for (int i = 0; i < convexPolygonTwo.vertices.length; i++) {
			if (!this.getVertex(i).equals(convexPolygonTwo.getVertex(i))) {
				equal = false;
			}
		}
		return equal;				
	}
	
	@Override
	public double getArea() {
		double area = 0;
		for (int i = 0; i < vertices.length - 1; i++) {
			area += (vertices[i].getX() * vertices[i + 1].getY())
						- (vertices[i + 1].getX() * vertices[i].getY());
		}
		area += (vertices[vertices.length - 1].getX() * vertices[0].getY())
					- (vertices[vertices.length - 1].getY() * vertices[0].getX());
		area = area / 2;
		return area;
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
		for (int i = 0; i < vertices.length; i++) {
			vertices[i].x += point.x;
			vertices[i].y += point.y;
		}		
	}
}
