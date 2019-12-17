package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * Set is also a inbuilt data structure in Java.
 * Set is used to store unique data, i.e. set doesn't allow duplicate data
 * Set is not index based. Set does not maintain any order
 * Set is an interface which is implemented by
 * HashSet:  it will not maintain any order
 * LinkedHashSet: it will maintain the insertion order
 * TreeSet: it will maintain ascending order for numeric data and alphabetical order for character data
 */

public class SetDemo {
	public static void main(String[] args) {
		// create a set
		Set<String> courses = new HashSet<>();

		// get the size of the set i.e. the number of items in the set
		System.out.println(courses.size());

		// verify a set is empty or not
		System.out.println(courses.isEmpty());

		// add the data to the list
		courses.add("Java");
		courses.add("python");
		courses.add("selenium");
		courses.add("testing");
		courses.add("flask");
		courses.add("Django");
		courses.add("Rest Assured");
		courses.add("python");
		courses.add("andriod");
		
		// print the data of the set on the console
		System.out.println(courses);

		// retrieve all the data from the set using for each loop
		for (String course : courses) {
			System.out.println(course.toLowerCase());
		}

		// retrieve all the data from the set using iterator interface
		Iterator<String> it = courses.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().toUpperCase());
		}

		
		// delete data from the set
		courses.remove("andriod");
		
		System.out.println(courses);
		
		// search for a value in set
		System.out.println(courses.contains("flask"));
		
		
		// remove all the values of the set
		courses.clear();
		System.out.println(courses);
	}
}
