package q1;

class Client{

	public static void main(String[] args){
		
		Counter<Integer> c = new Counter<Integer>(2);
		System.out.println("Res=" + c.readValue());
		
		c.updateValue(4);
		System.out.println ("Res=" + c.readValue());
	}
}
