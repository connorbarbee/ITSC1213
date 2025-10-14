/**
 * BankAccount
 * Implements a simple bank account with deposit and withdrawal operations.
 * Follows the Transaction interface and uses Java built-in exceptions to
 * signal invalid operations.
 */
public class BankAccount implements Transaction {
    /** The current balance of the account. */
    private double balance;

    /**
     * Constructs a bank account with an initial deposit.
     *
     * @param initialDeposit initial amount to set the balance
     * @throws IllegalArgumentException if initialDeposit is negative
     */
    public BankAccount(double initialDeposit) {
        if (initialDeposit < 0) {
            throw new IllegalArgumentException("Initial deposit cannot be negative.");
        }
        this.balance = initialDeposit;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double getBalance() {
        return balance;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
        System.out.println(String.format("Deposited $%.2f. New balance: $%.2f", amount, balance));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds for this withdrawal.");
        }
        balance -= amount;
        System.out.println(String.format("Withdrew $%.2f. New balance: $%.2f", amount, balance));
    }
}
