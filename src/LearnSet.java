import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Student> studentSet = new HashSet<>();
		studentSet.add(new Student("Kamal",10));
		studentSet.add(new Student("Pavan",20));
		studentSet.add(new Student("Kamal",10));
		System.out.println(studentSet);
		
		
//		Set<Integer> set = new HashSet<>();
//		//Set<Integer> set = new LinkedHashSet<>();
//		set.add(10);
//		set.add(12);
//		set.add(14);
//		set.add(32);
//		
//		System.out.println(set);
//		
//		set.add(12);
//		System.out.println(set);
//		System.out.println(set.contains(100));
//		System.out.println(set.isEmpty());

	}

}
