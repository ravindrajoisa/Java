/**
 * 
 */
package javaBasics;

import java.util.ArrayList;

/**
 * @author ravindra
 *
 */
public class ArrayListConcept {
	
	public static void main(String[] args) {
	
		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add(200);
		ar.add(300);
		System.out.println(ar.size());
		ar.add("Ravi");
		ar.add(12.24);
		ar.add('R');
		System.out.println(ar.size());
		System.out.println(ar.get(4));
		//	System.out.println(ar.get(7)); Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 7, Size: 6
	
		for(int i =0; i <ar.size(); i++) {
			System.out.println(ar.get(i));
		}
	
		ArrayList<Integer> s = new ArrayList<Integer>();
		s.add(500);
		// s.add("Joisa"); no other argument other than integer is allowed.
		
		ArrayList<String> c = new ArrayList<String>();
		c.add("India");
		// c.add(350); not allowed.
	}


}
