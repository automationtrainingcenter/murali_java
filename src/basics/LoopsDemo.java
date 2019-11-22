package basics;

import java.util.Scanner;

/*
* If we want to execute a block of code for certain number of times then 
* we are going to use loops
* Every loop will have three parts
* 1. initialization
* 2. condition
* 3. increment or decrement

* In Java we have mainly 4 types of loops
* Infinite loop: A loop which will run forever
* 
* 1. while loop
* 		initialization;
* 		while(expression){
* 			statements;
* 			increment/decrement;
* 		}
*  While will verify the condition first then only it'll execute the statements. 
* 	i.e If the while condition is true then the statements inside the while block will be executed
* 	The minimum iteration count is 0
* 	
* 2. do while loop
* 		initialization;
* 		do{
* 			statements;
* 			increment/decrement;
* 		}while(expression);
*  do-while loop will execute the statement inside the do block for first time then it will verify 
*  the condition of while . If it is true then the statements inside do block will repeat execution 
*  else do-while block will be terminated.
*  The minimum iteration count is 1
* 
* 3. for loop
* 		for(initialization; expression; increment/decrement){
* 			statements;
* 		}
* The minimum iteration count is 0
* 
* 4. for-each loop
* 		It is used iterate over an array or collection
* 		for(array_type var_name : array_var_name){
* 			statements;
* 		}
* 
* 
* we can terminate the loop based on some expression using "break" statement
* we can skip the current iteration of the loop based on some condition using "continue" statement
*/

public class LoopsDemo {
	public static void main(String[] args) {
		// while loop
		// print numbers from 1 to 10
		// initialization
		int i = 1;
		// condition
		while (i < 11) {
			System.out.println(i);
			// increment
			i++;
		}

		// do while loop
		System.out.println("************************************************");
		// print numbers from 20 to 10
		// initialization
		int j = 20;
		do {
			System.out.println(j);
			// decrement
			j--;
		} while (j > 10);

		// for loop
		System.out.println("************************************************");
		// print even number from 100 to 110
		for (int k = 100; k < 110; k++) {
			if (k % 2 == 0) {
				System.out.println(k);
			}
		}

		// for each loop
		System.out.println("************************************************");
		int[] numbers = { 1, 3, 5, 7, 9, 11, 13, 17, 19 };
		for (int number : numbers) {
			System.out.println(number);
		}

		// do-while: read a string from the console until we enter exit
		// create a Scanner class object to read the data
		Scanner sc = new Scanner(System.in);
		String word = "";
		do {
			System.out.println("enter some word");
			word = sc.next();
		} while (!word.equalsIgnoreCase("exit"));

		System.out.println("************************************************");
		// break statement: it will terminate the loop
		for (int l = 0; l <= 10; l++) {
			if (l == 5) {
				break;
			}
			System.out.println(l);
		}

		System.out.println("for loop with break statement ended");

		System.out.println("************************************************");
		// continue statement: it will skip the current iteration
		for (int l = 0; l <= 10; l++) {
			if (l % 2 != 0) {
				continue;
			}
			System.out.println(l);
		}

		System.out.println("for loop with continue statement ended");

		// find out given number is prime number or not
		boolean status = true;
		System.out.println("enter a number to verify prime or not");
		int num = sc.nextInt();
		for (int p = 2; p <= num / 2; p++) {
			if (num % p == 0) {
				status = false;
				break;
			}
		}
		if (status) {
			System.out.println("given number is prime");
		} else {
			System.out.println("given number is not prime");
		}

		// write a program to reverse the given number
		int temp = 0;
		while (num != 0) {
			int r = num % 10;
			num = num / 10;
			temp = temp * 10 + r;
		}

		System.out.println("reverse of given number is " + temp);
	}
}
