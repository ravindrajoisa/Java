
package OOPConcept;

/**
 * @author ravindra
 *
 */
public class Cars {
	
	int mod; //model
	int wheel;
	
	public static void main(String[] args) {
	
		Cars a = new Cars();	
		Cars b = new Cars();	
		Cars c = new Cars();	

		a.mod = 2015;
		a.wheel = 4;
		
		b.mod = 2019;
		b.wheel = 3;
		
		c.mod = 2017;
		c.wheel = 4;
	
		//Shifting of one object reference to another.
		
		a=b;
		b=c;
		c=a;
	
		a.mod = 10;
		System.out.println(a.mod);
		c.mod = 20;
		System.out.println(a.mod);
		System.out.println(c.mod);
		
	}

}
