package week3.day2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;




public class FindNumberOccurance {
	public static void main(String[] args) {
		
		int[] input = { 2, 3, 5, 6, 3, 2, 1, 4, 2, 1, 6, -1 };

		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();

		for (int i : input) {

			if (map.containsKey(i)) {

				map.put(i, map.get(i) + 1);
			} else {

				map.put(i, 1);
			}

		}

		System.out.println(map);
		
Set<Entry<Integer, Integer>> entrySet = map.entrySet();

for (Entry<Integer, Integer> eachentry : entrySet) {
	
	Integer key = eachentry.getKey();
	Integer value = eachentry.getValue();
	
	System.out.println(key +"----->" +value );
}

	}
}