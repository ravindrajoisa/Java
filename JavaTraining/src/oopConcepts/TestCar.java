/**
 * 
 */
package oopConcepts;

/**
 * @author ravindra
 *
 */
public class TestCar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//compile time polymorphism 
		Jeep j = new Jeep();
		/* When parent and child have the same method(), the child method will be used.
		 * Provided, the methods have the same name and same number of arguments.
		 */
		
		j.fuel();
		j.stop();
		j.safty();

		System.out.println("********");
		
		AutoInherit a = new AutoInherit();
		a.start();
		a.stop();
		a.fuel();
		// a.safety(); >> is not allowed as Jeep is a child.
		
		AutoInherit c = new Jeep(); // Dynamic or runtime polymorphism; Top Casting
		// c.safety(); not allowed.
		c.start();
		c.fuel();
		c.stop();
		
		Jeep o = (Jeep) new AutoInherit();  //Casting - Exception: java.lang.ClassCastException
		//compile time works, but run time it throws an exception as the java gets confused.
		
	}

}
