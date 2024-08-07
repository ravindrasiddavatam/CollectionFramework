import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> queue = new LinkedList<>();
		// Queue<Integer> queue1 = new ArrayList<>();
		
		queue.offer(10);
		queue.offer(12);
		queue.offer(15);
		
		System.out.println(queue.poll());
		
		System.out.println(queue);
	}

}
