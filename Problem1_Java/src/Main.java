// Sumner Bradley
// 9/11/18

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Make first customer
        Customer customer = new Customer();
        Scanner reader = new Scanner(System.in);

        // Get customer info
        System.out.print("Input a account balance:");
        customer.setBalance(reader.nextInt());

        System.out.print("Input a credit limit:");
        customer.setCreditLimit(reader.nextInt());

        System.out.print("Input amount charged:");
        customer.setChargesApplied(reader.nextInt());

        System.out.print("Input a applied credits:");
        customer.setCreditsApplied(reader.nextInt());

        customer.printNewBalance();
    }
}
