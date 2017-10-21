/**
 * Contains the Animal class 
 * 
 * @author Zeph Nord
 * @version Lab6
 * @version CPE102-5
 * @version Fall 2016
 */

public class Animal {
	private int legs;
	
	/**
	 * Constructor the object Animal
	 * @param legs
	 */
	public Animal(int legs) {
		this.legs = legs;
	}
	
	/**
	 * Overrides the equals method inherited from object
	 * @param other
	 * @return
	 */
	public boolean equals(Animal other) {
		if(!(other.getClass().equals(this.getClass())) || 
				this.legs != other.legs ||
				other.equals(null)) 
			return false;
		else
			return true;
	}
	
	/**
	 * Overrides the toString method inherited from object
	 * @param other
	 * @return
	 */
	public String toString() {
		return "I am an Animal object with " + legs + " legs";
	}
}
