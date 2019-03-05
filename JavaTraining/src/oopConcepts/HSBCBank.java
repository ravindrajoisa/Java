/**
 * 
 */
package oopConcepts;

/**
 * @author ravindra
 *
 */
public class HSBCBank implements USBank, BrazilBank { // multiple inheritance. Also called "is-a" relation.
	
	//It is mandatory to define/override all the methods of an interface, when the class implements an interface.

	//overridden methods
	public void credit() {
		System.out.println("HSBC Credit");
	}

	public void debit() {
		System.out.println("HSBC Debit");
	}

	public void transferMoney() {
		System.out.println("HSBC TransferMoney");		
	}
	//own methods
	public void educationLoan() {
		System.out.println("HSBC Student Loan");
	}

	public void carLoan() {
		System.out.println("HSBC Car Loan");
	}

	// overriding from BrazilBank interface.
	public void mutualFund() {
		System.out.println("Brazil bank Mutual Fund");
		
	}
	
}
