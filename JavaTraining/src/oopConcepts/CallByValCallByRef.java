/**
 * 
 */
package oopConcepts;

/**
 * @author ravindra
 *
 */
public class CallByValCallByRef {

	int p;
	int q;
	public static void main(String[] args) {
		CallByValCallByRef obj = new CallByValCallByRef();
		int x=10;
		int y=20;
		int z = obj.testSum(x,y); // call by/pass by value. Copy is given and not the original value.
		System.out.println(z);
		
		obj.p = 50;
		obj.q = 40;
		
		obj.swap(obj);			//after swap
		System.out.println(obj.p);
		System.out.println(obj.q);
	}
	
	public int testSum(int a, int b) {
		a = 40;
		b = 20;
		int c = a+b;
		return c;
	}
	
	public void swap(CallByValCallByRef t) { //call by reference 
		int temp;
		temp = t.p;
		t.p = t.q;
		t.q = temp;		
	}
}
