/**
 * 
 */
package javaBasics;

/**
 * @ravindra
 *
 */
public class AmstrongNumber {

	/**
	 *153 is an armstrong number.
	 *1*1*1 = 1
	 *5*5*5 = 125
	 *3*3*3 = 27
	 *1+125+27 = 153
	 */
	
	public static void isArmstrongNumber(int num) {
		int cube = 0;
		int r;
		int t;
		
		t=num;
		
		while(num>0) {
			r = num%10;
			num = num/10;
			cube = cube+(r*r*r);
		}
		if(t==cube) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not an Armstrong Number");
		}
	}
	
	
	public static void main(String[] args) {
	
		isArmstrongNumber(154);
	}

}
