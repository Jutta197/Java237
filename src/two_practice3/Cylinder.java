package two_practice3;

public class Cylinder extends Circle{
	//メンバ変数　高さ
	private double height;

	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}

	//体積を求めるメソッド
	public double getVolume() {
		return super.getArea()*height;
	}

	@Override
	public void printx() {
		System.out.println(
				"Cylinder Radius:"+radius
				+"Height :"+height
				+",Area:"+getArea()
				+",Volume::"+getVolume()
				);

	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}



}