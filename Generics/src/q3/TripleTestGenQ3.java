package q3;

public class TripleTestGenQ3 {
	public static void main(String [] args){

		Triple<Integer> t = new Triple<Integer>(8,10,7);
		System.out.println("Original Value1="+t.readValue1());
		System.out.println("Adding 3 Values="+t.addValues());
		System.out.println("Largest= "+t.largest());
		t.setValue1(13);
		System.out.println("Largest= "+t.largest());
	}
}
