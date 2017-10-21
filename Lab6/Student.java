/**
 * Contains the Student class that extends Person class
 * 
 * @author Zeph Nord
 * @version Lab6
 * @version CPE102-5
 * @version Fall 2016
 */

public class Student extends Person {
	private double GPA;

	/**
	 * Constructor for the Student object
	 * Calls the superclass Person
	 * which calls its superclass Animal
	 * @param GPA
	 * @param name
	 * @param legs
	 */
	public Student(double GPA, String name, int legs) {
		super(name, legs);
		this.GPA = GPA;		
	}
	
	/**
	 * Overrides the equals method inherited from Person
	 * inherited from Animal inherited from Object
	 * @param other
	 * @return
	 */
	public boolean equals(Student other) {
		if(super.equals(other) &&
				this.GPA == other.GPA)
			return true;
		else
			return false;
	}		
	
	/**
	 * Overrides the toString method inherited from Person
	 * inherited from Animal inherited from Object
	 */
	public String toString() {
		return super.toString() 
				+ " and a Student object with a " + GPA + " GPA";
	}
}
