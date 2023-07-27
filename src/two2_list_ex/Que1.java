package two2_list_ex;

import java.util.LinkedList;
import java.util.Queue;

public class Que1 {
	public static void main(String[] args) {
		Queue<String>studentNames = new LinkedList<String>();
		studentNames.offer("1");
		studentNames.offer("2");
		studentNames.offer("3");
		System.out.println(studentNames.poll());
		
	}

}
