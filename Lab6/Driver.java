
public class Driver {
	public static void main(String[] args) {
		Animal me = new Student(3.5, "Zeph", 2);
		Animal dog = new Animal(4);
		Animal friend = new Person("Friend", 2);
		Animal student = new Student(2.0, "Rival", 2);
		
		//System.out.println(me.equals(dog));
		System.out.println(me.toString());
		//System.out.println(dog.equals(me));
		System.out.println(dog.toString());
		System.out.println(friend.toString());
		System.out.println(student.toString());
		System.out.println(dog.equals(me));		
	}
}
