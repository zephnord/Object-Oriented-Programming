import java.util.Random;

/**
 * Contains the RochambeauPlayer class that creates the 
 * competitors in the Rochambeau game.
 * 
 * @author Zeph Nord
 * @version Lab04
 * @version CPE102-5
 * @version Fall 2016
 */

public class RochambeauPlayer {
	private String name = "";
	private Random random;
	private int wins;
	private int throw1;
	
	public RochambeauPlayer(String name) {
		this.name = name;
		this.wins = 0;
		this.random = new Random();
		this.throw1 = 5;
	}
	
	public RochambeauPlayer(String name, int seed) {
		this.name = name;
		this.random = new Random(seed);
		this.wins = 0;
		this.throw1 = 5;
	}
	
	/**
	 * Query method to get the player's name
	 * @return name -- the name of the player
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Query method to get the player's total wins
	 * @return wins -- the amount of wins player has
	 */
	public int getWins() {
		return wins;
	}
	
	/**
	 * Increment the number of wins of the player
	 */
	public void incrementWins() {
		wins++;
	}
	
	/**
	 * Query method to get the last throw in String format
	 */
	public String lastThrow() {
		String lastThrow = "";
		if (throw1 == 0)
			lastThrow = "Rock";
		else if (throw1 == 1)
			lastThrow = "Paper";
		else if (throw1 == 2)
			lastThrow = "Scissors";		
		else
			lastThrow = "No Throw";
		
		return lastThrow;
	}
	
	/**
	 * Player decides randomly which throw to make
	 * @return throw1 -- The randomly generated throw
	 */
	public int makeThrow() {
		throw1 =  random.nextInt((Rochambeau.SCISSORS - Rochambeau.ROCK) + 1) + (Rochambeau.ROCK);
		lastThrow();
		return throw1;
	}
	
	/**
	 * Overloaded method of makeThrow()
	 * Instruct the player which throw to make 
	 * @param throwType -- The instructed throw to make
	 * @return throw1 -- The throw made
	 */
	public int makeThrow(int throwType) {
		throw1 = throwType;
		lastThrow();
		return throw1;
	}
	
	/**
	 * overloaded method to get player as a String
	 * @return player -- The object representation of player
	 */
	public String toString() {
		String player = name + " has " + wins + " wins.";
		return player;
	}
}
