import java.util.Scanner;
public class CountTargetTest {

	public static int countTarget(int value,int target){
		if(value < 10)
			return (value == target)? 1: 0;
		return ((value%10 == target)? 1: 0) +countTarget(value/10,target);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Value:");
		int number =sc.nextInt();
		System.out.print("Enter Target:");
		int target =sc.nextInt();
		System.out.println("Res= "+ countTarget(number,target));
		sc.close();
	}
}
