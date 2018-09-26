package june12;

import java.util.Scanner;

public class arrlinear {
	public static Scanner scn= new Scanner(System.in);

	public static void main(String[] args) {
		int arr[]= takeInput();
		//	System.out.println("Enter the nmber to be searched");
			int item=scn.nextInt();
	        				System.out.println(linearsrch(arr,item));
		}
	        				
		public static int linearsrch(int[] arr,int item){
			for(int i=0;i<arr.length;i++){
				if (arr[i]==item){
				return i;
				}
			}
			return -1;
	}
	public static int[] takeInput(){
		//System.out.println("Enter the size of the array");
		int n = scn.nextInt();
		int rv[]=new int[n];
		for(int i=0;i<rv.length;i++){
			//System.out.println("enter the value for "+i+"th element");
		rv[i]=scn.nextInt();
		}
	return rv;
	}	
	}
