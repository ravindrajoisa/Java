/**
 * 
 */
package javaBasics;

/**
 * 
 * @author ravindra
 *
 */
public class Singleton {

	/**
	 * Singleton - we can have only one object, we can instantiate only one object.
	 * On trying to create a new object with different reference, it will point to the same object. 
	 * Design of singleton class:
	 * 1. make a private constructor
	 * 2. Lazy initialization - write a public static method that has a return type of object of this singleton class.
	 * Singleton patterns are used in logging, caches, thread pools, configuration settings, device driver objects.
	 */
	
	private Singleton() {							//private constructor
		str = "ravindra";
	}
	
	private static Singleton s = null;				
		String str;
	
	public static Singleton getInstance() {			//lazy initialization
		if (s == null)
			s = new Singleton();
			return s;
		}
	
	public static void main(String[] args) {
		
		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();
		
		x.str = (x.str).toUpperCase();
		
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
		System.out.println("******");
		
		z.str = (z.str).toLowerCase();
		
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
	}

}
