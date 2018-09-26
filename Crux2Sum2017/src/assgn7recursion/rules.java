package assgn7recursion;

public class rules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean chkrule(String s1,int vidx){
		if(vidx==s1.length()){
			return true;
		}
		if(vidx>s1.length()){
			return false;
		}
		if (s1.charAt(0)=='a'){
		if(s1.charAt(vidx)=='a'){
			if(s1.charAt(vidx+1)=='a'){
				return chkrule(s1,vidx+1);
			}
			else if(s1.charAt(vidx+1)=='b'&& s1.charAt(vidx+2)=='b'){
				
			}
		}
		else if(s1.substring(vidx, vidx+2).equals("bb")){
			if
			return chkrule(s1,vidx+1);
		}
	}
	    else return false;
}
}
