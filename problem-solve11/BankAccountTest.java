/**
 * BankAccountTest
 * A simple, self-contained test harness that prints
 * "++++ Passed" or "---- Failed" for each test.
 */
public class BankAccountTest {

    private static int passed = 0;
    private static int failed = 0;

    public static void main(String[] args) {
        System.out.println("=== BankAccountTest ===");
        testImplementsTransaction();
        testConstructorPositive();
        testConstructorNegative();
        testDepositPositive();
        testDepositNegative();
        testWithdrawPositive();
        testWithdrawInsufficientFunds();
        testWithdrawNegative();

        System.out.printf("%nRESULT: %d passed, %d failed%n", passed, failed);
    }

    private static void check(String name, boolean condition) {
        if (condition) {
            passed++;
            System.out.println("++++ Passed: " + name);
        } else {
            failed++;
            System.out.println("---- Failed: " + name);
        }
    }

    private static void testImplementsTransaction() {
        BankAccount acct = new BankAccount(0.0);
        boolean condition = (acct instanceof Transaction);
        check("Implements Transaction", condition);
    }

    private static void testConstructorPositive() {
        BankAccount acct = new BankAccount(100.0);
        check("Constructor sets initial balance", Math.abs(acct.getBalance() - 100.0) < 1e-9);
    }

    private static void testConstructorNegative() {
        boolean thrown = false;
        try {
            new BankAccount(-1.0);
        } catch (IllegalArgumentException ex) {
            thrown = true;
        }
        check("Constructor rejects negative initial deposit", thrown);
    }

    private static void testDepositPositive() {
        BankAccount acct = new BankAccount(50.0);
        acct.deposit(25.0);
        check("Deposit increases balance", Math.abs(acct.getBalance() - 75.0) < 1e-9);
    }

    private static void testDepositNegative() {
        BankAccount acct = new BankAccount(50.0);
        boolean thrown = false;
        try {
            acct.deposit(-10.0);
        } catch (IllegalArgumentException ex) {
            thrown = true;
        }
        check("Deposit rejects negative values", thrown);
    }

    private static void testWithdrawPositive() {
        BankAccount acct = new BankAccount(100.0);
        acct.withdraw(40.0);
        check("Withdraw decreases balance", Math.abs(acct.getBalance() - 60.0) < 1e-9);
    }

    private static void testWithdrawInsufficientFunds() {
        BankAccount acct = new BankAccount(20.0);
        boolean thrown = false;
        try {
            acct.withdraw(50.0);
        } catch (IllegalArgumentException ex) {
            thrown = true;
        }
        check("Withdraw blocks insufficient funds", thrown);
    }

    private static void testWithdrawNegative() {
        BankAccount acct = new BankAccount(20.0);
        boolean thrown = false;
        try {
            acct.withdraw(-5.0);
        } catch (IllegalArgumentException ex) {
            thrown = true;
        }
        check("Withdraw rejects negative values", thrown);
    }
}
