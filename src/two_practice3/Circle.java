package two_practice3;

public class Circle implements Printx{
	//メソッド変数
	protected double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	//円の面積を求めるメソッド
	public double getArea() {
		return radius*3.14;
	}
	
	//円周を求めるメソッド
	public double getCircumference() {
		return 2*3.14*radius;
	}
	
	@Override
	public void printx() {
		System.out.println(this.getArea());
		System.out.println(this.getCircumference());
	}
}
