package OOPS;

class Pa{
	Pa(){
		System.out.println("cons in parent class");
	}
	public void run() {
		System.out.println("parent");
	}
}
class Ch1 extends Pa{
	public void ru1n() {
		System.out.println("child 1");
	}
}
class Ch2 extends Pa{
	public void run2() {
		System.out.println("child 2");
	}
}
class Ch3 extends Pa{
	public void run3() {
		System.out.println("child 3");
	}
}
public class Hierarchical {
	public static void main(String[] args) {
		Ch1 c1 = new Ch1();
		c1.run();
		c1.ru1n();
		Ch2 c2 = new Ch2();
		c2.run();
		c2.run2();
		Ch3 c3 = new Ch3();
		c3.run();
		c3.run3();
	}
}
