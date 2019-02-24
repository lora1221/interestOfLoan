package interestOfLoan;
import java.util.Scanner;

public class interestOfLoan {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double money = 1.0;
        int month = 1;
        double interest_rate = 1.0;

        System.out.print("Enter investment amount: ");
        money = keyboard.nextDouble();
        System.out.print("Enter number of month: ");
        month = keyboard.nextInt();
        System.out.print("Enter annual interest rate in percentage: ");
        interest_rate = keyboard.nextDouble();

        double total_interest = 0;
        for (int i = 0; i < month; i ++) {
            total_interest = money * (interest_rate/100)/12 * month;
        }
        System.out.println("Total interest: " + total_interest);
    }
}
