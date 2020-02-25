package q2;

public class Test {
	public static void main(String[] args){
		Integer[] arr={5,6,3,8,1};
		ArrayTest<Integer> at= new ArrayTest<Integer>(arr);
		try{
			System.out.println("First="+at.first());
			System.out.println("Max="+at.max());
			at.printAll();
		}
		catch(Exception e){
			System.out.println("Error");
		}
	}
}
