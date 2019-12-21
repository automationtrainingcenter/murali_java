package collections;

import java.util.LinkedList;
import java.util.List;

public class StreamsDemo {

	public static void main(String[] args) {
		List<String> courses = new LinkedList<>();
		courses.add("c");
		courses.add("cpp");
		courses.add("Java");
		courses.add("Python");
		courses.add("cpp");
		courses.add("selenium");
		courses.add("testing");
		courses.add("flask");
		courses.add("django");
		courses.add("kotlin");
		courses.add("php");
		courses.add("devops");
		courses.add("aws");

//		// covert every course in courses list into upper case
//		List<String> upperCourses = new ArrayList<String>();
//		for(String course : courses) {
////			String upperCrs = course.toUpperCase();
////			upperCourses.add(upperCrs);
//			upperCourses.add(course.toUpperCase());
//		}
//		System.out.println(upperCourses);
//		
//		// filter the data whose course length is greater than 3
//		List<String> filteredCourses = new ArrayList<>();
//		for(String upperCourse : upperCourses) {
//			if(upperCourse.length()>3) {
//				filteredCourses.add(upperCourse);
//			}
//		}
////		System.out.println(filteredCourses);
//		
//		for(String crs : filteredCourses) {
//			System.out.println(crs);
//		}

//		Function<String, String> fn = new Function<String, String>() {
//
//			@Override
//			public String apply(String t) {
//				return t.toUpperCase();
//			}
//		};

//		Function<String, String> fn = (String course) -> course.toUpperCase();

//		Predicate<String> fn = new Predicate<String>() {
//
//			@Override
//			public boolean test(String course) {
//				if(course.length() > 3) {
//					return true;
//				}else {
//					return false;
//				}
//			}
//		};

		// streams api
		courses.stream().map((String course) -> course.toUpperCase()).filter((String course) -> course.length() > 3)
				.forEach(System.out::println);

	}

}
