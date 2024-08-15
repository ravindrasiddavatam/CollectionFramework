import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Map<String,Integer> map = new HashMap<>();
		Map<String,Integer> map = new TreeMap<>(); // give result in sorted order
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("two", 23);
		map.put("four", 90);
		
		if(!map.containsKey("two")) {
			map.put("two", 45);
		}
		
		map.putIfAbsent("two", 80);
		System.out.println(map);
		
		for(Map.Entry<String, Integer> e: map.entrySet()) {
			System.out.println(e);
		}
		
		
	}

}
