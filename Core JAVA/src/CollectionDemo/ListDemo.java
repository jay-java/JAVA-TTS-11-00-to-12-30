package CollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//collection is framework in java which provides 
//architecture to manipulate group of objects.
//<generics>
public class ListDemo {
	public static void main(String[] args) {
		List list = new ArrayList();
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
