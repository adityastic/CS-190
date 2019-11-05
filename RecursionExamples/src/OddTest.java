import java.util.Scanner;
public class OddTest {

	public static int oddDigits(int value){
		if(value < 10)
			return (value % 2 == 1)? 1 : 0 ;
		return (((value%10) % 2 == 1)? 1 : 0) + oddDigits(value/10);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Value:");
		int number =sc.nextInt();

		System.out.println("Res= "+ oddDigits(number));
		sc.close();
	}
}
