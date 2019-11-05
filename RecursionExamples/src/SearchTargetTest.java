import java.util.Scanner;
public class SearchTargetTest {

	public static boolean searchTarget(int value,int target){
		if(value%10 == target)
			return true;
		if(value < 10)
			return false;
		return searchTarget((value/10), target);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Value:");
		int number =sc.nextInt();
		System.out.print("Enter Target:");
		int target =sc.nextInt();
		System.out.println("Res= "+ searchTarget(number,target));
		sc.close();
	}
}
