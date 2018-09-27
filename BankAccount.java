/**
 * 
 * @author rlong19
 *
 */
public class BankAccount 
{
	private String name;
	private int accNum;
	private double balance;
	public BankAccount()
	{
		name= "Ryan";
		accNum= 12345;
		balance= 100000
	}
	public BankAccount(String a, int b, 0)
	{
		name= a;
		accNum= b;
	}
	public BankAccount(String a, int b, double c)
	{
		name= a;
		accNum= b;
		balance= c;
	}
	public void deposit(double deposit)
	{
		balance= balance-deposit
	}
	public double getBalance()
	{
		return balance
	}
	public String toString()
	{
		return "Balance: " + balance;
		return "\n Name: " + name; 
		return "\n Account Number: " + accNum
	}
	
}
https://github.com/roonleng/BankAccount/wiki