package aug6;

public class hmClient {

	public static void main(String[] args) throws Exception {
		// GenericLinkedList<String> gll = new GenericLinkedList<>();
		// gll.addLast("Sattvik");
		// gll.addFirst("Daman");
		// gll.addLast("Real");
		// gll.addLast("End");
		// gll.display();

		Hashmap<String, Integer> hm = new Hashmap<>();
		hm.put("India", 120);
		hm.put("China", 1500);
		hm.put("Pak", 80);
		hm.put("US", 25);
		hm.put("UK", 25);
		hm.put("Nigeria", 50);

		hm.display();
		hm.put("India", 125);
		
		hm.put("Uganda", 15);
		hm.put("Ruganda", 10);
		hm.display();

		hm.put("South Africa", 30);
		hm.display();
		
	
	}

}
