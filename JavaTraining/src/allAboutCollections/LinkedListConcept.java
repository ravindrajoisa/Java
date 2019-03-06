/**
 * 
 */
package allAboutCollections;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author ravindra
 *
 */
public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> lt = new LinkedList<String>();
		
		//add:
		lt.add("test");
		lt.add("Java");
		lt.add("QTP");
		lt.add("selenium");
		
		System.out.println("Content of linked list:"+lt );
		
		lt.addFirst("RFT");		//addFirst
		lt.addLast("Go");		//addLast
		System.out.println("Content:"+ lt);
	
		System.out.println(lt.get(1));	//get
		
		lt.set(2,"Webdriver");			//set
		System.out.println(lt.get(2));
		
		// lt.remove(0); instead of mentioning index, use the following to remove first and last element
		lt.removeFirst();
		lt.removeLast();
		lt.remove(2);
		System.out.println("Content of linked list:"+lt );
		System.out.println("*******");
		//iterate all the elements
		
		// using for loop
		for (int n=0; n<lt.size(); n++) {
			System.out.println(lt.get(n));
		}
		
		System.out.println("*******");
		//advanced for loop
		for (String s : lt) {
			System.out.println(s);
		}
		
		System.out.println("****");
		//iterator
		Iterator<String> s = lt.iterator();
		while(s.hasNext()) {
			System.out.println(s.next());
		}
		
		System.out.println("*********");
		//while loop
		int num=0;
		while(lt.size()>num) {
			System.out.println(lt.get(num));
			num++;
		}
		
		
		
	}
}
