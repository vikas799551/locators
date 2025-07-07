package firstproject;

public class Logicaloperators {

	public static void main(String[] args) {
		
		boolean a = true;
		boolean b = false;
		
		// AND &&
		if(a && b) {
			System.out.println("a && b is true");
		}
		else {
			System.out.println("a && b is false");
		}

		//OR ||
		if (a || b) {
			System.out.println("a || b is true");
		}
		else {
			System.out.println("a || b is false");
		}
		// NOT !
		if (!a) {
			System.out.println("a ! b is true");
		}
		else {
			System.out.println("a ! b is false");
		}
	}

}
