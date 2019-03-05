/**
 * 
 */
package oopConcepts;

/**
 * @author ravindra
 *
 */
public class Jeep extends AutoInherit { // "has-a" relationship
	
	public void safty() {					//over riding - same method present in parent with same set of arguments.
		System.out.println("Car_Saftey");
	}
	
	public void fuel() {
		System.out.println("Fuel.. Xtra power");
	}

}
