package expert;


public class Node {
	int data;
	Node nextNode;

	public Node(int data) {
		this.data = data;
	}

	public static void printList(Node head) {
		while (head != null) {
			System.out.print(head.data + "->");
			head = head.nextNode;
		}
		System.out.println();
	}
}
