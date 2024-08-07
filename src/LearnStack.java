import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class LearnStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(13);
		stack.push(15);
		stack.push(23);
		
		System.out.println(stack.peek());
		
		stack.pop();
		
		System.out.println(stack.peek());

	}

}
