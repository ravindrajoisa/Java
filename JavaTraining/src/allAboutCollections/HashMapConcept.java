/**
 * 
 */
package allAboutCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author ravindra
 *
 */
public class HashMapConcept {

	public static void main(String[] args) {
		//HashMap contains only unique elements
		//implements Map interface
		//extends AbstractMap
		//may have one null key and multiple null values
		//has no order
		//hashMap can be accessed by all the threads for better performance. It is non-synchronised.
		//not thread safe - it goes to "fail-fast" condition; Concurrent Modification Exception occurs.
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Selenium");
		hm.put(2, "qtp");
		hm.put(3, "test");
		hm.put(4, "Appium");
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(5));
		
		for(Entry e : hm.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
		System.out.println(hm);	
		hm.remove(3); //key will be removed, but will not shift the values.
		System.out.println(hm);
	
		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
		
		Employee e1 = new Employee("Ravi", 34, "admin");
		Employee e2 = new Employee("Avi", 33, "Manager");
		Employee e3 = new Employee("Ram", 35, "Dev");
	
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		//traverse the hashmap
		
		for(Entry<Integer, Employee> n : emp.entrySet()) {
			int k = n.getKey();
			Employee m = n.getValue();
			
			System.out.println("Employee "+k+" Info:");
			System.out.println(m.name+" "+m.age+" "+m.dept);
		}
	}

}
