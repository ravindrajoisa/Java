/**
 * 
 */
package javaBasics;

/**
 * @author ravindra
 *
 */
public class StringConcatenation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int a = 100;
		int b = 200;
		
		String x = "Hello";
		String y = "Man";
		
		double c = 34.55;
		double d = 23.00;
		
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y+a+x+b+y); //left to right execution
		System.out.println(a+b+x+y+a+b);
		System.out.println(c+d);
		System.out.println(x+y+c+d);
		System.out.println("Hello Dude");
		System.out.println("The value of d is "+d); 
		System.out.println("The value of d is "+c+d); 
		System.out.println("The value of d is "+(c+d)); 
		System.out.print("Hello Gal"); //same line
		System.out.println("Hello Bro"); // next line
	
	}

}
