package OOPS;
class P{
	public void run() {
		System.out.println("run  in parent");
	}
}
class C extends P{
	public void run() {
		System.out.println("run  in Child");
	}
}
public class InheritanceDemo {
	public static void main(String[] args) {
		    C c = new C();
		    c.run();
		    C c1 = new C();
		    c1.run();
	}
}
