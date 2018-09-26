package june19;

public class maximumfrequency {

	public static void main(String[] args) {
		String s="aaabccdeffff";
		System.out.println(maxfreq(s));
	}
public static char maxfreq(String s){
	StringBuilder sb= new StringBuilder();
	int count=1,max=0,pos=0;
	char c='\0';
	int[] arr= new int[26];
	for(int i=0;i<s.length();i++){
	arr[s.charAt(i)-'a']++;
	}
	for(int i=0;i<arr.length;i++){
		if (max<arr[i]){
			max=arr[i];
		   pos=i;
		}
		c= (char)(pos+'a');
	}
	return c;
}
}
