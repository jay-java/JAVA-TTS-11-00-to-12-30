package CollectionDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		Set list = new HashSet();
		list.add(1);
		list.add(1);
		list.add("name");
		list.add(56.5);
		list.add(false);
		list.add('r');
		list.add(346457457);
		list.add(456);
		System.out.println(list);
		System.out.println(list.contains(1));
		System.out.println(list.size());
		list.remove(3);
		System.out.println(list);
		System.out.println(list.size());
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
