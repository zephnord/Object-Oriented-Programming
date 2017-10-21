import java.util.Comparator;

/**
 * Contains the Descending class that implements the Comparator<Integer>
 * interface so that it results in Integers being ordered in the descending
 * order.
 * 
 * @author Zeph Nord
 * @version CPE102
 * @version Fall 2016
 * @version Lab8
 */
public class Descending implements Comparator<Integer> {
	public Descending() {
	}

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2 - o1;
	}
}
