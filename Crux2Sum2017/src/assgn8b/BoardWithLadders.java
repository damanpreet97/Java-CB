package assgn8b;

import java.util.ArrayList;

public class BoardWithLadders {

	public static void main(String[] args) {
		ArrayList<String> ans = getBoardPaths(0, 10);
//		int ans = whatprime(13);
//		int ans= primefromlast(6, 20);
//		int b=(int)Math.sqrt(11);
		System.out.println(ans.size());
	}

	public static ArrayList<String> getBoardPaths(int curr, int end) {
		if (curr == end) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		ArrayList<String> mr = new ArrayList<>();
		for (int i = 1; i <= 6; i++) {
			if (curr + i <= end) {
				boolean b =isprime(curr+i);
				if(b){
				int t = whatprime(curr + i);
					int x = primefromlast(t, end);
					if(x>curr+i){
					ArrayList<String> rr = getBoardPaths(x, end);
					for (String rs : rr) {
						mr.add(x + rs);
					}
				}
					else{
						ArrayList<String> rr = getBoardPaths(curr + i, end);
						for (String rs : rr) {
							mr.add(i + rs);
						}	
					}
				} else {
					ArrayList<String> rr = getBoardPaths(curr + i, end);
					for (String rs : rr) {
						mr.add(i + rs);
					}
				}
			} else
				break;
		}
		return mr;
	}

	public static boolean isprime(int a){
		if(a==1){
			return false;
		}
			for(int j=2;j<=(int)Math.sqrt(a);j++){
				if(a%j==0){
					return false;
				}
			}
			return true;
	}
		
	
	public static int whatprime(int a) {
		int count = 0;
		int i=0,j=0;
		for (i = 2; i <= a; i++) {
			if (i == 2 || i == 3) {
				count++;
			 continue;
			}
			for (j = 2; j <= (int)Math.sqrt(i); j++) {
				if (i % j == 0) {
					break;
				}
				}
			if (j > (int)Math.sqrt(i)) {
				count++;
			}
		}
		return count;
	}

	public static int primefromlast(int y, int end) {
		int count = 0;
		for (int i = end; i >= 2; i--) {
			if (i == 2 || i == 3) {
				count++;
			}
			for (int j = 2; j <= (int)Math.sqrt(i); j++) {
				if (i % j == 0) {
					break;
				}
				if(j==(int)Math.sqrt(i)){
					count++;
				}
			}
			if (count == y) {
				return i;
			}
		}
		return 0;
	}
}
