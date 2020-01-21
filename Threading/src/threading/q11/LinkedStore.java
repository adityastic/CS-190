package threading.q11;

class LinkedStore{
	private int arr[]=new int[4];;
	private int count;
	private int nextin;
	private int nextout;

	public  LinkedStore(){ 

		for(int i=0;i<4;i++)
			arr[i]=0;
		count=0;
		nextin=0;
		nextout=0;
	}

	public  void insert(int val) throws Exception{

		arr[nextin]=val;
		nextin=nextin+1;
		count++;
		if (nextin>3) nextin=0;
	}

	public  int delete()  throws Exception{
		int res=arr[nextout];
		nextout++;
		if (nextout>3) nextout=0;
		count--;
		return res;
	}
}