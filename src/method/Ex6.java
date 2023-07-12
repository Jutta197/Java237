package method;

public class Ex6 {

	public static void main(String[] args) {
		int x = 40;
		//素数かどうかを判断する変数
		
		boolean isPrime = true;
		//0と１は素数じゃない
		if(x<2) {
			isPrime = false;
		}
		
		//ｘが素数かどうかの判定
		for(int i=2; i<x; i++) {
			//割引きれるかどうかの判断
			if(x%i==0) {
				isPrime = false;
				break;
			}

		}
		
		//結果を確認するためのif文
		if(isPrime == true) {
			System.out.println(x + " is prime");
		}else {
			System.out.println(x + " is not prime");
		}
		
		
		
//		int s = x;
//		while(x%s != 0) {
//			s--; }
//		System.out.println(k + " is prime");
		
		System.out.println("-----------------------");
		int k = 40;
		//素数かどうかを判断する変数
		
		
		if(k>2) {
			for(int i=2; i<k; i++) {
				for(int j=2; j<i; j++) {
					//割引きれるかどうかの判断
					if(j%i==0) {
						break;
				}
				System.out.println(j);

			}
		}
		
		//ｘが素数かどうかの判定
		
		
		}}}
	
	
	
	
	
	
	
	
	


