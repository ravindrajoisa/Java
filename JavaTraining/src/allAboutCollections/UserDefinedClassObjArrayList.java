/**
 * 
 */
package allAboutCollections;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author ravindra
 *
 */
public class UserDefinedClassObjArrayList {

	public static void main(String[] args) {
		
		int a[] = new int[3]; //static array with fixed size. So, use dynamic array or ArrayList
		// System.out.println(3);  >> ArrayIndexOutOfBoundException
		
		ArrayList ar = new ArrayList();
		
		ar.add(10);
		ar.add(20);
		ar.add(40);		
		ar.add("Test");					// non generic
		System.out.println(ar.size());
	
		ar.add(40);						// can contain duplicate values
		System.out.println(ar.size()); 
		System.out.println(ar.get(2)); //allows random access, will get the value at an index
		System.out.println("***********");
		//Synchronized - not thread safe and is slow.
		//Maintains insertion order.
		
		for (int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		//generic vs non generic; after jdk1.5
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>(); 	//generics; using integer here
		ar1.add(100);
		// ar1.add("Tree"); Not allowed
		
		ArrayList<String> ar2 = new ArrayList<String>();	// generics; using String
		ar2.add("Tyre");
		
	//	ArrayList<E> ar3 = new ArrayList<E>(); 				// use E when you don't know the datatype; rarely used.
		
		Employee e1 = new Employee("Ravi",34,"Engg");		//Employee class objects
		Employee e2 = new Employee("Ram",30,"Dev");			//User defined class object arrayList
		Employee e3 = new Employee("Sandy",24,"QA");
		
		//create generic ArrayList of Employee Objects
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		//Iterator 
		Iterator<Employee> it = al.iterator(); // to traverse for loop cannot be used as its an object.
		while(it.hasNext()) {
		Employee emp = it.next();
		System.out.println(emp.name);
		System.out.println(emp.age);
		System.out.println(emp.dept);
		System.out.println("******");
		}
	
	//addAll()
	ArrayList<String> a1 = new ArrayList<String>();
	a1.add("India");
	a1.add("Australia");
	a1.add("UK");
	
	ArrayList<String> a2 = new ArrayList<String>();
	a2.add("IND");
	a2.add("AUS");
	a2.add("UK");
	
	a1.addAll(a2);
	
	for(int i=0; i<a1.size(); i++) {
		System.out.println(a1.get(i));
	}	
	System.out.println("********");
	//removeAll()	
		a1.removeAll(a2);
		
	for(int j=0; j<a1.size(); j++) {
		System.out.println(a1.get(j));
	}	
	System.out.println("********");
	
	//retainAll() will retain only the common once. o/p: UK
	}
}
