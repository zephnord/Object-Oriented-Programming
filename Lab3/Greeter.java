/**
 * Contains the Greeter class that contains methods to
 * greet a user
 * 
 * @author Zeph Nord
 * @version Lab03
 * @version CPE102-5
 * @version Fall 2016
 */
public class Greeter {
	
	private String name; //name to be used
	
	/**
	 * Default contructor to initialize name to null
	 */
	public Greeter (){
		name = null;
	}
	
	/**
	 * Overloaded contructor to initialize name to user's input
	 * 
	 * @param inName
	 */
	public Greeter (String inName){
		this.name = inName;
	}
	
	/**
	 * Method to greet the user based on their name if known,
	 * or standard greeting if no name is known.
	 */
	public String greet (){
		if (name == null){
			return "Hey you!";
		}
		else{
			return ("Hello " + name);
		}
	}
}