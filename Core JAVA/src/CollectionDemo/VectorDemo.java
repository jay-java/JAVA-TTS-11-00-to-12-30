package CollectionDemo;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector vr = new Vector();
		vr.add(1);
		vr.add("java");
		vr.add(3.3);
		vr.add('f');
		vr.add(false);
		System.out.println(vr);
		Enumeration em = vr.elements();
		while(em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}
	}
}
