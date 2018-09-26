package aug6;

import java.util.ArrayList;

public class Hashmap<K, V> {

	private class HMNode {
		K key;
		V value;
	}
	
	private GenericLinkedList<HMNode>[] buckets; // N
	private int size = 0; // n

	public Hashmap() {
		buckets = new GenericLinkedList[4];
		for (int i = 0; i < buckets.length; i++) {
			buckets[i] = new GenericLinkedList<HMNode>();
		}
		size = 0;
	}

	public void put(K key, V value) throws Exception {
		int bi = hashfunction(key);
		int foundAt = findInBucket(buckets[bi], key);

		if (foundAt == -1) {
			HMNode node = new HMNode();
			node.key = key;
			node.value = value;
			buckets[bi].addLast(node);
			this.size++;
		} else {
			HMNode node = buckets[bi].getAt(foundAt);
			node.value = value;
		}
		
		double lambda = (this.size * 1.0)/this.buckets.length;
		if(lambda>2.0){
			rehash();
		}
	}

	private void rehash() throws Exception {
		GenericLinkedList<HMNode>[] old = buckets;
	
		buckets = new GenericLinkedList[2* old.length]; 
		for (int i = 0; i < buckets.length; i++) {
			buckets[i] = new GenericLinkedList<HMNode>();
		}
		size = 0;
		
		for (int i = 0; i < old.length; i++) {
			for (int j = 0; j < old[i].size; j++) {
				HMNode node = old[i].getAt(j);
				this.put(node.key, node.value);
			}
		}
	}

	public V get(K key) throws Exception {
		int bi = hashfunction(key);
		int foundAt = findInBucket(buckets[bi], key);

		if (foundAt == -1) {
			return null;
		} else {
			HMNode node = buckets[bi].getAt(foundAt);
			return node.value;
		}
	}

	public V remove(K key) throws Exception {
		int bi = hashfunction(key);
		int foundAt = findInBucket(buckets[bi], key);

		if (foundAt == -1) {
			return null;
		} else {
			HMNode node = buckets[bi].removeAt(foundAt);
			this.size--;
			return node.value;
		}
	}

	public boolean containsKey(K key) throws Exception {
		int bi = hashfunction(key);
		int foundAt = findInBucket(buckets[bi], key);

		if (foundAt == -1) {
			return false;
		} else {
			return true;
		}
	}

	public ArrayList<K> keySet() throws Exception {
		ArrayList<K> list = new ArrayList<>();
		for (int i = 0; i < buckets.length; i++) {
			for (int j = 0; j < buckets[i].size; j++) {
				HMNode node = buckets[i].getAt(j);
				list.add(node.key);
			}
		}
		return list;
	}

	public void display() throws Exception {
		System.out.println(".......................");
		for (int i = 0; i < buckets.length; i++) {
			String str = "BUCKET " + i + " => ";
			for (int j = 0; j < buckets[i].size; j++) {
				HMNode node = buckets[i].getAt(j);
				str += "[ " + node.key + " @ " + node.value + " ]";
			}
			System.out.println(str);
		}
		System.out.println(".......................");
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	private int hashfunction(K key) {
		int bi = key.hashCode();
		bi = Math.abs(bi);
		bi = bi % buckets.length;

		return bi;
	}

	private int findInBucket(GenericLinkedList<HMNode> list, K key) throws Exception {

		for (int i = 0; i < list.size(); i++) {
			HMNode node = list.getAt(i);
			if (node.key.equals(key)) {
				return i;
			}
		}
		return -1;
	}

}
