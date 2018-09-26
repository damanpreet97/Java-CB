package june21recursion;

import java.util.Scanner;

public class arrayofindx {

//	public static Scanner scn = new Scanner(System.in);
//
//	public static void main(String[] args) {
//		int[] arr = { 55, 11,66, 33, 66, 44,33,64 };
//		int item=scn.nextInt();
//		int[] newarr=allindices(arr,0,item,0);
//		for (int val:newarr){
//			System.out.println(val);
//		}
//}
//	public static int[] allindices(int[] arr, int vidx,int data, int csf){
//
//				if(vidx==arr.length){
//					return new int[csf];
//				}
//				int[] rr= null;
//		if(arr[vidx]==data){
//			rr= allindices(arr, vidx + 1,data,csf+1);
//			rr[csf]=vidx;
//		}
//	else {
//		rr= allindices(arr, vidx + 1,data,csf);
//	}
//		return rr;
//	}
	   public static Scanner scn = new Scanner(System.in);
	    public static void main(String args[]) {
	        int arr[]= takeInput();
	        int item=scn.nextInt();
	    int[] newarr=allIndices(arr,item,0,0);
			for (int val:newarr){
				System.out.println(val+" ");
			}
	    }
	    	public static int[] takeInput(){
			//System.out.println("Enter the size of the array");
			int n = scn.nextInt();
			int rv[]=new int[n];
			for(int i=0;i<rv.length;i++){
			//	System.out.println("enter the value for "+i+"th element");
			rv[i]=scn.nextInt();
			}
		return rv;
		}	
	public static int[] allIndices(int[] arr, int num, int si, int count){
	    if (si==arr.length){
	        return new int[count];
	    }
	    int rr[]= null;
	    if(arr[si]==num){
	        rr=allIndices(arr,num,si+1,count+1);
	        rr[count]=si;
	    }
	    else{
	        rr=allIndices(arr,num,si+1,count);
	    }
	    return rr;
	}
	}

