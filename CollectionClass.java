package task4;
import java.util.LinkedList;
public class CollectionClass {
	
	 LinkedList<Integer> stack = new LinkedList<>();

	    public void push(int value) {
	        stack.push(value);  // adds to the head
	    }

	    public int pop() {
	        return stack.pop();  // removes from the head
	    }

	    public boolean isEmpty() {
	        return stack.isEmpty();
	    }

	    public static void main(String[] args) {
	    	CollectionClass myStack = new CollectionClass();

	        myStack.push(10);
	        myStack.push(20);
	        myStack.push(30);

	        System.out.println("Popped: " + myStack.pop());    // 30
	        System.out.println("Popped: " + myStack.pop());    // 20
	        System.out.println("Is stack empty? " + myStack.isEmpty());  // false
	        System.out.println("Popped: " + myStack.pop());    // 10
	        System.out.println("Is stack empty? " + myStack.isEmpty());  // true
	    }

}
