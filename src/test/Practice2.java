package test;

public class Practice2 {

	public static void main(String[] args) {
        // 三角形の面積を計算して表示
        double triangleBase = 10.0;
        double triangleHeight = 5.0;
        double triangleArea = calcTriangleArea(triangleBase, triangleHeight);
        System.out.println("三角形の面積: " + triangleArea);
        
        // 円の面積を計算して表示
        double circleRadius = 5.0;
        double circleArea = calcCircleArea(circleRadius);
        System.out.println("円の面積: " + circleArea);
    }
    
    public static double calcTriangleArea(double base, double height) {
        double area = 0.5 * base * height;
        return area;
    }
    
    public static double calcCircleArea(double radius) {
        double area = 3.14 * radius * radius;
        return area;
    }


}
