package basics;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

/*Conditional statements are statements which contains conditional or comparison operators
 * These are used to execute a block of statements based on some condition
 * ******** if ************
 * if(expression){
 * 		statements
 * }
 * if the expression true then the statements inside if block will be executed.
 * 
 * 
 * ************ if-else ************
 * if(expression){
 * 		statements;
 * }else{
 * 		statements;
 * }
 * if the expression is true the statements inside if block will be executed else statements 
 * inside else block will be executed
 * 
 * 
 * ************ else if ladder ************
 * if(expression 1){
 * 		statements;
 * }else if(expression 2){
 * 		statements;
 * }else if(expression 3){
 * 		statements;
 * }
 * .
 * .
 * .
 * }else if(expression n){
 * 		statements;
 * }else{
 * 		statements;
 * }
 * if expression 1 is true it will execute statements inside if block else if will expression 2 and 
 * if expression 2 is true it will execute statements inside expression 2 else if block else if will
 * verify next expression. if all the expressions are false then it will execute statements inside
 * else block
 * 
 * 
 * ************ nested if ************
 * if(expression 1){
 * 		if(expression 2{
 * 			statements;
 * 		}else{
 * 			statements;
 * 		}
 * }else{
 * 		statements;
 * }
 * 
 * 
 * ************ switch case: it will work based on value ************
 * switch(Value){
 * 		case value1;
 * 			statements;
 * 			break;
 * 		case value2:
 * 			statements;
 * 			break;
 * 		.
 * 		.
 * 		.
 * 		case valueN:
 * 			statements;
 * 			break;
 * 		default:
 * 			statements;
 * }
 * 	
 * 
 */

public class ConditionalStatement {

	public static void main(String[] args) {
		System.out.println("********SIMPLE IF*******************");
		// verify a given number is positive
		int num = 13;
		if (num >= 0) {
			System.out.println("inside the if condition");
			System.out.println("num is positive");
		}
		System.out.println("simple if completed");

		System.out.println("********IF ELSE*******************");
		// verify a given number is even or odd
		if (num % 2 == 0) {
			System.out.println("num is even");
		} else {
			System.out.println("num is odd");
		}

		System.out.println("********ELSE IF LADDER*******************");
		// print the biggest in given two numbers
		int num1 = 12;
		int num2 = 10;
		if (num1 > num2) {
			System.out.println("num1 is bigger");
		} else if (num2 > num1) {
			System.out.println("num2 is bigger");
		} else {
			System.out.println("both are equal");
		}

		System.out.println("********NESTED IF*******************");
		if (num1 != num2) {
			if (num1 > num2) {
				System.out.println("num1 is bigger");
			} else {
				System.out.println("num2 is bigger");
			}
		} else {
			System.out.println("both are equal");
		}

		System.out.println("********SWITCH CASE*******************");
		int level = 2;
		switch (level) {
		case 1:
			System.out.println("display instructions");
			System.out.println("display tips");
			System.out.println("game in easy mode");
			break;
		case 2:
			System.out.println("display tips");
			System.out.println("game in moderate mode");
			break;
		case 3:
			System.out.println("game in hard mode");
			break;
		default:
			System.out.println("invalid level");
		}

		// facebook scenario
		Scanner sc = new Scanner(System.in);
		System.out.println("enter facebook username");
		String username = sc.next();
		System.out.println("enter password");
		String password = sc.next();
		if (username.equals("sunshine") && password.equals("python")) {
			System.out.println("welcome");
		} else {
			System.out.println("invalid credentials");
		}

		// gmail scenario
		System.out.println("enter gmail username");
		String uname = sc.next();
		if (uname.equals("sunshine")) {
			System.out.println("enter gmail password");
			String pass = sc.next();
			if (pass.equals("python")) {
				System.out.println("welcome to gmail");
			} else {
				System.out.println("invalid password");
			}
		} else {
			System.out.println("invalid username");
		}

		// switch case browser launch scenario
		System.out.println("enter browser name");
		String brName = sc.next().toLowerCase();
		switch (brName) {
		case "chrome":
			System.out.println("launching chrome browser");
			break;
		case "firefox":
			System.out.println("launching firefox browser");
			break;
		case "ie":
			System.out.println("launching internet explorer browser");
			break;
		case "edge":
			System.out.println("launhing microsoft edge browser");
			break;
		case "opera":
			System.out.println("launching opera browser");
			break;
		default:
			System.out.println("invalid browser selection");
		}

		// score scenario
		System.out.println("enter your score");
		int score = sc.nextInt();
		if (score < 500) {
			System.out.println("keep playing");
		} else if (score < 1000) {
			System.out.println("bronze medal");
		} else if (score < 2000) {
			System.out.println("silver medal");
		} else {
			System.out.println("gold medal");
		}
	}

}
