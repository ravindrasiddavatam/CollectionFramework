import java.util.Arrays;

public class LearnArraysClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] numbers = {10,20,12,30,40,50};
		Arrays.sort(numbers);
		
		Arrays.fill(numbers, 12);
		
		for(int i:numbers) {
			System.out.print(i + " ");
		}

	}

}
