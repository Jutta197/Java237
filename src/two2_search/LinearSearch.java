package two2_search;

public class LinearSearch {

	public static void main(String[] args) {
		// 
		int[] data = {1,3,4,7,9,10,15,19,20,24,30};
		//メソッドを作成
		//排列のデータ：dataと20

		System.out.println(search(data, 20));
		System.out.println(search(data, 77));
	}
	
	public static int search(int[] data, int val) {
		for(int i = 0; i < data.length; i++) {
			if(data[i] == val) {
				return i+1;
			}
		}
		return -1;
	}

}
