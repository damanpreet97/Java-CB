package july17;

public class queueClient {

	public static void main(String[] args) throws Exception {
		queue s1 = new DynamicQueue();
		s1.enqueue(10);
		s1.enqueue(20);
		s1.enqueue(30);
		s1.enqueue(40);
//		s1.dequeue();
//		s1.dequeue();
//		s1.dequeue();
//		s1.dequeue();
//		System.out.println(s1.isEmpty());
		s1.enqueue(50);
		s1.enqueue(60);
		s1.enqueue(70);
		s1.enqueue(80);
//		s1.display();
		s1.reverseQueue();
	s1.display();
	}

}
