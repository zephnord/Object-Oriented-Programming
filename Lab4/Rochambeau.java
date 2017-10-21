/**
 * Contains the Rochambeau class that returns the winner
 * 
 * @author Zeph Nord
 * @version Lab04
 * @version CPE102-5
 * @version Fall 2016
 */
public class Rochambeau {
	//Instance variables, never change
	public static final int ROCK = 0;
	public static final int PAPER = 1;
	public static final int SCISSORS = 2;
	
	//empty constructor
	public Rochambeau() {		
	}
	
	/**
	 * Determines the winner based on two throws
	 * 
	 * @param throw1 -- The throw of the first player
	 * @param throw2 -- The throw of the second player
	 * 
	 */
	public static int getWinner(int throw1, int throw2) {
		if (throw1 == 0 && throw2 == 1)
			return -1;
		else if (throw1 == 1 && throw2 == 2)
			return -1;
		else if (throw1 == 2 && throw2 == 0)
			return -1;
		else if (throw1 == throw2)
			return 0;
		else
			return 1;
	}
}
