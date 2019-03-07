/**
 * 
 */
package javaBasics;

/**
 * @author ravindra
 *
 */
public class ConstructorConcept {
	
	String name = "Sun";
	int age =1000;

	public ConstructorConcept() {	//no argument
		System.out.println("default constructor");
		
	}
/* 
 * Constructor
 * default hidden constructor is created.
 * no return type, it cannot return anything. It is not a method
 * no static keyword
 * same as class name
 * define some class features while creating an object
 * declare global variables here
 * constructor can be overloaded.
 */

	public ConstructorConcept(int i) {		//overloading 
		System.out.println("single paramater constructor");
		System.out.println("the value of i: "+ i);
	}
	
	public ConstructorConcept(int i, int j) {		//overloading 
		System.out.println("two paramaters constructor");
		System.out.println("the value of i: "+ i);
		System.out.println("the value of j: "+ j);
	}
	
	public ConstructorConcept(String name, int age) {		
		System.out.println("using this");
		System.out.println("String: "+ this.name);	//use "this" to use the global variable 
		//System.out.println("String: "+ super.name); //use "super" to use use the variables from the super class
		System.out.println("Age: "+ age);	// no need to use "this" to call the local variable.
	}
	public static void main(String[] args) {
		
		ConstructorConcept c = new ConstructorConcept();
		ConstructorConcept c1 = new ConstructorConcept(10);
		ConstructorConcept c2 = new ConstructorConcept(20,30);
		ConstructorConcept c3 = new ConstructorConcept("Ravi",30);
	}

}
