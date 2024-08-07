import java.util.ArrayDeque;

public class LearnArrayDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayDeque<Integer> adq = new ArrayDeque<>();
		adq.offer(10);
		adq.offerFirst(12);
		adq.offerLast(23);
		
		//System.out.println(adq);
		adq.offer(15);
		//System.out.println(adq);
		// [12,10,23,15]
		System.out.println(adq.peek());
		System.out.println(adq.peekFirst());
		System.out.println(adq.peekLast());
		// [12,10,23,15]
		System.out.println(adq.poll());
		System.out.println(adq.pollFirst());
		System.out.println(adq.pollLast());
		
		

	}

}
