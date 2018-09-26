package june19;

public class subsetpalindromes {

	public static void main(String[] args) {
		String s = "aba";
		System.out.println(subspalindromes(s));
	}
		
		public static int subspalindromes(String s){
		 int count=0; String m="" ;
		 boolean b=true;
		 for(int i=0;i<s.length();i++){
				for (int j=i;j<s.length();j++){
					m=s.substring(i, j+1);
					System.out.println(m);
					b =june19.ispalindrome.palindrome(m);
//					for(int k=0;k<m.length()/2;k++){
//						 if (m.charAt(k)!=m.charAt(m.length()-k-1)){
//							 b=false;
//							 break;
//						 }
//					 }
					if (b){
						count+=1;
					}
				}
		 }		
		 return count;
	}
}