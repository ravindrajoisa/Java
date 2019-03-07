/**
 * 
 */
package javaBasics;

/**
 * @author ravin
 *
 */
public class FinalConcept {

	public static void main(String[] args) {
		
		final int i = 10; //used to declare constant values.
		//i = 20;		// as i is final this is not allowed.
		
		/* final keyword is used in constant values to prevent inheritance, make the class final.
		 * By doing so, method overriding isn't possible.
		 */
		System.out.println(i);
	}

}
