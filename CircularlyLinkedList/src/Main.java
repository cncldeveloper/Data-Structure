
public class Main {

	public static void main(String[] args) {
		
		CircularyLinkedList<Integer> link = new CircularyLinkedList<Integer>();
		
		link.addLast(1);
		link.addLast(2);
		link.addLast(3);	
	
		System.out.println(link.toString());
	}
}
