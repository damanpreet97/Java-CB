package july31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class GenericHeapClient {

	public static void main(String[] args) {

		// Car[] cars = new Car[5];
		// cars[0] = new Car("Audi", 100, 1000);
		// cars[1] = new Car("BMW", 200, 1500);
		// cars[2] = new Car("Porsche", 150, 800);
		// cars[3] = new Car("Mercedes", 140, 900);
		// cars[4] = new Car("Lamorghini", 160, 1400);
		//
		// GenericHeap<Car> hp = new GenericHeap<>(Car.pricerevctor);
		//
		// for (Car car : cars) {
		// hp.add(car);
		// }
		// hp.display();
		//
		// while (hp.size() != 0) {
		// System.out.println(hp.removeHP());
		// }

		// ArrayList<Integer> zero = new ArrayList<>(Arrays.asList(10, 15, 20,
		// 25));
		// ArrayList<Integer> one = new ArrayList<>(Arrays.asList(9, 18, 24,
		// 27));
		// ArrayList<Integer> two = new ArrayList<>(Arrays.asList(5, 7, 28,
		// 40));
		// ArrayList<Integer> three = new ArrayList<>(Arrays.asList(17, 19, 21,
		// 28));
		// ArrayList<ArrayList<Integer>> lists = new
		// ArrayList<>(Arrays.asList(zero, one, two, three));
		// System.out.println(mergeKlists(lists));

		ArrayList<Integer> zero = new ArrayList<>(Arrays.asList(10, 15, 20, 25, 80, 3, 12, 1, 78));
		System.out.println(getKLargestElements(zero, 3));

	}

	public static ArrayList<Integer> mergeKlists(ArrayList<ArrayList<Integer>> lists) {
		ArrayList<Integer> mr = new ArrayList<>();

		GenericHeap<Pair> heap = new GenericHeap<>(Pair.comparator);

		for (int i = 0; i < lists.size(); i++) {
			Pair p = new Pair();
			p.lno = i;
			p.ino = 0;
			p.data = lists.get(i).get(0);
			heap.add(p);
		}

		while (!heap.isEmpty()) {
			Pair top = heap.removeHP();
			mr.add(top.data);
			if (top.ino != lists.get(top.lno).size() - 1) {
				top.ino += 1;
				top.data = lists.get(top.lno).get(top.ino);
				heap.add(top);
			}
		}
		return mr;
	}

	private static class Pair {
		int data;
		int lno;
		int ino;

		public static final elementComparator comparator = new elementComparator();

		private static class elementComparator implements Comparator<Pair> {

			@Override
			public int compare(Pair arg0, Pair arg1) {
				return arg1.data - arg0.data;
			}
		}

	}

	public static ArrayList<Integer> getKLargestElements(ArrayList<Integer> list, int k) {

		GenericHeap<Integer> heap = new GenericHeap<>(comparator);
		ArrayList<Integer> mr = new ArrayList<>();
		for (int i = 0; i < k; i++) {
			heap.add(list.get(i));
		}

		for (int i = k; i < list.size(); i++) {
			if (list.get(i) > heap.getHP()) {
				heap.removeHP();
				heap.add(list.get(i));
			}
		}

		for (int i = 0; i < k; i++) {
			mr.add(heap.removeHP());
		}

		return mr;
	}

	public static Compare comparator = new Compare();

	private static class Compare implements Comparator<Integer> {

		@Override
		public int compare(Integer arg0, Integer arg1) {
			return arg1 - arg0;
		}

	}
}
