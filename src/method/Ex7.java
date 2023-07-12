package method;

public class Ex7 {

	public static void main(String[] args) {
		//２次元配列の初期化
		int[][] myList = {{1, 2, 3, 4, 5}, {6, 7, 8}};
//		int[] myList = {{1,2,3,4},{5,6,7}};
		//２つのfor文を使用した書き方
		for(int i = 0; i<myList.length; i++) {
			for(int j = 0; j<myList[i].length; j++) {
				//！！内側のforループの条件式では、myList[i].lengthを使用して
				if(myList[i][j]%2==0){
					System.out.println(myList[i][j]);
				}

			}
		}
		
		System.out.println("--------------");
		
		//拡張for文配列専用の構文
		for(int[] array:myList) {
			for(int num:array) {
				if(num%2==0) {
					System.out.println(num);
				}
			}
		}
		
		System.out.println("--------------");
		
		//逆順出力
		for(int i = myList.length-1; i>=0; i--) {
			for(int j = myList[i].length-1; j>=0; j--) {
				System.out.println(myList[i][j]);
			}
		}
		
		System.out.println("--------------");
		
		//配列の合計を出力する
		int x = 0;
		for(int i = 0; i<myList.length; i++) {
			for(int j = 0; j<myList[i].length; j++) {
				x += myList[i][j];
			}	
		}
		System.out.println(x);
		
		
		
		

//	     for (int i = 1; i < myList.length; i++) {
//	    	 for (int j = 0; j<myList.length;j++) {
//	    		 
//	    	 }
//	
//	         if (myList[i] % 2 == 0) {
//	        	 even = myList[i];}
//	      }
//	      System.out.println("even is " + even);
	      
	   }

	}


