package training;

import java.util.Scanner;

public class atmtracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter number of ₹2000 notes: ");
        int notes2000 = scanner.nextInt();

        System.out.print("Enter number of ₹500 notes: ");
        int notes500 = scanner.nextInt();

        System.out.print("Enter number of ₹100 notes: ");
        int notes100 = scanner.nextInt();

       
        int total = (notes2000 * 2000) + (notes500 * 500) + (notes100 * 100);

    
        System.out.println("\n ATM Balance Summary ");
        System.out.println("₹2000 notes: " + notes2000 + " = ₹" + (notes2000 * 2000));
        System.out.println("₹500 notes : " + notes500 + " = ₹" + (notes500 * 500));
        System.out.println("₹100 notes : " + notes100 + " = ₹" + (notes100 * 100));
        System.out.println("------------------------------");
        System.out.println("Total Balance: ₹" + total);

        scanner.close();
    }
}
