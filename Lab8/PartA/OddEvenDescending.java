import java.util.Comparator;

/**
 * Contains the OddEvenDescending class that implements the Comparator<Integer>
 * interface so that it results in Integers being orders so that all odds come
 * before all evens and within odds or evens the values are descending.
 * 
 * @author Zeph Nord
 * @version CPE102
 * @version Fall 2016
 * @version Lab8
 */
public class OddEvenDescending implements Comparator<Integer> {

	public OddEvenDescending() {
	}

	@Override
	/**
	 * Compares Integer values to sort list into odd-even-descending order
	 */
	public int compare(Integer o1, Integer o2) {
		if (o1 % 2 == 0 && o2 % 2 != 0)
			return 1;
		else if (o1 % 2 != 0 && o2 % 2 == 0)
			return -1;
		else if (o1 % 2 == 0 && o2 % 2 == 0) {
			if (o1 < o2)
				return 1;
			else if (o1 > o2)
				return -1;
			else
				return 0;
		}

		else {
			if (o1 < o2)
				return 1;
			else if (o1 > o2)
				return -1;
			else
				return 0;
		}
	}
}
