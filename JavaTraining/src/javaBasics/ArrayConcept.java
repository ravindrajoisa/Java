/**
 * 
 */
package javaBasics;

/**
 * @author ravindra
 *
 */
public class ArrayConcept {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Array is to store similar data type values in an array variable.
		/* Disadvantage: 
		 * 1. Fixed size - static array. >> Use Dynamic Array >> Collections - ArrayList, HashTable
		 * 2. stores similar data type. >> Use object array.
		 */
		
		// int array
		int i[] = new int[4];
		i[0] = 10;			//lowest bound; index = 0
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;			//upper bound; index = n-1
		
		System.out.println(i[2]);
	//	System.out.println(i[4]);	//Exception: java.lang.ArrayIndexOutOfBoundsException
		System.out.println(i.length);
		
		// Use for loop to print all the values of an array
		for (int j=0;j<i.length; j++) {
			System.out.println(i[j]);
		}
		
		// Double Array: 
		
		double d[] = new double[3];
		d[0] = 12.12;
		d[1] = 13.11;
		d[2] = 24.93;
		System.out.println(d[2]);
			
		// char array
		
		char c[] = new char[3];
		c[0] = 'r';
		c[1] = 2;
		c[2] = '$';
		System.out.println(c[2]);
		
		//boolean array
		
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;
		
		//string array
		
		String s[] = new String[3];
		s[0] = "Bro";
		s[1] = "Dude";
		s[2] = "Cool";
		System.out.println(s.length);
		System.out.println(s[1]);
		
		//Object Array (super class) >> Object array is used to store different data type values.
		Object ob[] = new Object[6];
		ob[0] = "Ravi";
		ob[1] = 9;
		ob[2] = 12.87;
		ob[3] = "2/2/2019";
		ob[4] = 'R';
		ob[5] = "India";
		System.out.println(ob[5]);
		System.out.println(ob.length);
	}

}
