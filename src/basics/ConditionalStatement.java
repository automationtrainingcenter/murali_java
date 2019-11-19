 package basics;

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
		if(num >= 0) {
			System.out.println("inside the if condition");
			System.out.println("num is positive");
		}
		System.out.println("simple if completed");
		
		
		System.out.println("********IF ELSE*******************");
		// verify a given number is even or odd
		if(num % 2 == 0) {
			System.out.println("num is even");
		}else {
			System.out.println("num is odd");
		}
		
		System.out.println("********ELSE IF LADDER*******************");
		// print the biggest in given two numbers
		int num1 = 12;
		int num2 = 10;
		if(num1 > num2) {
			System.out.println("num1 is bigger");
		}else if(num2 > num1){
			System.out.println("num2 is bigger");
		}else {
			System.out.println("both are equal");
		}
		
		System.out.println("********NESTED IF*******************");
		if(num1 != num2) {
			if(num1 > num2) {
				System.out.println("num1 is bigger");
			}else {
				System.out.println("num2 is bigger");
			}
		}else {
			System.out.println("both are equal");
		}
		
		System.out.println("********SWITCH CASE*******************");
		int level = 2;
		switch(level) {
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
	}

}
