import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);	
			
		System.out.print("Enter a modulus value: ");
		int modulusValue = in.nextInt();		
		
		Counter ct = new Counter(modulusValue);
		
		ct.reset();
		System.out.println("Count after reset: " + ct.currentCount());	
		
		for (int i = 1; i < 10; i++){	
			ct.incrementCount();
			System.out.println(ct.currentCount());			
		}	
		
		ct.reset();
		System.out.println("Count after reset: " + ct.currentCount());
		
		ct.unReset();
		System.out.println("Count after unreset: " + ct.currentCount()); //unreset should have value of 1
		
		in.close();
	}
}
