package july5;

public class countmazepath {

	public static void main(String[] args) {
		int n = cmp(0,0,5,5, new int[6][6]);
		System.out.println(n);
	}
  public static int cmp(int cr, int cc, int er,int ec, int arr[][]){
	  if(cc==ec&&cr==er){
		  return 1;
	  }
	  if(cc>ec||cr>er){
		  return 0;
	  }
	  int count=0;
	  if(arr[cr][cc]!=0){
		  return arr[cr][cc];
	  }
	  int cv=cmp(cr+1,cc,er,ec,arr);
	  int ch=cmp(cr,cc+1,er,ec,arr);
	  
	  count=ch+cv;
	  arr[cr][cc]=count;
	  return count;
  }
}
