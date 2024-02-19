package designPatterns.adapter;

import designPatterns.adapter.thirdpartyapi.YesBankAPI;

public class YesBankAPIAdapterAdapter implements BankAPIAdapter {

    private YesBankAPI yesBankAPI = new YesBankAPI ();
    @Override
    public double getBalance (String accountNum) {
        return 0;
    }

    @Override
    public boolean sendMoney (String fromAccount, String toAccount, double amount) {
        return false;
    }
}
