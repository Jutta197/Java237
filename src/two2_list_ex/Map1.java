package two2_list_ex;

import java.util.HashMap;
import java.util.Map;

public class Map1 {

	public static void main(String[] args) {
		// 
		Map<String,Integer>studentAge = new HashMap<String,Integer>();
		studentAge.put("1",11);
		studentAge.put("2",22);
		studentAge.put("3",33);
		System.out.println(studentAge);
		for(String age:studentAge.keySet()) {
			System.out.println(age + " "+studentAge.get(age));
			
		}
		

	}

}
