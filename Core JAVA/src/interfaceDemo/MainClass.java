package interfaceDemo;
class CallingInterface implements inter1,inter2{
	public void interface3() {
		System.out.println("interface 3");
	}
	public void interface2() {
		System.out.println("interface 2");
	}
	public void interface1() {
		System.out.println("interface 1");
	}
}
public class MainClass {
	public static void main(String[] args) {
		CallingInterface c =new CallingInterface();
		c.interface1();
		c.interface2();
		c.interface3();
		inter1.interface4();
		inter2.interface5();
		inter3.interface6();
		c.run();
	}
}
