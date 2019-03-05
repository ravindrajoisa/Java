/**
 * 
 */
package oopConcepts;

/**
 * @author ravindra
 *
 */
public class WrapperClass {

	public static void main(String[] args) {
		
		String x = "100";
		System.out.println(x+20);
		
		//String to int
		
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		// String to Double
		String y = "34.52";
		double d = Double.parseDouble(y);
		System.out.println(d+10);
		
		//String to boolean
		String k = "true";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);
		
		//String to int conversion
		int j = 200;
		String s = String.valueOf(j);
		System.out.println(s);
		
		String w = "100wow";
		Integer.parseInt(w); //java.lang.NumberFormatException.forInputString(Unknown Source)
		
	}

}
