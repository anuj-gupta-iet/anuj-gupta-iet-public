package expert;

/*Multiply two linked lists represented by numbers. 
 * Only one linked list must be used to do all 
 * additions and store the result 
 * i.e., intermediate additions should not be done with 
 * extra linked lists and finally computing the result.*/
public class MultiplyTwoNumbersRepresentedByLinkedList {
	public static void main(String[] args) {
		Node head1 = new Node(5);
		head1.nextNode = new Node(4);
		head1.nextNode.nextNode = new Node(3);
		head1.nextNode.nextNode.nextNode = new Node(2);

		Node.printList(head1);

		Node head2 = new Node(8);
		head2.nextNode = new Node(7);
		head2.nextNode.nextNode = new Node(6);

		Node.printList(head2);

		Node result = multiply(head1, head2);
	}

	private static Node multiply(Node head1, Node head2) {
		Node head;
		Node curr;
		int carry;
		for (int i = 1; head1 != null; i++) {
			int result = head2.data * head1.data;
			int multiply = result % 10;
			carry = result / 10;
			curr = new Node(multiply);
			if (i == 1) {
				head = curr;
			}
		}
		return null;
	}
}
