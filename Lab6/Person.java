/**
 * Contains the Person class that extends Animal class
 * 
 * @author Zeph Nord
 * @version Lab6
 * @version CPE102-5
 * @version Fall 2016
 */

public class Person extends Animal {
	private String name;
	
	/**
	 * Constructor for Person object
	 * Calls super class Animal to initialize legs
	 * @param name
	 * @param legs
	 */
	public Person(String name, int legs) {
		super(legs);
		this.name = name;		
	}
	
	/**
	 * Overrides the equals method inherited from Animal
	 * inherited from Object
	 * @param other
	 * @return
	 */
	public boolean equals(Person other) {
		if(super.equals(other) &&
				this.name.equals(other.name))
			return true;
		else
			return false;
	}		
	
	/**
	 * Overrides the toString method inherited from Animal
	 * inherited from Object
	 */
	public String toString() {
		return super.toString() 
				+ " and a Person object whose name is "
				+ this.name;
	}
}
