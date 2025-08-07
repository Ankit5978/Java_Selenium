package training;
import java.util.Scanner;

public class employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);

	        System.out.print("Enter employee name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter employee ID: ");
	        int id = sc.nextInt();

	        System.out.print("Enter initial balance: ");
	        double balance = sc.nextDouble();

	        // Deposit
	        System.out.print("Enter amount to deposit: ");
	        double deposit = sc.nextDouble();
	        balance += deposit;
	        System.out.println("Deposited ₹" + deposit);
	        System.out.println("Balance after deposit: ₹" + balance);

	        
	        System.out.print("Enter amount to withdraw: ");
	        double withdraw = sc.nextDouble();

	        if (withdraw <= balance) {
	            balance -= withdraw;
	            System.out.println("Withdrawn ₹" + withdraw);
	        } else {
	            System.out.println(" Not enough balance! Withdrawal failed.");
	        }

	        System.out.println("Remaining Balance: ₹" + balance);

	        System.out.println("\n--- Employee Details ---");
	        System.out.println(" Name    : " + name);
	        System.out.println(" ID      : " + id);
	        System.out.println("Final Balance : ₹" + balance);

	        sc.close();
	}

}
