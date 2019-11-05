import java.util.Scanner;

public class NoOddTest {
	
	public static boolean allOdds(int value) {

		if(value%2==1)
			return false;
		if(value<10) 
			return (value%2==0);
	
		return allOdds(value/10);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Value:");
		int number =sc.nextInt();

		System.out.println("Max= "+ allOdds(number));
		sc.close();
	}
}
