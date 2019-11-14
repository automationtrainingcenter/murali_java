package basics;

/*
 * Array is a collection of values of similar data type of fixed size. Arrays will store the information in
 * continuous memory locations. We can access array data by index values and this index value starts
 * with 0.
 * 
 * Advantages of arrays over normal variables
 * 1. We can easily store multiple values using single array variable
 * 2. Array data can be accessed easily
 * 3. Sorting and searching of data is easy
 * 
 * There are two types of arrays
 * 1. 1-D arrays
 * 		which will have one row and multiple columns of data
 * 		
 * 		
 * 		//declaration
 * 		data_type[] var_name = new data_type[length];
 * 
 * 		//assigning data
 * 		var_name[index] = value;
 * 
 * 		//retrieve data
 * 		var_name[index];
 * 
 * 		//initialize
 * 		data_type[] var_name = {value0, value1, value2 .... valueN}
 * 		
 * 2. 2-D arrays
 * 		which will store data in multiple rows and multiple columns
 * 		//declaration
 * 		data_type[][] var_name = new data_type[row_length][column_length];
 * 	
 * 		//assign data
 * 		var_name[row_index][column_index] = value;
 * 
 * 		//retrieve data
 * 		var_name[row_index][column_index];
 * 
 * 		//initialize
 * 		data_type[][] var_name = {{r0v1, r0v2, r0v3 ... r0vN},
 * 								  {r1v1, r1v2, r1v3 ... r1vN },
 * 								 
 * 								  {rMv1, rMv2, rMv3 ... rMvN}}
 */
public class ArraysDemo {
	public static void main(String[] args) {
		// creating a 1D array
		// declaration
		int[] marks = new int[6];

		// storing data inside the array
		marks[0] = 12;
		marks[1] = 15;
		marks[2] = 18;
		marks[3] = 19;
		marks[4] = 17;
		marks[5] = 16;

		// retrieving data from an array
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);
		System.out.println(marks[5]);

		// initialization
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

		System.out.print(vowels[0] + "\t");
		System.out.print(vowels[1] + "\t");
		System.out.print(vowels[2] + "\t");
		System.out.print(vowels[3] + "\t");
		System.out.println(vowels[4]);

		// find the number of values in an array
		System.out.println(vowels.length);

		// 2D arrays
		// declaration
		int[][] m1 = new int[3][3];

		// storing data inside the 2d array
		// first row
		m1[0][0] = 1;
		m1[0][1] = 2;
		m1[0][2] = 3;
		// second row
		m1[1][0] = 4;
		m1[1][1] = 5;
		m1[1][2] = 6;
		// third row
		m1[2][0] = 7;
		m1[2][1] = 8;
		m1[2][2] = 9;

		// retrieve the data and print on the console
		// first row data
		System.out.print(m1[0][0] + " ");
		System.out.print(m1[0][1] + " ");
		System.out.print(m1[0][2] + "\n");
		// second row data
		System.out.print(m1[1][0] + " ");
		System.out.print(m1[1][1] + " ");
		System.out.print(m1[1][2] + "\n");
		// third row
		System.out.print(m1[2][0] + " ");
		System.out.print(m1[2][1] + " ");
		System.out.print(m1[2][2] + "\n");

		// Initialization
		int[][] m2 = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };

		// Retrieve the data
		System.out.print(m2[0][0] + "\t");
		System.out.print(m2[0][1] + "\t");
		System.out.print(m2[0][2] + "\n");
		System.out.print(m2[1][0] + "\t");
		System.out.print(m2[1][1] + "\t");
		System.out.print(m2[1][2] + "\n");
		System.out.print(m2[2][0] + "\t");
		System.out.print(m2[2][1] + "\t");
		System.out.print(m2[2][2] + "\n");

		// 2D array is nothing but an array of multiple 1D arrays and every 1D array in
		// 2D array represents 1 row and these can have unequal number of columns also
		// unequal number of columns in 2D array
		int[][] m3 = { { 1, 4, 8 }, { 9, 7, 3, 5 }, { 1, 0, 4, 2, 7 } };
		
		System.out.println("number of rows in m3 "+m3.length);
		
		System.out.println("number of columns in 1st row"+m3[0].length);
		System.out.println("number of columns in 2nd row"+m3[1].length);
		System.out.println("number of columns in 3rd row"+m3[2].length);
		
		System.out.print(m3[0][0]+" ");
		System.out.print(m3[0][1]+" ");
		System.out.print(m3[0][2]+"\n");
		//****************************************
		System.out.print(m3[1][0]+" ");
		System.out.print(m3[1][1]+" ");
		System.out.print(m3[1][2]+" ");
		System.out.print(m3[1][3]+"\n");
		//****************************************
		System.out.print(m3[2][0]+" ");
		System.out.print(m3[2][1]+" ");
		System.out.print(m3[2][2]+" ");
		System.out.print(m3[2][3]+" ");
		System.out.print(m3[2][4]+"\n");
		
	}

}
