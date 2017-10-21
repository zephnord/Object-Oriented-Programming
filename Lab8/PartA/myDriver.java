
public class myDriver {

	public myDriver() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		IntegerList myList = new IntegerList(10, 15);
		myList.sort();
		myList.sort(new Descending());
		myList.sort(new OddEvenDescending());
		myList.sort(new OddEvenAscending());
		myList.sort(new OddEvenDescending());
		
		
		System.out.println(myList.toString());
		//System.out.println(myList.get(1));
		
	}
}
