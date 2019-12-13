package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 * Data structures are used to work with collection of data of similar data type
 * List is inbuilt data structure in Java
 * List is an interface and is implemented by ArrayList and LinkedList classes
 * List is index based
 * ArrayList is same as array which except ArrayList size is dynamic.
 * 
 * List allows duplicate data
 */
public class ListDemo {

	public static void main(String[] args) {

		// create a list
		List<String> courses = new LinkedList<String>();

		// verify how many values are there in the list
		System.out.println("number of courses = " + courses.size());

		// verify a list is empty or not
		System.out.println("courses list is empty " + courses.isEmpty());

		// add the data to the list
		courses.add("Java");
		courses.add("python");
		courses.add("selenium");
		courses.add("testing");
		courses.add("flask");
		courses.add("Django");
		courses.add("Rest Assured");
		courses.add("python");

		// print the values of the list on the console
		System.out.println(courses);

		// retrieve the data from the list at a given index number
		System.out.println(courses.get(3));

		// retrieve all the data from the list using normal for loop
		for (int i = 0; i < courses.size(); i++) {
			System.out.println(i+" "+courses.get(i).toUpperCase());
		}

		// retrieve all the data from the list using for each loop
		for (String course : courses) {
			System.out.println(course.toLowerCase());
		}

		// retrieve all the data from the list using iterator interface
		Iterator<String> it = courses.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		// insert data to the list
		courses.add(3, "Katalon");
		
		System.out.println(courses);
		
		// update the data in the list
		courses.set(1, "c");
		System.out.println(courses);
		
		// delete the data at a given index number
		courses.remove(1);
		System.out.println(courses);
		
		// delete the data based value
		courses.remove("Katalon");
		System.out.println(courses);
		
		// search for a data in the list
		System.out.println(courses.contains("Django"));
		
		
		// indexOf() return index number of the given item first occurrence
		System.out.println(courses.indexOf("Django"));
		
		// remove all the items from the list
		courses.clear();
		System.out.println(courses.size());

	}

}
