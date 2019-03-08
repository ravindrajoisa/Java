/**
 * 
 */
package javaBasics;

/**
 * @author ravin
 *
 */
public class PrimeNumber {

	/**
	 * 2 is the lowest prime number
	 */
	
	public static boolean isPrime(int num) {
		if (num<=1) {
			return false;
		}
		
		for (int i=2; i<num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("234231 is a prime?: "+isPrime(234231));

	}

}