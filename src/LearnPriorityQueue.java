import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> pq = new PriorityQueue(Comparator.reverseOrder());
		pq.offer(10);
		pq.offer(20);
		pq.offer(30);
		pq.offer(40);
		
		System.out.println(pq);
		
		pq.poll();
		
		System.out.println(pq);
		
		System.out.println(pq.peek());

	}

}
