//Create an interface called "BankAccount" with methods called "deposit" and "withdraw". Create a class called "CheckingAccount" that 
//implements the BankAccount interface and implements the "deposit" and "withdraw" methods. Create an object of the CheckingAccount
//class and call both the "deposit" and "withdraw" methods.
import java.util.Scanner;
interface BankAccount
{
     public void deposite();
	 void withdraw();
}
class CheckingAmount implements BankAccount
{
	Scanner sc=new Scanner(System.in);
	long balance;
	CheckingAmount(long balance)
	{
		this.balance=balance;
	}
	public void deposite()
   {
       System.out.println("Enter amount of deposite:");
	   double dep=sc.nextDouble();
	   System.out.println("Deposited Amount"+dep);
	   System.out.println("total="+(dep+balance));
	   
   }
   public void withdraw()
   {
       System.out.println("Enter amount you want to withdraw:");
	   double wit=sc.nextDouble();
	   System.out.println("withdrawed Amount"+wit);
	   System.out.println("total="+(wit-balance));
   }
}
class UseAmount
{
    public static void main(String args[])
	{
	    CheckingAmount c1=new CheckingAmount(40000);
		c1.deposite();
		c1.withdraw();
	 }
}
	

