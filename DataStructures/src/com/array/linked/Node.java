package com.array.linked;

class Node{
	private String name;
	private int age; 

	public  Node(String nm,int a){
		name = new String(nm);
		age=a;
	}
	public  String readname()  {
		return name;
	}
	public  int readage()      {
		return age;
	}
	public String print(){
		return "["+name+":"+age+"]-->";
	}
}


