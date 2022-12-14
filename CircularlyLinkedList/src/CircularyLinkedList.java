
public class CircularyLinkedList<E> {
	
	private Node<E> tail = null;
	private int size = 0;
	
	public CircularyLinkedList() {
		
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
			return this.tail.getNext().getElement();
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
		if (this.size == 0) {
			this.tail = new Node<>(element, null);
			this.tail.setNext(this.tail);
		} else {
			Node<E> node = new Node<>(element, this.tail.getNext());
			this.tail.setNext(node);
		}
		
		this.size++;
	}
	
	public void addLast(E element) {
		this.addFirst(element);
		this.tail = this.tail.getNext();
	}
	
	public E removeFirst() {
		if (this.isEmpty()) {
			return null;
		} else {
			Node<E> head = this.tail.getNext();
			if (head == this.tail) {
				this.tail = null;
			} else {
				this.tail.setNext(head.getNext());
			}
			this.size--;
			return head.getElement();
		}
	}
	
	public String toString() {
		StringBuilder string = new StringBuilder();
		
		Node<E> head = this.tail;
		
		do {
			if (head != this.tail) {
				string.append("," + head.getNext().getElement());
			} else {
				string.append(head.getNext().getElement());
			}
			head = head.getNext();
			
		} while (head != tail);
		
		return string.toString();
	}
}
