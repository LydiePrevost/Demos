
public class Node {
	private String value = "";
	private Node next;
	
	public void setNext(Node next) {
		this.next = next;
	}

	public  Node(String value) {
		this.value = value;
		this.next = null;
	}	
	
	public  Node(Node next, String value) {
		this.value = value;
		this.next = next;
	}

	public boolean hasNext() {
		return next == null? false: true;
	}

	public Node getNext() {
		return next;
	}

	public String getValue() {
		return value;
	}		
	
	public String toString() {
		return value;
	}	

}
