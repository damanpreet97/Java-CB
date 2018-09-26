package july12;

public class stackClient {

	public static void main(String[] args) throws Exception {
		stack s1= new DynamicStack();
		s1.push(10);
		s1.push(15);
		s1.push(20);
//		boolean b= s1.isEmpty();
//		System.out.println(b);
//		s1.display();
//		s1.pop();
//		boolean c= s1.isEmpty();
//		System.out.println(c);
	   
//	stack s2 =new DynamicStack();
		reversestack(s1);
		s1.display();
//		int sp[]= {10,16,20,17,18,25,19};
//	   for(int i=0;i<sp.length;i++){
//		   s1.push(sp[i]);
//	   }
//	   for(int i=0;i<sp.length;i++){
//		   int prev=;
//		   int rv=s1.pop();
//		   if(rv)
//		   
//	}
//public static int span(int[] arr, int i){
//	int count=0;
//	for(int j=0;j<i;j++){
//		if(arr[j]<=arr[i]){
//			count++;
//		}
//		else break;
//	}
	
}
	public static void reversestack(stack s) throws Exception{
		if(s.size()==0){
			return;
		}
		int rv= s.pop();
		reversestack(s);
		s.push(rv);
	}
}
