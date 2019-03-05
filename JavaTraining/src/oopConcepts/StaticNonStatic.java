/**
 * 
 */
package oopConcepts;

/**
 * @author ravindra
 *
 */
public class StaticNonStatic {
								// gobal variables
	String name = "Ravi";		// non static 
	static int age = 34;		// static
	
	public static void main(String[] args) {
		//2 ways of calling static methods and vars.
		sum();
		//or
		StaticNonStatic.sum();
		
		System.out.println(age);
		System.out.println(StaticNonStatic.age);
		
		StaticNonStatic sn = new StaticNonStatic();
		/* Note:
		 * When an object is created, static methods and vars are not a part of object.
		 */
		sn.sendMail();
		System.out.println(sn.name);
		sn.sum();    // this works, but not recommended. You can call directly. Unnecessary waste of memory.
	}

	public void sendMail() {			// non static
		System.out.println("Non-static mail");
	}
	
	public static void sum() {			// static
		System.out.println("Static sum");
	}
}
