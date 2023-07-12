package test;

public class Practice1 {

	public static void main(String[] args) {
        int isHungry = 0;  // 0: 空腹, 1: お腹がいっぱい
        String food = "ハンバーグ";  
        
        System.out.println("こんにちは");
        
        if (isHungry == 1) {
            System.out.println("お腹がいっぱいです");
        } else {
            System.out.println("はらペこです");
        }
        
        if (isHungry == 0) {
            System.out.println(food + "をいただきます");
        }
        
        System.out.println("ごちそうさまでした");
    }


}
