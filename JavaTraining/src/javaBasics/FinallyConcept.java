/**
 * 
 */
package javaBasics;

/**
 * @author ravin
 *
 */
public class FinallyConcept {

	/**
	 * finally block always used with try-catch
	 * finally will be executed irrespective of the exception, even if it doesnt occur.
	 */
	public static void main(String[] args) {
		test1();
		test2();
		division();
	}

	public static void test1() {
		try {
			System.out.println("inside test1 method");
			throw new RuntimeException("test");
		} catch(Exception e) {
			System.out.println("catch block");
		}
		finally {
			System.out.println("finally block");
		}
		System.out.println("**********");
	}
	
	
	public static void test2() {
		try {
			System.out.println("test 2");
		}
		finally {
			System.out.println("finally block in test 2");
		}
		System.out.println("******************");
	}
	
	public static void division() {
		int i = 100;
		try {
			int j = i/100;
		} catch(NullPointerException e){			//gives ArithmeticException 
			System.out.println("divide by zero exception");
		}
		finally {
			System.out.println("finally after exception");
		}
	}
	
	
}
