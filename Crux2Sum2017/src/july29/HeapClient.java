package july29;

public class HeapClient {

	public static void main(String[] args) {

		int[] arr = {30,60,10,70,100,150,25,80,67};
		
		Heap h = new Heap(true, arr);
		
//		Heap h= new Heap(true);
//		h.add(100);
//		h.add(50);
//		h.add(30);
//		h.add(150);
//		h.add(300);
//		h.add(10);
//		h.add(400);
//	
		
	h.display();
	System.out.println(h.getHP());
	System.out.println(h.removeHP());
	System.out.println(h.getHP());
//	while(h.size()!=0){
//	System.out.println(h.removeHP());
//	}
	
//	System.out.println(h.removeHP());
//	
	h.display();
	}

}
