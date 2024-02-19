package designPatterns.adapter;

import designPatterns.adapter.thirdpartyapi.ICICIbankAPI;

public class IciciBankApiAdapterAdapter implements BankAPIAdapter {

    public ICICIbankAPI iciciBankAPI = new ICICIbankAPI ();
    @Override
    public double getBalance (String accountNum) {
//        String balance = iciciBankAPI.getBalance();
//        double doubleBalance = Double.parseDouble(balance);
        return 0;
    }

    @Override
    public boolean sendMoney (String fromAccount, String toAccount, double amount) {
        return false;
    }
}
