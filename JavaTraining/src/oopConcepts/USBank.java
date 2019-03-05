package oopConcepts;

/*
 * @author: ravindra
 */

public interface USBank {
	
	int minbal = 1000;	//min balance

	public void credit();		//only method declaration in an interface and no method body.
	public void debit();
	public void transferMoney();
	
	//you can declare variables in an interface, and it remains static. Values remain constant.
	//no static method allowed in an interface.
	//no main method in an interface.
	//interface is abstract in nature and an object cannot be created.
}
