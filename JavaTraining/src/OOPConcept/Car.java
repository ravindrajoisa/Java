/**
 * 
 */
package OOPConcept;

/**
 * @author ravindra
 *
 */
public class Car {
	
	int mod; //model
	int wheel;
	
	public static void main(String[] args) {
	
		Car a = new Car();	
		// a,b,c is the object reference variables and is representing these objects. This is not an object.
		Car b = new Car();	
		// new Car() >> is an object.
		Car c = new Car();	
		// use 'new' keyword to create a new object.

		a.mod = 2015;
		a.wheel = 4;
		
		b.mod = 2019;
		b.wheel = 3;
		
		c.mod = 2017;
		c.wheel = 4;
		
		System.out.println(a.mod);
		System.out.println(a.wheel);
		
		System.out.println(c.wheel);
	
	}

}
