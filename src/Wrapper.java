
public class Wrapper {

	public static void main(String[] args) {

		// primitive dt
		int x = 5;
		int r = 7;

		// wrapper
		Integer m = new Integer(5); // boxing or wrapper
		Integer z = r; // auto-boxing

		// unwrapping
		int y = m.intValue(); // manual unwrapping
		int n = m; // auto unboxing or unwrapping

		// printing boxed values
		System.out.println("M is " + m);
		System.out.println("Z is " + z);

		// printing unboxed values
		System.out.println("Y is " + y);
		System.out.println("N is " + n);

	}

}
