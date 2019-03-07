/**
 * 
 */
package javaBasics;

/**
 * @author ravin
 *
 */
public class FinalizeConcept {

	/**
	 * Used in garbage collection
	 */
	public static void main(String[] args) {
		
		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		
		f1=null;	//garbage collected; blank object without reference.
		//f2=null;
		
		System.gc(); //manually call the garbage collector.

	}

	// for cleanup processing, the finalize method is auto called just before garbage collection.
	
	public void finalize() {
		System.out.println("finalize method");
	}
}
