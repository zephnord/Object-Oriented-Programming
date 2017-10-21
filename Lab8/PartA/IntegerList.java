import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

/**
 * Contains the IntegerList class for initializing a specified number randomly
 * generated Integer objects.
 * 
 * @author Zeph Nord
 * @version CPE102
 * @version Fall 2016
 * @version Lab8
 */
public class IntegerList {

	// instance variables
	ArrayList<Integer> IntegerList; // the list of Integer objects
	int numInts; // the number of Integer objects in the list
	int maxVal; // the maximum value of random Integers in the list (exclusive)
	Random random;
	int seed;

	/**
	 * Constructor to specify number of Integer objects the list should contain
	 * and the maximum value (exclusive) to use when generating random numbers
	 * to populate the list with.
	 * 
	 * @param numInts
	 *            the number of Integer objects the list should contain
	 * @param maxVal
	 *            the maximum value (exclusive) of randomly generated numbers
	 */
	public IntegerList(int numInts, int maxVal) {
		this.numInts = numInts;
		this.maxVal = maxVal;
		IntegerList = new ArrayList<Integer>();
		random = new Random();
		// initialize and fill list with random ints (ArrayList wrapper deals
		// with Integer)
		for (int i = 0; i < numInts; i++) {
			IntegerList.add(random.nextInt(maxVal));
		}
	}

	/**
	 * Constructor to specify number of Integer objects the list should contain
	 * and the maximum value (exclusive) to use when generating random numbers
	 * along with a specified seed for testing. to populate the list with.
	 * 
	 * @param numInts
	 *            the number of Integer objects the list should contain
	 * @param maxVal
	 *            the maximum value (exclusive) of randomly generated numbers
	 * @param seed
	 *            the value to use for seeing random numbers
	 */
	public IntegerList(int numInts, int maxVal, int seed) {
		this.numInts = numInts;
		this.maxVal = maxVal;
		IntegerList = new ArrayList<Integer>();
		random = new Random(seed);
		// initialize and fill list with random ints (ArrayList wrapper deals
		// with Integer)
		for (int i = 0; i < numInts; i++) {
			IntegerList.add(random.nextInt(maxVal));
		}
	}

	/**
	 * Sorts the list of Integer objects using the appropriate method from
	 * Arrays or Collections class
	 */
	public void sort() {
		Collections.sort(IntegerList);
	}

	/**
	 * Overloaded sort method that sorts the list of Integer objects according
	 * to the specified Comparator and using the appropriate method from the
	 * Arrays or Collections class
	 * 
	 * @param comparator
	 *            the specified Comparator to sort with
	 */
	public void sort(Comparator<Integer> comparator) {
		if(comparator.getClass().getName().equals("Descending"))
			Collections.sort(IntegerList, new Descending());
		else if(comparator.getClass().getName().equals("OddEvenDescending"))
			Collections.sort(IntegerList, new OddEvenDescending());
		else if(comparator.getClass().getName().equals("OddEvenAscending"))
			Collections.sort(IntegerList, new OddEvenAscending());
	}

	/**
	 * Method to check if the lists is in the natural order specified by the
	 * compareTo method of the Integer class
	 * 
	 * @return true if the list is in the specified order, otherwise false
	 */
	public boolean isSorted() {
		for (int i = 0; i < numInts - 1; i++) {
			if (IntegerList.get(i + 1) < IntegerList.get(i))
				return false;
		}
		return true;
	}

	/**
	 * Overloaded isSorted method to check if the list is in order specified by
	 * the provided Comparator
	 * 
	 * @param comparator
	 *            the specified Comparator to check if list is sorted
	 * @return true if the list is in the specified order, otherwise false
	 */
	public boolean isSorted(Comparator<Integer> comparator) {
		ArrayList<Integer> IntegerListCopy = new ArrayList<Integer>(); //make a copy of the Integer object list
		for(int i = 0; i < numInts; i++) {
			IntegerListCopy.add(IntegerList.get(i));
		}
		Collections.sort(IntegerListCopy, comparator); //sort the copied list to comparator
		for(int i = 0; i < numInts; i++) {
			if(IntegerList.get(i) != IntegerListCopy.get(i))
				return false;
		}
		return true;	
	}

	/**
	 * Overrides the toString method inherited from Object to return a String
	 * containing each Integer value on its own line. If the list is empty the
	 * method should return an empty String.
	 */
	public String toString() {
		String list = "";
		for (int i = 0; i < numInts; i++) {
			list += IntegerList.get(i) + "\n";
		}
		return list;
	}

	/**
	 * Method that takes an int value representing an index and returns the
	 * Integer at that index.
	 * 
	 * @param index
	 *            the index to return the value of
	 * @return the Integer value at the specified index
	 */
	public Integer get(int index) {
		return IntegerList.get(index);
	}
}
