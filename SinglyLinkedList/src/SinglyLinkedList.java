
public class SinglyLinkedList<E> {

	private Node<E> head = null;
	private Node<E> tail = null;
	private int size = 0;
	
	public SinglyLinkedList() {
		
	}
	
	public int size() {
		return this.size;
	}
	
	public boolean isEmpty() {
		return this.size == 0;
	}
	
	public E first() {
		if (this.isEmpty()) {
			return null;
		} else {
			return this.head.getElement();
		}
	}
	
	public E last() {
		if (this.isEmpty()) {
			return null;
		} else {
			return this.tail.getElement();
		}
	}
	
	public void addFirst(E element) {
		this.head = new Node<E>(element, this.head);
		
		if (this.size == 0) {
			this.tail = this.head;
		}
		
		this.size++;
	}
	
	public void addLast(E element) {
		Node<E> node = new Node<E>(element, null);
		
		if (this.isEmpty()) {
			this.head = node;
		} else {
			this.tail.setNext(node);
		}
		
		this.tail = node;
		size++;
	}
	
	public E removeFirst() {
		if (this.isEmpty()) {
			return null;
		} else {
			E element = this.head.getElement();
			this.head = this.head.getNext();
			return element;
		}
	}
	
	public String toString() {
		StringBuilder string = new StringBuilder();
		
		for (Node<E> i = this.head; i != null; i = i.getNext()) {
			
			if (i != this.head) {
				string.append("," + i.getElement());
			} else {
				string.append(i.getElement());
			}
		}
		
		return string.toString();
	}
}
