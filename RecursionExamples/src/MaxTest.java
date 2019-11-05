import java.util.Scanner;

public class MaxTest {

    public static int maxDigits(int value){
		if(value < 10)
			return value;
		return Math.max( value%10, maxDigits( value / 10 ) );
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Value:");
		int number =sc.nextInt();

		System.out.println("Max= "+ maxDigits(number));
		sc.close();
	}
}