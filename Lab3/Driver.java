import java.util.*;

/**
 * Contains the Greeter class that contains methods to
 * greet a user
 * 
 * @author Zeph Nord
 * @version Lab03
 * @version CPE102-5
 * @version Fall 2016
 */
public class Driver {
	public static void main(String[] args) {
		
		// Declare and construct a Scanner object
		String greeting;
		String name;
		Greeter greeter;
		Scanner in = new Scanner(System.in);
		
		// Prompt for a name
		System.out.print("What is your name? ");
		
		// Read the name using the Scanner
		name = in.nextLine();
		
		// Construct a Greeter object
		greeter = new Greeter(name);
		
		// Get the greeting and save it to a String
		greeting = greeter.greet();
		
		// Display the greeting to the command-line
		System.out.println(greeting);
		
		// Now do it again using the default constructor
		System.out.println("Greet someone you can't remember...");
		greeter = new Greeter();
		greeting = greeter.greet();
		System.out.println(greeting);
		
		in.close();
	}
}
