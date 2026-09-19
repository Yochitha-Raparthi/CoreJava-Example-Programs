import java.util.Scanner;
public class BankAccount {
    static int amount;
    static void depositAmount(int amt) {
    	amount=amt;
    	System.out.println("Deposit amount is : "+amt);
    }
    static void withdrawAmount(int amt) {
    	System.out.println("Withdraw amount is : "+amt);
    	amount=amount-amt;
    }
    static int balance() {
    	   return amount;
    }
	public static void main(String[] args) {
//		deposit(500);
//		withdraw(200);
//		System.out.println("Remaining balance is : "+amount);
		Scanner sc=new Scanner(System.in);
		int deposit=sc.nextInt();
		depositAmount(deposit);
		int withdraw=sc.nextInt();
		withdrawAmount(withdraw);
		System.out.println("balance amount is " +balance());
        
	}

}
