package com.counter;

import java.util.Scanner;


public class TestCounter {

	public static void main(String[] args) {
		Counter c1 = new Counter(10);

		Scanner sc = new Scanner(System.in);
		int choice = 1;
		while(choice!=4)
		{
			try {
				System.out.println();
				System.out.println("1.Increment");
				System.out.println("2.Decrement");
				System.out.println("3.Read Value");
				System.out.println("4.Exit");

				System.out.print("Please enter a value-->");
				choice =sc.nextInt();

				if(choice==1)
				{
					c1.increment();
					int res=c1.read_value();
					System.out.println("Value = "+res);
				}
				else if(choice==2)
				{
					c1.decrement();
					int res=c1.read_value();
					System.out.println("Value = "+res);
				}
				else if(choice==3)
				{
					int res=c1.read_value();
					System.out.println("Value = "+res);
				}
			}catch(CounterException e) {
				e.printStackTrace();
			}
		}
	}
}
