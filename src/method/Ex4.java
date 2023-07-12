package method;

public class Ex4 {
	//成績判定をするメソッド
	//int score
	//return String
	//処理 if文

	public static void main(String[] args) {
		System.out.println(grades(90));

	}
	
	public static String grades(int score) {
		if (score >= 90) {
		return "wonderful";
		}else if(score >= 60) {
		return "success";
		}else {
		return "failure";}
	}

}
