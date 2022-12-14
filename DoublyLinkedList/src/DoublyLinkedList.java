
public class DoublyLinkedList<E> {

	private Node<E> header = null;
	private Node<E> tailer = null;
	private int size = 0;
	
	public DoublyLinkedList() {
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
			return header.getElement();
		}
	}
	
	public E last() {
		if (this.isEmpty()) {
			return null;
		} else {
			return this.tailer.getElement();
		}
	}

	public void addLast(E element) {
		if (this.isEmpty()) {
			this.header = this.tailer = new Node<>(null, element, null);
		} else {
			Node<E> node = new Node<>(this.tailer, element, null);
			this.tailer.setNext(node);
			this.tailer = node;	
		}
		
		this.size++;
	}
	
	public void addFirst(E element) {
		if (this.isEmpty()) {
			this.header = this.tailer = new Node<>(null, element, null);
		} else {
			Node<E> node = new Node<>(null, element, this.header);
			this.header.setPrev(node);
			this.header = node;
		}
		
		this.size++;
	}
	
	public E removeFirst() {
		if (this.isEmpty()) {
			return null;
		} else {
			E element = this.header.getElement();
			this.header = header.getNext();
			this.size--;
			return element;
		}
	}
	
	public E removeLast() {
		if (this.isEmpty()) {
			return null;
		} else {
			E element = this.tailer.getElement();
			
			if (this.size == 1) {
				this.header = this.tailer = null;
			} else {
				this.tailer.getPrev().setNext(null);
			}
			return element;	
		}
	}
	
	
	public String toString() {
		StringBuilder string = new StringBuilder();
		
		for (Node<E> i = this.header; i != null; i = i.getNext()) {
			
			if (i != this.header) {
				string.append("," + i.getElement());
			} else {
				string.append(i.getElement());
			}
		}
		
		return string.toString();
	}
	
}
