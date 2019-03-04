/**
 * 
 */
package javaBasics;

/**
 * @author ravindra
 *
 */
public class IncrementDecrementOperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int i = 1;
		System.out.println(i);
		int j = i++;			// post increment
		System.out.println(j);
		System.out.println(i);

		System.out.println("**********");
		
		int a = 1;
		System.out.println(a);
		int b = ++a;			// pre increment
		System.out.println(b);
		System.out.println(a);
		
		System.out.println("***********");
		
		int m = 2;
		System.out.println(m);
		int n = m--;			//post decrement
		System.out.println(n);
		System.out.println(m);
		
		System.out.println("***********");
		
		int p =2;
		System.out.println(p);
		int q = --p;			// pre decrement
		System.out.println(q);
		System.out.println(p);
		
	}

}
