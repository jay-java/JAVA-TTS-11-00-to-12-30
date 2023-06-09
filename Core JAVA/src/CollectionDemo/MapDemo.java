package CollectionDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(1, "c"); //entry
		map.put("abc  ", 454.4);
		map.put("c++",2);
		map.put(false, "python");
		map.put(1, "python");
		map.put(null, "abc");
		System.out.println(map);
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry entry  = (Entry)itr.next();
			System.out.println("key : "+entry.getKey());
			System.out.println("value : "+entry.getValue());
//			System.out.println(itr.next());
		}
	}
}
