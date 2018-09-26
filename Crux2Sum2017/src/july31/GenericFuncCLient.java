package july31;

public class GenericFuncCLient {

	public static void main(String[] args) {

		Car[] cars= new Car[5];
		cars[0] = new Car("Audi", 100,1000);
		cars[1] = new Car("BMW", 200,1500);
		cars[2] = new Car("Porsche", 150,800);
		cars[3] = new Car("Mercedes", 140,900);
		cars[4] = new Car("Lamorghini", 160,1400);
		
		display(cars);
		BubbleSort(cars);
		System.out.println(".............................");
		display(cars);
	}

	public static <T> void display(T[] arr){
		for(T var: arr){
			System.out.println(var);
		}
	}
	
//	public static <T extends Comparable<T>> void BubbleSort (T[] arr) {
//		int count= 0;
//		while(count<arr.length-1){
//			for(int i = 0; i<arr.length-1-count;i++){
//				if(arr[i].compareTo(arr[i+1]) > 0){
//					T temp= arr[i];
//					arr[i]= arr[i+1];
//					arr[i+1]=temp;
//				}
//			}
//			count++;
//		}
//	}

	public static <T extends Comparable<T>> void BubbleSort (T[] arr) {
		int count= 0;
		while(count<arr.length-1){
			for(int i = 0; i<arr.length-1-count;i++){
				if(arr[i].compareTo(arr[i+1]) > 0){
					T temp= arr[i];
					arr[i]= arr[i+1];
					arr[i+1]=temp;
				}
			}
			count++;
		}
	}

}
