package collections;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/*
 * Map is also an inbuilt data structure in Java
 * Map is used to store data in key and value pairs
 * Here key and value can be any type
 * Map is an interface which is implemented by
 * HashMap: it won't maintain any order for the data
 * LinkedHashMap: it will maintain insertion order
 * TreeMap: it will maintain ascending for numeric keys and alphabetical for character keys
 */
public class MapDemo {

	public static void main(String[] args) {
		// create a Map
		Map<String, Integer> courses = new TreeMap<>();

		// verify map is empty or not
		System.out.println(courses.isEmpty());

		// find the number of items in a Map
		System.out.println(courses.size());

		// add the data to the map
		courses.put("java", 45);
		courses.put("selenium", 90);
		courses.put("python", 60);
		courses.put("django", 30);
		courses.put("flask", 30);
		courses.put("manual", 25);
		courses.put("Rest Assured", 30);
		courses.put("c", 30);

		// print the data of a map
		System.out.println(courses);

		// retrieve the data from a map
		System.out.println(courses.get("c"));

		// retrieve all the keys from the map
		Set<String> keys = courses.keySet();
		for (String key : keys) {
//			System.out.println(key +" : "+courses.get(key));
			System.out.println(key + " will take " + courses.get(key) + " hours");
		}

		// retrieve all the values from the map
		Collection<Integer> hours = courses.values();
		for (Integer hour : hours) {
			System.out.println(hour);
		}

		// retrieve both key and value as a pair
		Set<Entry<String, Integer>> kvpairs = courses.entrySet();
		for (Entry<String, Integer> eachPair : kvpairs) {
			System.out.println(eachPair.getKey() + " -------- " + eachPair.getValue());
		}

		// to update the data use put() with old key and new value
		courses.put("manual", 20);
		System.out.println(courses);

		// to delete the data from the map
		courses.remove("c");
		System.out.println(courses);

		courses.remove("manual", 20);
		System.out.println(courses);

		// search for a data
		System.out.println(courses.containsKey("c"));

		System.out.println(courses.containsValue(30));

		// to remove all the values
		courses.clear();

		System.out.println(courses);
	}

}
