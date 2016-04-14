
public class MyLinkedList {
	private static Node next = null;
	private Node head = null;

	public MyLinkedList() {
		// head = new Node(null);
	}

	public static void main(String args[]) {
		MyLinkedList list = new MyLinkedList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.iterateAndPrint();
		list.ReverseAndPrint();

	}

	private void iterateAndPrint() {
		Node current = head;

		while (current.hasNext()) {
			System.out.println(current.toString());
			current = current.getNext();
		}
		System.out.println(current.toString());

	}	
	
	private void ReverseAndPrint() {
		Node current = head;
		Node prev = head;
		
		while (current.hasNext()) {
			Node next = current.getNext();
			if ( current != head){
				current.setNext(prev);
			}
			else {
				current.setNext(null);
			}
			prev = current ;
			current = next;
		}
		head = current;
		current.setNext(prev);

		iterateAndPrint();
	}

	private void add(String nodeValue) {
		if (head == null) {
			head = new Node(nodeValue);
		} else {
			Node temp = new Node(nodeValue);
			Node current = head;

			while (current.hasNext()) {
				current = current.getNext();

			}
			current.setNext(temp);
		}
	}

}
