
public class Stack<E> {

	private E[] data;
	private int t = -1;
	
	@SuppressWarnings("unchecked")
	public Stack(int capacity) {
		this.data = (E[]) new Object[capacity];
	}
	
	public int size() {
		return this.t + 1;
	}
	
	public boolean isEmpty() {
		return this.t == -1;
	}
	
	public boolean isFull() {
		return this.size() == this.data.length;
	}
	
	public void push(E item) {
		if (this.isFull()) {
			System.out.println("Stack is Full");
		} else {
			this.data[++this.t] = item;
		}
	}
	
	public E pop() {
		if (this.isEmpty()) {
			System.out.println("Stack is empty");
			return null;
		} else {
			E item = this.data[this.t];
			this.data[this.t] = null;
			this.t--;
			return item;
		}
	}
	
	public String toString() {
		
		StringBuilder string = new StringBuilder();
		
		for (int i = 0; i < this.size(); i++) {
			if (i == 0) {
				string.append("" + this.data[i]);
			} else {
				string.append("," + this.data[i]);
			}
		}
		
		return string.toString();
	}
}
