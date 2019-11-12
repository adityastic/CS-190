package com.list.linked;

class LLinkedList{
	private LLNode head;

	public LLinkedList(){
		head=null;
	}

	public void insert(String s1,int a){     
		LLNode temp =new LLNode(s1,a);
		temp.next=head;
		head=temp;
	}

	public String youngest(){     
		int res=900;
		String name="BLANK";
		LLNode temp=head;
		while(temp!=null) {
			if (temp.readage()<res){
				name=temp.readname();
				res=temp.readage();
			}
			temp=temp.next;
		}
		return name  ; 
	}                                              

	public boolean search(String s1){     
		boolean res=false;
		LLNode temp=head;
		while(temp!=null) {
			if (temp.readname().equals(s1)){
				res=true;
			}
			temp=temp.next;
		}
		return res  ; 
	} 


	public int oldest(){    
		int res=0;
		LLNode temp=head;
		while(temp!=null) {
			if (temp.readage()>res)
				res=temp.readage();
			temp=temp.next;
		}
		return res; 
	}  

	public int count(String s1){     
		int res=0;
		LLNode temp=head;
		while(temp!=null) {
			if (temp.readname().equals(s1))
				res++;
			temp=temp.next;
		}
		return res; 
	}  

	public boolean allOlderThan(int a){    
		LLNode temp=head;
		while(temp!=null) {
			if (temp.readage() < a)
				return false;
			temp=temp.next;
		}
		return true; 
	} 

	public void insert_last(String s1,int a){    
		if(head == null)
			insert(s1,a);
		else {
			LLNode temp=head;
			LLNode node =new LLNode(s1,a);
			while(temp.next != null) {
				temp=temp.next;
			}  
			temp.next=node;
		}
	}

	public String delete_first(){         
		if (head==null)return null;
		String res=head.readname();
		head = head.next;
		return res;
	}

	public String printlist(){
		LLNode temp=head;
		String list ="HEAD->";
		while(temp!=null) {
			list +=temp.print();
			temp=temp.next;}

		list+="NULL";  
		return list; 

	}

	public int addAllAges() {
		int res=0;
		LLNode temp=head;
		while(temp!=null) {
			res+=temp.readage();
			temp=temp.next;
		}
		return res; 
	}

	public int countOlder(int a) {
		int cnt=0;
		LLNode temp=head;
		while(temp!=null) {
			cnt++;
			if(cnt == a)
				return cnt;
			temp=temp.next;
		}
		return 0; 
	}
}


