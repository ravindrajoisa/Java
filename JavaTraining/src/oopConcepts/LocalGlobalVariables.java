/**
 * 
 */
package oopConcepts;

/**
 * @author ravindra
 *
 */
public class LocalGlobalVariables {

	String name = "Ravi";				// Global or Class variables
	int age = 25;
	
	public static void main(String[] args) {
		
		int i = 10;						// Local variable
		System.out.println(i);
		
	//	System.out.println(name); this will fail as String name is non static.
		LocalGlobalVariables lg = new LocalGlobalVariables(); // create an object to access the global variable.
		System.out.println(lg.name);
	}

	public void sum() {
		int i = 12;						// Local variables of sum()
		int j = 20;
		int age = 30;
	}
}
