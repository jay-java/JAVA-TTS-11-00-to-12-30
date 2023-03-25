package interfaceDemo;

public interface inter1 {
	public void interface1();
	public static void interface4() {
		System.out.println("interface 4");
	}
	public default void run() {
		System.out.println("run");
	}
}
