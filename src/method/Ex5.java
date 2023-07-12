package method;

public class Ex5 {
//奇偶的定义是能否被2整除，并没有特别指明是正或负。
//奇数、偶数的判定是“是否能被2整除”，而整除的讨论范围是0除外的自然数——非零自然数
	public static void main(String[] args) {
		int num = 3;
		System.out.println(checkParity(num));
		
		System.out.println(0%2);

	}
	public static String checkParity(int num) {
		
		if(num == 0) {
			return "not even neither odd";
		}
		else if (num % 2 == 0) {
			return "even";
		}
		else {
			return "odd";
		}
		
	}

}
