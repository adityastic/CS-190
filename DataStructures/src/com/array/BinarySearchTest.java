package com.array;

import java.util.Scanner;

public class BinarySearchTest  {

	public static boolean search(int[] list, int target){

		int left = 0, right = list.length - 1;	

		while(left <= right) {

			int mid = (left + right) / 2;

			if(list[mid] == target) {
				return true;
			}else if(list[mid] >= target) {
				right = mid - 1; 
			}else {
				left = mid + 1;
			}
		}
		return false;
	}

	public static void main(String[] args)
	{		
		Scanner sc = new Scanner(System.in);
		int[] list={1,3,5,6,7,9,11,17};

		System.out.print("Enter Target:");
		int target =sc.nextInt();
		boolean res=search(list,target);
		System.out.println("Target Found: "+res);
	}
}
