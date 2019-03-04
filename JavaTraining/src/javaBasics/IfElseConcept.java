/**
 * 
 */
package javaBasics;

/**
 * @author ravindra
 *
 */
public class IfElseConcept {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int a = 50;
		int b = 20;
		
		if (b>a) {
			System.out.println("b is greater");
		}
		else {
			System.out.println("a is greater");
		}
		
		// comparison operators.
		
		int c = 50;
		int d = 90;
		
		if (c == d) {   // double equal
			System.out.println("both are equal");
		}else
		{
			System.out.println("both are not equal");
		}
		
		//login to find the highest number.
		
		int a1 = 500;
		int a2 = 800;
		int a3 = 300;
		//use nested if else
		
		if (a1>a2 & a1>a3) {
			System.out.println("a1 is the highest");
		}
		else if (a2>a3) {
			System.out.println("a2 is the highest");
		}
		else {
			System.out.println("a3 is the highest");
		}

	}

}
