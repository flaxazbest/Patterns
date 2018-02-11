package behavioral.chainofresponsibility;

import java.util.Scanner;

public class ChainClient {

    public static void main(String[] args) {
        CashDispenser dispenser = new CashDispenser(100);
        dispenser.setNextDispenser(new CashDispenser(50));
        dispenser.setNextDispenser(new CashDispenser(20));
        dispenser.setNextDispenser(new CashDispenser(10));
        dispenser.setNextDispenser(new CashDispenser(5));
        dispenser.setNextDispenser(new CashDispenser(2));
        dispenser.setNextDispenser(new CashDispenser(1));

        int amount = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw: ");
        amount = in.nextInt();

        dispenser.dispense(amount);
        in.close();
    }

}
