package dev.onet;

public class Main {

    public static void main(String[]args){
//        BankAccount account = new BankAccount(BankAccount.AccountType.CHECKING, 500.00);
//        System.out.println(account);

        BankCustomer joe = new BankCustomer("Joe",200.00,110000.00);
        System.out.println(joe);
    }
}
