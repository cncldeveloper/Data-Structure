
public class Node<E> {
	
	private E element;
	private Node<E> prev;
	private Node<E> next;
	
	public Node(Node<E> prev, E element, Node<E> next) {
		this.element = element;
		this.prev = prev;
		this.next = next;
	}
	
	public E getElement() {
		return this.element;
	}
	
	public void setElement(E element) {
		this.element = element;
	}
	
	public Node<E> getPrev() {
		return this.prev;
	}
	
	public Node<E> getNext() {
		return this.next;
	}
	
	public void setPrev(Node<E> prev) {
		this.prev = prev;
	}
	
	public void setNext(Node<E> next) {
		this.next = next;
	}
}
