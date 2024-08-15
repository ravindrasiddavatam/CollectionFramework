import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionsClass {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		List<Student> list = new ArrayList<>();
		list.add(new Student("Shivam",40));
		list.add(new Student("Mahesh",20));
		list.add(new Student("Kiran",30));
		
		Student s1 = new Student("Tuy",1);
		Student s2 = new Student("Mahesh",3);
		
		//System.out.println(s1.compareTo(s2));
		
//		System.out.println(list);
//		
		Collections.sort(list);
//		
//		System.out.println(list);
//		
	//	Collections.sort(list, (o1,o2)->o1.name.compareTo(o2.name));
//		Collections.sort(list,new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				// TODO Auto-generated method stub
//				return o1.name.compareTo(o2.name);
//			}
//			
//		});
		
		System.out.println(list);
		
//		List<Integer> list = new ArrayList<>();
//		list.add(34);
//		list.add(23);
//		list.add(12);
//		list.add(34);
//		list.add(90);
//		//System.out.print(list);
//		
////		System.out.println("min element" + " " + Collections.min(list));
////		System.out.println("max element" + " " + Collections.max(list));
////		System.out.println(Collections.frequency(list, 90));
//		
//		//Collections.sort(list);
//		Collections.sort(list,Comparator.reverseOrder());
//		System.out.println(list);
		
		
		

	}

}
