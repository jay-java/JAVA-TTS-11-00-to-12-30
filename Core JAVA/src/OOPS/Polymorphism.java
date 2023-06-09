package OOPS;
//overloading
class Area {
	public void findArea(int l, int b) {
		System.out.println("area of rectangle : " + (l * b));
	}

	public void findArea(double h, double b) {
		System.out.println("area of triangle is : " + ((b * h) / 2));
	}
}
//overriding
class Shape{
	public void shape() {
		System.out.println("parent shape");
	}
}
class Rectangle extends Shape{
	public void shape() {
		super.shape();
		System.out.println("rectangle");
	}
}
public class Polymorphism {
	public static void main(String[] args) {
		Area a = new Area();
		a.findArea(10, 20);
		a.findArea(32.1, 36.2);
		Rectangle rr =new Rectangle();
		rr.shape();
	}
}
