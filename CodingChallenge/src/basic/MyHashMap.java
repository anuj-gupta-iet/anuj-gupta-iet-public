package basic;


public class MyHashMap {

	private int size;
	private MyEntry[] array;

	public MyHashMap(int size) {
		this.array = new MyEntry[size];
		this.size = size;
	}

	public void put(Integer key, Integer value) {
		int index = key % size;
		System.out.println(index);
		MyEntry node = array[index];
		while (node != null && node.next != null) {
			node = node.next;
		}
		MyEntry newNode = new MyEntry();
		newNode.key = key;
		newNode.value = value;

		node.next = newNode;
	}

	public Integer get(Integer key) {
		int index = key% size;
		System.out.println(index);
		MyEntry node = array[index];
		while (node != null && node.next != null) {
			if(node.key.equals(key)){
				return node.value;
			}
		}
		return null;
	}

	public void remove(Integer key) {

	}

	class MyEntry {
		private Integer key;
		private Integer value;
		private MyEntry next;
	}
	
	public static void main(String[] args) {
		
	}
}
