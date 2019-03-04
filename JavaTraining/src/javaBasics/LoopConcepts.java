/**
 * 
 */
package javaBasics;

/**
 * @author ravindra
 *
 */
public class LoopConcepts {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//while loop; 
		
		int i =1;			//initialization
		while (i<=10) {		//condition
			System.out.println(i);
			i++; // increment; disadvantage: if this increment were not to be present, it will go to infinite loop.
		}
		System.out.println("**********");
		// for loop
		
		for (int j=1; j<=10; j++) {		//initialization, condition, increment
			System.out.println(j);
		}
		
		System.out.println("***********");
		for (int k=10; k>=1; k--) {
			System.out.println(k);
		}
	}

}
