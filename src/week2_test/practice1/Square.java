package week2_test.practice1;

public class Square extends Rectangle{

	 public Square(double side) {
	        super(side, side);
	    }
	



	double side;

	
	
	@Override
    public void printx() {
  
		//System.out.println("正方形の辺の長さ：" + side + "、面積：" + side*side + "、周長：" + side*4);
		System.out.println("正方形の辺の長さ：" + super.width
                + "、面積：" + super.getArea()
                + "、周長：" + super.getPerimeter()
        );
	}
	
	

}
