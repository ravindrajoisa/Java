/**
 * 
 */
package oopConcepts;

/**
 * @author ravindra
 *
 */
public class MethodsInJava {
	
	public static void main(String[] args) { // main method - start point of execution
				
	/* Note: 
	 * 	Main method is always void. main() will never have a return type as it never returns.
	 */
		
		MethodsInJava obj = new MethodsInJava();// to call the below methods, create an object
												// Copy of all non static methods will be given to this object.
		obj.test();
		int l = obj.pqr();
		System.out.println(l);
		
		String s1 = obj.qa();
		System.out.println(s1);
		
		int d = obj.division(30, 15);
		System.out.println(d);
		
	}
	// non static methods
	
	public void test() {					// void doesn't return anything
		System.out.println("test method");	// no input; no output	
	}
		
	public int pqr() {						// int is the return type
		System.out.println("PQR method");	// no input; some output	
		int a = 10;
		int b = 20;
		int c = 30;
		return c;
	}
	
	public String qa() {					// no input, some output
		System.out.println("qa method");
		String s = "Selenium";
		return s;
	}
	
	public int division(int x, int y) { 	// input arguments
		System.out.println("division method");
		int d = x/y;
		return d;
	}
}
