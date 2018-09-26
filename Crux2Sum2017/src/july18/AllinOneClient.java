package july18;
//
//import july17.DynamicQueue;
//import july17.queue;

public class AllinOneClient {
//
	public static void main(String[] args) throws Exception {
////		QueueUsingLinkedList q1= new QueueUsingLinkedList();
////		q1.enqueue(10);
////		q1.enqueue(20);
////		q1.enqueue(30);
////		q1.enqueue(40);
////		System.out.println(q1.dequeue());
//////		System.out.println(q1.dequeue());
//////		System.out.println(q1.dequeue());
//////		System.out.println(q1.dequeue());
//////		System.err.println(q1.dequeue());
//////		q1.dequeue();
//////		q1.dequeue();
//////		q1.dequeue();
////		System.out.println(q1.size());
//////		System.out.println(s1.isEmpty());
//////		q1.enqueue(50);
//////		q1.enqueue(60);
//////		q1.enqueue(70);
//////		q1.enqueue(80);
////		q1.display();
//		SULL s1 = new SULL();
//		s1.push(10);
//		s1.push(20);
//		s1.push(30);
//		s1.push(40);
////		s1.pop();
////		s1.pop();
////		s1.pop();
////		s1.pop();
////		System.out.println(s1.isEmpty());
//		s1.push(50);
////		s1.enqueue(60);
////		s1.enqueue(70);
////		s1.enqueue(80);
//		s1.display();
	QueueUsing2Stacks q2= new QueueUsing2Stacks();
	
	q2.enqueue(10);
	q2.enqueue(20);
	q2.enqueue(30);
	q2.enqueue(40);
	q2.enqueue(50);
	q2.display();
	System.out.println(q2.dequeue());
	System.out.println(q2.size());
	q2.display();
	q2.enqueue(60);
	q2.display();
	System.out.println(q2.size());
	System.out.println(q2.front());
	}

}
