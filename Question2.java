/* Q.2 Create an abstract class called "BankAccount" with attributes such as account number and balance, 
 * and abstract methods called "deposit" and "withdraw". 
 * Create a subclass called "CheckingAccount" that inherits from BankAccount and implements the "deposit" and "withdraw" methods.
 *  Create an object of the CheckingAccount class and call both the "deposit" and "withdraw" methods.*/

package lab;

abstract class BankAccount //abstract class
{
	long accountno = 123456789;
	double balance = 40000;
	abstract void  deposit(); //abstract methods
	abstract void withdraw(); //abstract methods
}
class CheckingAccount extends BankAccount //child class 1
{

	@Override
	void deposit() 
	{
		System.out.println("Account number is:- "+ accountno);	
	}

	@Override
	void withdraw() {
		System.out.println("Balance is:- "+ balance);
		
	}}
	
public class Question2 {

	public static void main(String[] args) {
		CheckingAccount c = new CheckingAccount();
		c.deposit();
		c.withdraw();
	}

}
