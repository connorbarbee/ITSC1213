/**
 * Transaction
 * A simple interface describing the basic bank operations.
 */
public interface Transaction {
    /**
     * Returns the current account balance.
     * @return current balance
     */
    double getBalance();

    /**
     * Deposits a positive amount into the account.
     * Implementations must reject zero or negative amounts.
     *
     * @param amount the amount to deposit (must be > 0)
     * @throws IllegalArgumentException if amount <= 0
     */
    void deposit(double amount);

    /**
     * Withdraws a positive amount from the account.
     * Implementations must reject zero or negative amounts and amounts that
     * exceed the available balance.
     *
     * @param amount the amount to withdraw (must be > 0 and <= balance)
     * @throws IllegalArgumentException if amount <= 0 or amount > balance
     */
    void withdraw(double amount);
}
