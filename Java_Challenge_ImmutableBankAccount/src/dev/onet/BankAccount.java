package dev.onet;

public class BankAccount {
    private final AccountType accountType;
    private final double balance;
    public enum AccountType {CHECKING, SAVINGS}

    public BankAccount(AccountType accountType, double balance) {
        this.accountType = accountType;
        this.balance = balance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "%s $%.2f".formatted(accountType, balance);
    }
}

