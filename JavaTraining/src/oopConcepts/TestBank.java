/**
 * 
 */
package oopConcepts;

/**
 * @author ravindra
 *
 */
public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USBank.minbal);
		// USBank.minbal = 200; >> not allowed, as minbal is declared in interface and the value cannot be changed.

		// USBank b = new USBank(); >> not allowed as USBank is an interface.
		
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationLoan();
		hs.carLoan();
		hs.mutualFund();
		//dynamic polymorphism
		
		USBank b = new HSBCBank();
		b.credit();		// allows only overridden methods
		b.debit();
		b.transferMoney();
		
	//	b.educationLoan() >> not allowed
	
	
	}
}
