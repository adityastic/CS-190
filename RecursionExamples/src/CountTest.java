import java.util.Scanner;
public class CountTest {

	public static int countDigits(int value){
		if(value < 10)
			return value;
		return value%10 + countDigits(value/10);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Value:");
		int number =sc.nextInt();

		System.out.println("Res= "+ countDigits(number));
		sc.close();
	}
}
