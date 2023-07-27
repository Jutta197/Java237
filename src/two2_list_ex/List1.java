package two2_list_ex;

import java.util.ArrayList;
import java.util.List;

public class List1 {

	public static void main(String[] args) {
		// リストの宣言
		List<String> studentNames = new ArrayList<String>();
		//　データのSōnyū
		studentNames.add("Alice");
		studentNames.add("2");
		studentNames.add("3");
		System.out.println(studentNames);
		studentNames.remove(0);
		System.out.println(studentNames);
		studentNames.remove("3");
		System.out.println(studentNames);
		System.out.println(studentNames.get(0));
		//System.out.println(studentNames.get(1));
		System.out.println(studentNames.size());
		// for each 依次输出数组中的每个元素
		System.out.println("---------");
		for(String name:studentNames) {
			System.out.println(name);
		}
	}

}
