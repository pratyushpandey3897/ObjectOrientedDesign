package designPatterns.adapter;

public interface BankAPIAdapter {
    double getBalance(String accountnum);
    boolean sendMoney(String fromaccount, String toaccount, double amount);
}
