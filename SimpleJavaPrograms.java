import java.util.*;
public class SimpleJavaPrograms {
private static final int SENTINEL = 0;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int newNumber = 1;
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		System.out.println("Enter two integers, one per line. Enter 0 to signal the end of the list");
			while(newNumber != SENTINEL) {
				newNumber = input.nextInt();
				numbers.add(newNumber);
			}
			System.out.println("Highest value is: " + Collections.max(numbers));
			numbers.remove(Collections.max(numbers));
			System.out.println("Second Highest value is: " + Collections.max(numbers));
			input.close();
			System.exit(0);
	}
}