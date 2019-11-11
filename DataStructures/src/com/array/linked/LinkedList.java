package com.array.linked;

class MyArrayList{
	private Node[] head;
	private int max;
	private int count;

	public MyArrayList(int max) {
		this.max = max;
		this.count = 0;
		this.head=new Node[max];
	}

	public  boolean insert(String s1,int a){     
		if (count<max){
			Node temp =new Node(s1,a);
			head[count]=temp;
			count++;
			return true;
		}
		else  
			return false;
	}	

	public  String youngest(){    
		int res= Integer.MAX_VALUE;
		String name="BLANK";
		for(int i=0;i<count;i++){
			Node temp=head[i];
			if (temp.readage()<res){
				name=temp.readname();
				res=temp.readage();
			}
		}
		return name; 
	}                                              

	public boolean search(String s1){ 
		boolean res=false;
		for(int i=0;i<count;i++){
			Node temp=head[i];
			if (temp.readname().equals(s1))
				res=true;
		}
		return res; 
	}    

	public int oldest(){     
		int oldest=Integer.MIN_VALUE;
		for(int i=0;i<count;i++){
			Node temp=head[i];
			if (temp.readage()>oldest)
				oldest = temp.readage();
		}
		return oldest; 
	}                 


	public  int count(String s1){  
		int cnt=0;
		for(int i=0;i<count;i++) {
			Node temp=head[i];
			if(temp.readname().equals(s1))
				cnt++;
		}
		return cnt; 
	}  


	public  boolean allOlderThan(int a){    
		for(int i=0;i<count;i++){
			Node temp=head[i];
			if(temp.readage() < a)
				return false;
		}
		return true; 
	} 

	public int totalAge() {
		int sum=0;
		for(int i=0;i<count;i++) {
			Node temp=head[i];
			sum += temp.readage();;
		}
		return sum; 
	}           
	
	public String printlist(){
		Node temp;
		System.out.println("\nList:");
		String list ="HEAD->";
		for(int i=0;i<count;i++) {
			temp = head[i];
			list +=temp.print();
		}
		list+="NULL";  
		return list;
	}
}

