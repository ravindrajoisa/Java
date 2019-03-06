/**
 * 
 */
package javaBasics;

import java.util.Hashtable;

/**
 * @author ravindra
 *
 */
public class HashTableConcept {

	public static void main(String[] args) {
		Hashtable h = new Hashtable();
		h.put("R", "Ravi");
		h.put("G", "Google");
		h.put(1, 200);
		h.put(3, "Bing");
		
		System.out.println(h.size());
		System.out.println(h.get(2));
		System.out.println(h.get(1));
		System.out.println(h.get("R"));
		System.out.println(h.get(3));
		
		Hashtable<Integer, Integer> h1 = new Hashtable<Integer, Integer>();
		
		h1.put(5, 5);
	//	h1.put(6, "Mac"); not allowed
		System.out.println(h1.get(5));
	}

}
