package OOPS;
class P1{
	P1(){
		System.out.println("default in P1");
	}
	public int run() {
		return 214748;
	}
}
class C1 extends P1{
	C1(){
		System.out.println("child cons");
	}
	String name = "java";
	public String method() {
		return name;
	}
}
class GC1 extends C1{
	GC1(){
		System.out.println("GC1 cons");
	}
	public double returnDouble(int id) {
		return 4.3;
	}
}
public class MUlitlevel {
	public static void main(String[] args) {
		GC1 gg= new GC1();
		gg.run();
		gg.method();
		double d = gg.returnDouble(20);
		System.out.println(d);
	}
}
