/**
 * BankDemo
 * Demonstrates creation and use of BankAccount with basic exception handling.
 */
public class BankDemo {
    public static void main(String[] args) {
        System.out.println("=== BankDemo ===");
        try {
            BankAccount checking = new BankAccount(200.00);
            System.out.println(String.format("Opened account with $%.2f", checking.getBalance()));

            checking.deposit(150.00);
            checking.withdraw(50.00);

            // This will throw due to insufficient funds
            try {
                checking.withdraw(1000.00);
            } catch (IllegalArgumentException ex) {
                System.out.println("Caught expected error: " + ex.getMessage());
            }

            // This will throw due to invalid deposit
            try {
                checking.deposit(0.0);
            } catch (IllegalArgumentException ex) {
                System.out.println("Caught expected error: " + ex.getMessage());
            }

            System.out.println(String.format("Final balance: $%.2f", checking.getBalance()));
        } catch (IllegalArgumentException ex) {
            System.out.println("Failed to create account: " + ex.getMessage());
        }
    }
}
