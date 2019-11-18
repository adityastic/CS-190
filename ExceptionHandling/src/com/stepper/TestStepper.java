package com.stepper;

import java.util.Scanner;


public class TestStepper {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stepper c1 = new Stepper(10);

		Scanner sc = new Scanner(System.in);
		int choice = 1;
		while(choice!=4)
			{

                // insert **try {**  here



			System.out.println();
			System.out.println("1.Increment");
			System.out.println("2.Decrement");
			System.out.println("3.Read Value");
			System.out.println("4.Exit");

			System.out.print("Please enter a value-->");
			
			choice =sc.nextInt();
		        System.out.println("");
			if(choice==1)
			{
				c1.stepUp();
				int res=c1.readValue();
				System.out.println("Value = "+res);
			}
			else if(choice==2)
			{
//				boolean res1=c1.stepDown();
//				if (res1==true) {int res=c1.readValue();
//				                 System.out.println("Value = "+res);}
//				else            System.out.println("Too Low");
			}
			else if(choice==3)
			{
				int res=c1.readValue();
				System.out.println("Value = "+res);
			}



		//**  }
		//**   catch(Exception e){
		//**	System.out.println("Too Low");

		//**  }




			}  // end while

	}

}
