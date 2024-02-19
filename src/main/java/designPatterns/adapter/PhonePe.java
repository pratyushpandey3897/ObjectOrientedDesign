package designPatterns.adapter;

public class PhonePe {
    private BankAPIAdapter bankAPIAdapter;

    public PhonePe (BankAPIAdapter bankAPIAdapter) {
        this.bankAPIAdapter = bankAPIAdapter;
    }

    double doSomething() throws InterruptedException {
        double currentBalance = bankAPIAdapter.getBalance("123");
        Thread.sleep(25*24*60*60*1000);
        return currentBalance*2;
    }
}
