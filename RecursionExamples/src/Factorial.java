import java.util.*;

public class Factorial {
	
	static HashMap<Integer, Integer> results = new HashMap<Integer, Integer>();
	
	static int factorial(int number) {
		if(results.containsKey(number))
			return results.get(number);
		
		if(number == 0)
			return 1;
		
		results.put(number, number * factorial(number-1));
		return results.get(number);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Value:");
		int number =sc.nextInt();

		System.out.println("Fac= "+ factorial(number));
		sc.close();
	}
}
