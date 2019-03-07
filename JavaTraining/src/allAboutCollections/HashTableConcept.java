/**
 * 
 */
package allAboutCollections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

/**
 * @author ravindra
 *
 */
public class HashTableConcept {

	/**
	 * HashTable is synchronized, thread safe.
	 * stores <key, value> pair; 
	 * Key>>Object and Value>>HashCode(32bit Integer - Unique number provided by JVM, except for cloning).
	 * Null key and values are not allowed - gives NullPointerException in Hashtable which is not the case with Hashmap.
	 */
	public static void main(String[] args) {
		
		Hashtable h1 = new Hashtable();
		h1.put(1, "Ravi");
		h1.put(2, "Kris");
		h1.put(3, "Guru");
		
		Hashtable h2 = new Hashtable();
		
		h2 = (Hashtable)h1.clone();
		
		System.out.println("Values from h1" + h1);
		System.out.println("Values from h2" + h2);
		
		h1.clear();
		System.out.println("Values from h1" + h1);
		System.out.println("Values from h2" + h2);
		
		//contains value:
		
		Hashtable h3 = new Hashtable();
		h3.put("A", "Dev");
		h3.put("B", "QA");
		h3.put("C", "DevOps");
		
		if(h3.containsValue("DevOps")) {
			System.out.println("DevOps found");
		}
		//print all values from hashtable using Enumeration - elements()
		
		Enumeration e = h3.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		System.out.println("*****");
		
		//get all values from hashtable using entrySet() - set of hashtable values:
		Set s = h3.entrySet();
		System.out.println(s);
	
		System.out.println(h3.get("C")); // to get value from a key
		
		System.out.println(h3.hashCode()); // to get hashcode from hashtable object
		
	}

}
