package method;

public class Practice3 {

	public static void main(String[] args) {
		System.out.println(signOf(3));
		}
	
	//注意2个方法要中括号分开，别一个套一个
	public static int signOf(int num) {
		if(num < 0) {
			return -1;
		}else if(num > 0) {
			return 1;
		}else {
			return 0;
		}
	}
	
	//オーバーロード
	
	

}
