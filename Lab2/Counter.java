/**
 * A simple integer counter.
 *
 * @author Zeph Nord
 * @version Lab 02
 * @version CPE102-5
 * @version Fall 2016
 */

public class Counter {
	// instance variables
	private int count; // current count
	private int modulusValue;
	private int tempCount;
	private boolean resetIsTrue = false;

	/**
	 * Default constructor: Create a new Counter, with the count initialized to
	 * 0.
	 */
	public Counter(){
		count = 0;
		modulusValue = 10;
	}

	/**
	 * Overloaded constructor to specify modulusValue.
	 */
	public Counter(int setModulus) {
		count = 0;
		modulusValue = setModulus;
	}

	/**
	 * The number of items counted.
	 */
	public int currentCount() {
		return count;
	}

	/**
	 * Increment the count by 1.
	 */
	public void incrementCount() {
		if (count == modulusValue - 1) {
			count = 0;
		} else {
			count++;
		}
	}

	/**
	 * Reset the count to 0.
	 */
	public void reset() {
		resetIsTrue = true;
		tempCount = count;
		count = 0;
	}
	
	/**
	 * Set the count to last value before reset.
	 */
	public void unReset() {
		if (resetIsTrue == true){
			count = tempCount;
		}
	}

	/**
	 * Return the modulusValue set in the constructor.
	 */
	public int modulusValue() {
		return modulusValue;
	}
}