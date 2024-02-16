package Chapter11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String,Integer> hashmap = new HashMap<>();
		Set<String> keySet = hashmap.keySet();
		hashmap.put("key1",1);
		hashmap.put("key2",2);
		hashmap.put("key3",3);
		hashmap.put("key1",0);
		
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()){
			String key= keyIterator.next();
			Integer value = hashmap.get(key);
		}

		Set<Map.Entry<String,Integer>> entrySet = hashmap.entrySet();
		for (Map.Entry<String,Integer> entry:entrySet){
			System.out.println(entry);
		}

		System.out.println(hashmap.containsKey("key3"));
	}
}
