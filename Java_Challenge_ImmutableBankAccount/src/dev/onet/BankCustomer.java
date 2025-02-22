package dev.onet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BankCustomer {

    public static int lastCustomerId = 10_000_000;

    private final String name;
    private final int customerId;

    private final List<BankAccount> accounts = new ArrayList<>();

    public BankCustomer(String name, double checkingAmount, double savingsAmount) {
        this.name = name;
        this.customerId = lastCustomerId++;
        accounts.add(new BankAccount(BankAccount.AccountType.CHECKING, checkingAmount));
        accounts.add(new BankAccount(BankAccount.AccountType.SAVINGS, savingsAmount));
    }

    public String getName() {
        return name;
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }

    @Override
    public String toString(){
        String[] accountString = new String[accounts.size()];
        Arrays.setAll(accountString, i -> accounts.get(i).toString());
        return "Customer: %s (id:%015d)%n\t%s%n".formatted(name, customerId, String.join("\n\t", accountString));
    }
}
