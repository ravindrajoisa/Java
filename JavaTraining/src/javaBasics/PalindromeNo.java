/**
 * 
 */
package javaBasics;

/**
 * @author ravindra
 *
 */
public class PalindromeNo {

	/**
	 * Palindrom Number. Ex: 121; 23432
	 */
	
	public static void isPalindro(int num) {
		
		int r = 0;
		int sum = 0;
		int t=num;
		
		while(num>0) {
			r= num%10;		//get the reminder
			sum = (sum*10)+r;
			num = num/10;
		}
		
		if(t==sum) {
			System.out.println("palindrome");
		}else {
			System.out.println("is not a palindrome");
		}
	}
	
	public static void main(String[] args) {
	
		isPalindro(34543);

	}

}
