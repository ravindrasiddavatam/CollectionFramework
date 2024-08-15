import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student> {
	
	String name;
	int id;
	
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	@Override
	public String toString() {
		return name + "=" + id + " ";
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() !=o.getClass()) return false;
		Student student = (Student) o;
		return id == student.id;
				
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
//	
//	@Override
//	public int compareTo(Student that) {
//		// TODO Auto-generated method stub
//		return this.id-that.id;
//	}
//	
	@Override
	public int compareTo(Student that) {
		// TODO Auto-generated method stub
		return this.name.compareTo(that.name);
	}

	
	

}
