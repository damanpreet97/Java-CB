package june14;

public class spiraldisplay {

	public static void main(String[] args) {
		int[][] arr = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 },
				{ 51, 52, 53, 54 } };
		display(arr);
		System.out.println();
		spiraldisplay(arr);

	}

	public static void spiraldisplay(int[][] arr) {
		int tne = arr.length * arr[0].length;
		int rmin = 0, cmin = 0, rmax = arr.length-1, cmax = (arr[0].length)-1, count = 1, dirn = 0;
		int row=rmin, col=cmin;
		while (count <= tne) {
			System.out.print(arr[row][col]+"\t");
		count++;
		if (dirn==0){
			row++;
			if (row>=rmax){
				if (row>rmax){
					row=rmax;
					col++;
				}
				dirn++;
			}
		}
		else if(dirn==1){
			col++;
			if(col>=cmax){
				if(col>cmax){
					col=cmax;
					row--;
				}
				dirn++;
			}
		}
		else if(dirn==2){
			row--;
			if(row>=rmin){
				if(row>rmin){
					row=rmin;
					col--;
				}
				dirn++;
			}
		}
		else if(dirn==3) {
			col--;
			if (col==cmin){
				dirn=0;
				rmin++;
				cmin++;
				rmax--;
				cmax--;
				row=rmin;
				col=cmin;
			}
		 }
		}
	}
	public static void display(int[][] arr) {
		int row = 0, col = 0;
		for (row = 0; row < arr.length; row++) {
			for (col = 0; col < arr[0].length; col++) {
				System.out.print(arr[row][col] + "\t");
			}
			System.out.println();
		}
	}

}

