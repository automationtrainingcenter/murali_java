package exceptions;

public class UncheckedExceptionsDemo{
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 4, 6, 9, 8, 99 };
		System.out.println(arr.length);
		String s1 = "surya";
		try {
			System.out.println(arr[0]);
			System.out.println(10 / 10);
			System.out.println("lenght is "+s1.length());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("exception message is " + e.getMessage());
			System.out.println("array index must be less than " + arr.length);
		} catch (ArithmeticException e) {
			System.out.println("division by 0 is not possible");
		} catch (Exception e) {
			System.out.println("got an exception "+e.getClass());
		}finally {
			System.out.println("inside the finally block");
		}

		System.out.println("********************");
	}

}
