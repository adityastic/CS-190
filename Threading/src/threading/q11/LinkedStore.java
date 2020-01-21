package threading.q11;

class LinkedStore{
	private int arr[]=new int[4];;
	private int count;
	private int nextin;
	private int nextout;

	public LinkedStore(){ 

		for(int i=0;i<4;i++)
			arr[i]=0;
		count=0;
		nextin=0;
		nextout=0;
	}

	public synchronized void insert(int val) throws Exception{
		while(count == 4) wait();
		arr[nextin]=val;
		nextin=nextin+1;
		count++;
		if (nextin>3) 
			nextin=0;
		notify();
	}

	public synchronized int delete()  throws Exception{
		while(count == 0) wait();
		int res=arr[nextout];
		nextout++;
		if (nextout>3) 
			nextout=0;
		count--;
		notify();
		return res;
	}
}